package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MyServiceTest {

    @Mock
    private ExternalApi api;

    @InjectMocks
    private MyService service;

    @Test
    public void testGetData() {
        when(api.getData()).thenReturn("Mock Data");
        assertEquals("Mock Data", service.getData());
    }

}
