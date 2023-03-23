package com.chaingateway.logistichub.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chaingateway.logistichub.model.Exporter;

@Repository
public interface ExporterDao extends JpaRepository<Exporter, Long> {

}
