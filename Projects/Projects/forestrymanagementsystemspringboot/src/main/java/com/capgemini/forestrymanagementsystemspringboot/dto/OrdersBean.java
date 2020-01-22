package com.capgemini.forestrymanagementsystemspringboot.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="orders")
public class OrdersBean {
	@Id
	@Column
	@GeneratedValue
	private int orderId;
	@Column(name="product_name")
	private String pname;
	@Column
	private int quantity;

}
