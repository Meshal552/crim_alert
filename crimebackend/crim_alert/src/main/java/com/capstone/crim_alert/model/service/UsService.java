package com.capstone.crim_alert.model.service;

import com.capstone.crim_alert.model.entities.Us;
import com.capstone.crim_alert.model.repository.UsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsService {

    private UsRepository usRepository;
    @Autowired
    public UsService(UsRepository usRepository) {
        this.usRepository = usRepository;
    }

    public String getCheck(String name ,String password) {
        if( usRepository.existsByname(name) ){
            String pass = usRepository.findPasswordByname(name);
            if (pass.equals(password)){
                return "authenticated" ;
            }
            else {
                return "Password does not match"; }
        }

        return "name not found";
    }






    public List<Us> getUss() {
        return usRepository.findAll();
    }
    public Optional<Us> getUs(Integer usId) {
        return usRepository.findById(usId);

    }
    public void  addNewUs(Us us){
        usRepository.save(us);

    }
    public void deleteUs(Integer usId) {
        usRepository.deleteById(usId);
    }
}
