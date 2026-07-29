package com.cognizant.loans.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loans")
public class LoansController {

    @GetMapping("/{number}")
    public Map<String, String> getLoans(@PathVariable("number") String accountNumber) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("number", accountNumber);
        map.put("type", "car");
        map.put("loan", "54353");
        map.put("emi", "2323");
        map.put("tenure", "18");
        return map;
    }

}
