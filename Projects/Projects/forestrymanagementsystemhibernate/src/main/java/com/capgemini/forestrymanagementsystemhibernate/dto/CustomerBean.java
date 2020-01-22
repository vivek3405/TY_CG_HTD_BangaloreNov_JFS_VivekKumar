package com.capgemini.forestrymanagementsystemhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "client")
public class CustomerBean {
	@Id
	@Column
	private int custid;
	@Column
	private String telno;
	@Column
	private String cname;
	@Column
	private String town;
	@Column
	private String postcode;
	@Column
	private String email;
	@Column
	private String password;

}
