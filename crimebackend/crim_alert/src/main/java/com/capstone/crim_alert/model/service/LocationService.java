package com.capstone.crim_alert.model.service;

import com.capstone.crim_alert.model.entities.Location;
import com.capstone.crim_alert.model.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class LocationService {
    private LocationRepository locationRepository;
    @Autowired

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }
    public List<Location> getLocations() {
        return locationRepository.findAll();

    }
    public Optional<Location> getLocation(Integer locationId) {
        return locationRepository.findById(locationId);

    }
    public void  addNewLocation(Location location){
        locationRepository.save(location);

    }
    public void deleteLocation(Integer locationId) {
        locationRepository.deleteById(locationId);
    }
}
