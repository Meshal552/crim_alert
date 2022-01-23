package com.capstone.crim_alert.controller;


import com.capstone.crim_alert.model.entities.Us;
import com.capstone.crim_alert.model.service.UsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/crime/user")
public class UsController {
    private UsService usService ;
    @Autowired

    public UsController(UsService usService) { this.usService=usService;}
    @GetMapping
    public List<Us> getUss(){return usService.getUss();}
    @GetMapping (path = "{usId}")
    public Optional<Us> getUss(@PathVariable(name = "usId") Integer usId) {
        return usService.getUs(usId);

    }

    @PostMapping(path="add")
    public void  registerNewUs(@RequestBody Us us){
        usService.addNewUs(us);
    }


    @GetMapping(path = "login")
    public String checkLogin(@RequestParam (name = "name") String name ,
                             @RequestParam (name = "password") String password ) {
        return usService.getCheck(name,password);

    }


    @DeleteMapping(path = "delete/{usId}")
    public void deleteUs(@PathVariable ("usId") Integer usId){
        usService.deleteUs(usId);
    }
}
