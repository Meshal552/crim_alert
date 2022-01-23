package com.capstone.crim_alert.controller;

import com.capstone.crim_alert.model.entities.Coperent;
import com.capstone.crim_alert.model.service.CoperentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api")
public class CoperentController {
    private CoperentService coperentService;
@Autowired
    public CoperentController(CoperentService coperentService) {
        this.coperentService = coperentService;
    }
  @GetMapping
  public List<Coperent>getCoperent()
  {
      return coperentService.getCoperents();
  }
  @GetMapping("coperentid")
    public Optional<Coperent>getCoperent(@PathVariable (name = "coperentid")Integer coperentid )
  {
      return coperentService.getCoperent(coperentid);
  }
  @PostMapping(path = "add")
    public void registerNewCoperent(@RequestBody Coperent coperent)
  {
      coperentService.addNewCoperent(coperent);
  }
  @DeleteMapping(path = "delete")
    public void deleteCoperent(@PathVariable(name = "coperentid")Integer coperentid)
  {
      coperentService.deleteCoperentid(coperentid);
  }
}
