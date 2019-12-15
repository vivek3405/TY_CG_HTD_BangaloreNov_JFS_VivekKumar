package com.capgemini.jpawithhibernate.onetoonedto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="employee_info")
public class Employee {
	@Id
	@Column
	private int  eid;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Exclude
	@OneToOne(cascade=CascadeType.ALL, mappedBy="info")
	private EmployeeOther other;

}
