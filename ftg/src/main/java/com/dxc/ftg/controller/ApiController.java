package com.dxc.ftg.controller;

import com.dxc.ftg.repo.CourierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.dxc.ftg.model.Courier;

import java.util.List;
import java.util.Optional;

@RestController
public class ApiController {

    @Autowired
    public CourierRepo courierRepo;
    public Courier courier;

    @GetMapping(value = "/")
    public String getPage(){
        return "Welcome";
    }

    @GetMapping(value = "/get")
    public List<Courier> getCouriers(){
        return courierRepo.findAll();
    }

    @PostMapping(value = "/post")
    public String saveUser(@RequestBody Courier courier){
        //Logger logger = Logger.getLogger(ApiController.class);
        //logger.debug("Received Courier Object:" + cour.toString());
        System.out.println(courier);
        courierRepo.save(courier);
        return "Saved...";
    }

    @PutMapping(value="update/{id}")
    public String updateCourier(@PathVariable int id, @RequestBody Courier courier){
        Courier updatedCourier = courierRepo.findById(id).get();
        updatedCourier.setCourier_Email(courier.getCourier_Email());
        updatedCourier.setCourier_Fname(courier.getCourier_Fname());
        updatedCourier.setCourier_Lname(courier.getCourier_Lname());
        updatedCourier.setCourier_Number(courier.getCourier_Number());
        updatedCourier.setCourier_password(courier.getCourier_password());
        updatedCourier.setCourier_Vehicle(courier.getCourier_Vehicle());
        courierRepo.save(updatedCourier);
        return "Updated...";
    }

    @GetMapping(value = "getby/{id}")
    public Optional<Courier> getCourierId(@PathVariable int id){
        return courierRepo.findById(id);
    }

    /*@GetMapping(value = "getcouriers/{Courier_Fname}")
    public Optional<Courier> getCourierName(@PathVariable String Courier_Fname){
        return courierRepo.findByFname(Courier_Fname);
    }*/

    /*@PostMapping(value = "/posts")
    public List<Courier> saveCourier(@RequestBody List<Courier> cours){
        return courierRepo.saveAll(cours);
        //return "Saved...";
    }*/
}
