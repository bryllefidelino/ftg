package com.dxc.ftg.repo;

import com.dxc.ftg.model.Courier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CourierRepo extends JpaRepository<Courier, Integer> {

}