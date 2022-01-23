package com.capstone.crim_alert.controller;


import com.capstone.crim_alert.model.entities.Location;
import com.capstone.crim_alert.model.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/crime/locations")
public class LocationController {
    private LocationService locationService ;
    @Autowired

    public LocationController(LocationService locationService) { this.locationService=locationService;}
    @GetMapping
    public List <Location> getLocations(){return locationService.getLocations();}
 @GetMapping (path = "{locationId}")
    public Optional <Location>getLocation(@PathVariable(name = "locationId") Integer locationId) {
     return locationService.getLocation(locationId);

 }

    @PostMapping(path="add")
    public void  registerNewLocation(@RequestBody Location location){
        locationService.addNewLocation(location);
    }

    @DeleteMapping(path = "delete/{locationId}")
    public void deleteLocation(@PathVariable ("locationId") Integer locationId){
        locationService.deleteLocation(locationId);
    }
}
