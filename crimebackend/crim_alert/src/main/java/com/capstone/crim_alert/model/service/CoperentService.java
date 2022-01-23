package com.capstone.crim_alert.model.service;

import com.capstone.crim_alert.model.entities.Coperent;
import com.capstone.crim_alert.model.repository.CoperentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CoperentService {
   @Autowired
   private CoperentRepository coperentRepository;

    public CoperentService(CoperentRepository coperentRepository) {
        this.coperentRepository = coperentRepository;
    }

    public List<Coperent>getCoperents()
    {
        return coperentRepository.findAll();
    }
    public Optional<Coperent>getCoperent(Integer coperentid)
    {
        return coperentRepository.findById(coperentid);
    }
    public void addNewCoperent(Coperent coperent)
    {
         coperentRepository.save(coperent);
    }
    public void deleteCoperentid(Integer coperentid)
    {
        coperentRepository.deleteById(coperentid);
    }
}
