package com.capgemini.retailerapp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="userinfo")
public class UserInfoBean {
	@Column
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column(unique = true, nullable= false)
	private String email;
	@Column
	private String password;
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "bean")
	private List<ProductInfoBean> productInfo;
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "bean")
	private List<OrderInfoBean> orderInfo;

}
