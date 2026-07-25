package com.cognizant.spring_learn_handson_2;

import com.cognizant.spring_learn_handson_2.controller.CountryController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class SpringLearnHandson2ApplicationTests {

	@Autowired
	private CountryController countryController;

	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
		assertNotNull(countryController);
	}

	@Test
	public void testCountry() throws Exception {
		ResultActions actions = mockMvc.perform(get("/country"));
		actions.andExpect(status().isOk());
		actions.andExpect(jsonPath("$.code").exists()).andExpect(jsonPath("$.name").exists());
	}

	@Test
	public void testGetCountryException() throws Exception {
		ResultActions actions = mockMvc.perform(get("/countries/test"));
		actions.andExpect(status().isNotFound());
		actions.andExpect(status().reason("Country not found"));
	}

}
