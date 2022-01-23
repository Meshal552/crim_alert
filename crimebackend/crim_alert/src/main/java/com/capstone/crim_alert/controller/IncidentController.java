package com.capstone.crim_alert.controller;

import com.capstone.crim_alert.model.entities.Incident;
import com.capstone.crim_alert.model.service.IncidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/crime/incident")
public class IncidentController {
    private IncidentService incidentService;

    @Autowired
    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }



    @GetMapping
    public List<Incident> getIncident(){
        return incidentService.getIncidents();
    }
    @GetMapping(path = "{incidentId}")
    public Optional<Incident> getIncident(@PathVariable(name = "incidentId")Integer incidentId){
        return incidentService.getIncident(incidentId);
    }
    @PostMapping(path = "add")
    public void registerNewIncident(@RequestBody Incident incident){
        incidentService.addNewIncident(incident);
    }
    @DeleteMapping(path = "delete/{incidentId}")
    public void deleteIncident(@PathVariable ("incidentId") Integer incidentId){
        incidentService.deleteIncident(incidentId);
    }
}

