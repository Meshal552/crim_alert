package com.capstone.crim_alert.model.service;

import com.capstone.crim_alert.model.entities.Us;
import com.capstone.crim_alert.model.repository.UsRepository;
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

class UsServiceTest {
    @Mock
    UsRepository usRepository;
    @InjectMocks
    UsService usService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetCheck() {
        when(usRepository.findPasswordByname(anyString())).thenReturn("findPasswordBynameResponse");
        when(usRepository.existsByname(anyString())).thenReturn(Boolean.TRUE);

        String result = usService.getCheck("name", "password");
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testGetUss() {
        List<Us> result = usService.getUss();
        Assertions.assertEquals(Arrays.<Us>asList(new Us(0, null, "password", null, null, 0, null)), result);
    }

    @Test
    void testGetUs() {
        Optional<Us> result = usService.getUs(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewUs() {
        usService.addNewUs(new Us(0, null, "password", null, null, 0, null));
    }

    @Test
    void testDeleteUs() {
        usService.deleteUs(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme