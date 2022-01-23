package com.capstone.crim_alert.controller;

import com.capstone.crim_alert.model.entities.Us;
import com.capstone.crim_alert.model.service.UsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class UsControllerTest {
    @Mock
    UsService usService;
    @InjectMocks
    UsController usController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUss() {
        when(usService.getUss()).thenReturn(Arrays.<Us>asList(new Us(0, null, "password", null, null, 0, null)));

        List<Us> result = usController.getUss();
        Assertions.assertEquals(Arrays.<Us>asList(new Us(0, null, "password", null, null, 0, null)), result);
    }

    @Test
    void testGetUss2() {
        when(usService.getUs(anyInt())).thenReturn(null);

        Optional<Us> result = usController.getUss(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testRegisterNewUs() {
        usController.registerNewUs(new Us(0, null, "password", null, null, 0, null));
    }

    @Test
    void testCheckLogin() {
        when(usService.getCheck(anyString(), anyString())).thenReturn("getCheckResponse");

        String result = usController.checkLogin("name", "password");
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testDeleteUs() {
        usController.deleteUs(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme