package com.capstone.crim_alert.controller;

import com.capstone.crim_alert.model.entities.Location;
import com.capstone.crim_alert.model.service.LocationService;
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

class LocationControllerTest {
    @Mock
    LocationService locationService;
    @InjectMocks
    LocationController locationController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetLocations() {
        when(locationService.getLocations()).thenReturn(Arrays.<Location>asList(new Location(0, "address")));

        List<Location> result = locationController.getLocations();
        Assertions.assertEquals(Arrays.<Location>asList(new Location(0, "address")), result);
    }

    @Test
    void testGetLocation() {
        when(locationService.getLocation(anyInt())).thenReturn(null);

        Optional<Location> result = locationController.getLocation(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testRegisterNewLocation() {
        locationController.registerNewLocation(new Location(0, "address"));
    }

    @Test
    void testDeleteLocation() {
        locationController.deleteLocation(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme