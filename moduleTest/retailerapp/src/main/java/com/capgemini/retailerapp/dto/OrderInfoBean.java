package com.capgemini.retailerapp.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="orderinfo")
public class OrderInfoBean {
	@Column
	@Id
	@GeneratedValue
	private int id;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId", referencedColumnName = "id")
	private UserInfoBean bean;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="product_id", referencedColumnName = "id")
	private ProductInfoBean prodBean;
	
}
