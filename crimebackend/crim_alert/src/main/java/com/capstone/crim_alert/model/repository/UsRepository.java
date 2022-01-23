package com.capstone.crim_alert.model.repository;

import com.capstone.crim_alert.model.entities.Us;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsRepository extends JpaRepository <Us,Integer> {

    Us findByEmail(String email);
    @Query("SELECT password FROM Us WHERE name = :name" )
    String findPasswordByname(@Param("name") String name);

    @Query("SELECT case when count(name) > 0 then true else false end from Us where name = :name")
    Boolean existsByname(@Param("name") String name);

}

