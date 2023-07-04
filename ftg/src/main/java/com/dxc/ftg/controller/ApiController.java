package com.dxc.ftg.controller;

import com.dxc.ftg.model.Courier;
import com.dxc.ftg.repo.CourierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Service
public class ApiController {

    @Autowired
    private CourierRepo courierRepo;
    private Courier courier;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/getcouriers")
    public List<Courier> getUsers(){
        return courierRepo.findAll();
    }

    @PostMapping(value = "/post")
    public String saveCourier(@RequestBody Courier courier){
        //Logger logger = Logger.getLogger(ApiController.class);
        //logger.debug("Received Courier Object:" + cour.toString());
                
        courierRepo.save(courier);
        return "Saved...";
    }


    /*@PostMapping(value = "/posts")
    public List<Courier> saveCourier(@RequestBody List<Courier> cours){
        return courierRepo.saveAll(cours);
        //return "Saved...";
    }*/
}
