package com.capstone.crim_alert.controller;

import com.capstone.crim_alert.model.entities.Incident;
import com.capstone.crim_alert.model.entities.Us;
import com.capstone.crim_alert.model.service.IncidentService;
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

class IncidentControllerTest {
    @Mock
    IncidentService incidentService;
    @InjectMocks
    IncidentController incidentController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetIncident() {
        when(incidentService.getIncidents()).thenReturn(Arrays.<Incident>asList(new Incident(0, "type", "address", "description", "cond", Arrays.<Us>asList(new Us(0, null, "password", null, null, 0, null)))));

        List<Incident> result = incidentController.getIncident();
        Assertions.assertEquals(Arrays.<Incident>asList(new Incident(0, "type", "address", "description", "cond", Arrays.<Us>asList(new Us(0, null, "password", null, null, 0, null)))), result);
    }

    @Test
    void testGetIncident2() {
        when(incidentService.getIncident(anyInt())).thenReturn(null);

        Optional<Incident> result = incidentController.getIncident(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testRegisterNewIncident() {
        incidentController.registerNewIncident(new Incident(0, "type", "address", "description", "cond", Arrays.<Us>asList(new Us(0, null, "password", null, null, 0, null))));
    }

    @Test
    void testDeleteIncident() {
        incidentController.deleteIncident(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme