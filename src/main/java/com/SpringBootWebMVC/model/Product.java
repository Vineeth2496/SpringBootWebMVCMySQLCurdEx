package com.SpringBootWebMVC.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prodtab")
public class Product {
	@Id
	@Column(name = "pid")
	@GeneratedValue
	private Integer prodId;
	@Column(name = "pcode")
	private String prodCode;
	@Column(name = "pcost")
	private Double prodCost;
	@Column(name = "pven")
	private String prodVen;
	@Column(name = "pnote")
	private String prodNote;
	
	@Column(name = "pgst")
	private String prodGst;
	@Column(name = "pdisc")
	private Double prodDisc;
	
}
