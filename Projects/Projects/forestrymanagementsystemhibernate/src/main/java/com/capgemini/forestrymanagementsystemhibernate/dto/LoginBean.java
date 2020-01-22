package com.capgemini.forestrymanagementsystemhibernate.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "authentication")
public class LoginBean {
	@Id
	@Column
	private String login_id;
	@Column
	private String password;
	@Column
	private String name;

}
