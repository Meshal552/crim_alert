package com.capstone.crim_alert.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Us {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name ;
    private String password;
    @Column(unique = true)
    private  String email;
    private  String gender;
    private  int phone;
    private  String address;

    @ManyToMany(mappedBy = "users")
    @JsonIgnore
    private List <Incident> incidentMul = new ArrayList<>();

    public Us(int id, String name,String password, String email, String gender, int phone, String address) {
        this.id = id;
        this.name = name;

        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
    }

    public Us(String password, String email) {
        this.password = password;
        this.email = email;
    }

    public Us() {
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

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Incident> getIncidentMul() {
        return incidentMul;
    }

    public void setIncidentMul(List<Incident> incidentMul) {
        this.incidentMul = incidentMul;
    }

}
