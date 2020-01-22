package com.capgemini.forestrymanagementsystemhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "product")
public class ProductBean {
	@Id
	@Column
	private int prodid;
	@Column
	private String pname;
	@Column
	private double pcost;
}
