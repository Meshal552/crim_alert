package com.capstone.crim_alert.model.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Incident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;
    private String address;
    private String description;
    private String cond;




    @ManyToMany(mappedBy = "inc")
    @JsonIgnore
    private List <Coperent> coperentMul = new ArrayList<>();
    @ManyToMany
    @JoinTable(name = "Incident_Us",
        joinColumns = @JoinColumn(name = "Incident_id"),
        inverseJoinColumns = @JoinColumn(name = "User_id"))
    private List <Us> users = new ArrayList<>();

    public Incident(int id, String type, String address, String description, String cond, List<Us> users) {
        this.id = id;
        this.type = type;
        this.address = address;
        this.description = description;
        this.cond = cond;
        this.users = users;
    }

    public Incident() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCond() {
        return cond;
    }

    public void setCond(String cond) {
        this.cond = cond;
    }

    public List<Us> getUsers() {
        return users;
    }

    public void setUsers(List<Us> users) {
        this.users = users;
    }
}