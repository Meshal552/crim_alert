package com.capstone.crim_alert.model.service;

import com.capstone.crim_alert.model.entities.Incident;
import com.capstone.crim_alert.model.entities.Us;
import com.capstone.crim_alert.model.repository.IncidentRepository;
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

class IncidentServiceTest {
    @Mock
    IncidentRepository incidentRepository;
    @InjectMocks
    IncidentService incidentService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetIncidents() {
        List<Incident> result = incidentService.getIncidents();
        Assertions.assertEquals(Arrays.<Incident>asList(new Incident(0, "type", "address", "description", "cond", Arrays.<Us>asList(new Us(0, null, "password", null, null, 0, null)))), result);
    }

    @Test
    void testGetIncident() {
        Optional<Incident> result = incidentService.getIncident(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewIncident() {
        incidentService.addNewIncident(new Incident(0, "type", "address", "description", "cond", Arrays.<Us>asList(new Us(0, null, "password", null, null, 0, null))));
    }

    @Test
    void testDeleteIncident() {
        incidentService.deleteIncident(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme