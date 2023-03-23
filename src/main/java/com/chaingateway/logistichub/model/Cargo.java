package com.chaingateway.logistichub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author BaptisteMARMIER_Meri
 *
 */
@Entity
@Table(name = "cargos")
public class Cargo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "exporter_id")
	private Exporter exporter;
	
	@ManyToOne
	@JoinColumn(name = "importer_id")
	private Importer importer;

	public Cargo(Long id, String name, Exporter exporter, Importer importer) {
		super();
		this.id = id;
		this.name = name;
		this.exporter = exporter;
		this.importer = importer;
	}

	public Cargo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Exporter getExporter() {
		return exporter;
	}

	public void setExporter(Exporter exporter) {
		this.exporter = exporter;
	}

	public Importer getImporter() {
		return importer;
	}

	public void setImporter(Importer importer) {
		this.importer = importer;
	}
	
	
	
}
