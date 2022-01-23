package com.capstone.crim_alert.model.repository;


import com.capstone.crim_alert.model.entities.Incident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentRepository extends JpaRepository<Incident,Integer> {
}
