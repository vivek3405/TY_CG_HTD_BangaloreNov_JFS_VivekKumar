package com.capgemini.retailerapp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
@Table(name="productinfo")
public class ProductInfoBean {
	@Column
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private int quantity;
	@Column
	private String details;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="userId", referencedColumnName = "id")
	private UserInfoBean bean;
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "prodBean")
	private List<OrderInfoBean> orderInfo;

}
