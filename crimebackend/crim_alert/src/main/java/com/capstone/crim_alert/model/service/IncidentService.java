package com.capstone.crim_alert.model.service;

import com.capstone.crim_alert.model.entities.Incident;
import com.capstone.crim_alert.model.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncidentService {
    private IncidentRepository incidentRepository;
    @Autowired

    public IncidentService(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }
    public List<Incident> getIncidents(){
        return incidentRepository.findAll();
    }
    public Optional<Incident> getIncident(Integer incidentId){
        return incidentRepository.findById(incidentId);
    }
    public void addNewIncident(Incident incident){
        incidentRepository.save(incident);
    }
    public void deleteIncident(Integer incidentId){
      incidentRepository.deleteById(incidentId);
    }
}
