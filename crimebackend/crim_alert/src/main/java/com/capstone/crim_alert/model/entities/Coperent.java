package com.capstone.crim_alert.model.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table

public class Coperent {
    @Id
    private  int id;
    private String name;

    @ManyToMany
    @JoinTable(name = "Coperent_Incident",
            joinColumns = @JoinColumn(name = "Coperent_id"),
            inverseJoinColumns = @JoinColumn(name = "Incident_id"))
    private List <Incident> inc = new ArrayList<>();

    public Coperent(int id, String name, List<Incident> inc) {
        this.id = id;
        this.name = name;
        this.inc = inc;
    }

    public Coperent() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Incident> getInc() {
        return inc;
    }

    public void setInc(List<Incident> inc) {
        this.inc = inc;
    }
}
