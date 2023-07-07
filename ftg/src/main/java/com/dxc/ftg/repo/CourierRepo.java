package com.dxc.ftg.repo;

import com.dxc.ftg.model.Courier;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourierRepo extends JpaRepository<Courier, Integer> {

    //Optional<Courier> findByFname(String Courier_Fname);
}