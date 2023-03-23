package com.chaingateway.logistichub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chaingateway.logistichub.model.Cargo;

@Repository
public interface CargoDao extends JpaRepository<Cargo, Long> {

}
