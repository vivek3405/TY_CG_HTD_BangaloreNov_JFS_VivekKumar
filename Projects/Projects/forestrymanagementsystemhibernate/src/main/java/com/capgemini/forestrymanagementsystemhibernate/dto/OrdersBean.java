package com.capgemini.forestrymanagementsystemhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class OrdersBean {
	@Id
	@Column(name = "product_name")
	private String pname;
	@Column
	private int quantity;

}
