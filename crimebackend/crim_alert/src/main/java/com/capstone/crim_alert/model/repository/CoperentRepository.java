package com.capstone.crim_alert.model.repository;

import com.capstone.crim_alert.model.entities.Coperent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoperentRepository extends JpaRepository<Coperent,Integer> {
}
