package org.miolacnc.controllers;


import java.util.List;

import org.miolacnc.models.Miolacnc;
import org.miolacnc.services.MiolacncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value="/api/test",method = {RequestMethod.GET, RequestMethod.PUT})
@CrossOrigin(origins = "http://localhost:3000")
public class MiolacncController {


    @Autowired
    private MiolacncService service;
    
    @GetMapping("/EvsM")
    public List<Miolacnc> findAllServicesEv(){
        return service.getEvsM();
    }
    @GetMapping("/EvMId/{id}")
    public Miolacnc findprofById(@PathVariable int id){
        return service.getEvMById(id);
    }

}