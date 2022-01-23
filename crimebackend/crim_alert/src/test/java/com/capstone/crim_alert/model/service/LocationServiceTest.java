package com.capstone.crim_alert.model.service;

import com.capstone.crim_alert.model.entities.Location;
import com.capstone.crim_alert.model.repository.LocationRepository;
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

class LocationServiceTest {
    @Mock
    LocationRepository locationRepository;
    @InjectMocks
    LocationService locationService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetLocations() {
        List<Location> result = locationService.getLocations();
        Assertions.assertEquals(Arrays.<Location>asList(new Location(0, "address")), result);
    }

    @Test
    void testGetLocation() {
        Optional<Location> result = locationService.getLocation(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testAddNewLocation() {
        locationService.addNewLocation(new Location(0, "address"));
    }

    @Test
    void testDeleteLocation() {
        locationService.deleteLocation(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme