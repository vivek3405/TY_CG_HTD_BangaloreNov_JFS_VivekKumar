package com.capgemini.jpawithhibernate.onetoonedto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Employee_OtherInfo")
public class EmployeeOther {
	@Id
	@Column
	private int id;
	@Column
	private String pancard;
	@Column
	private String father_name;
	@Column
	private String Mother_name;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="eid")
	private Employee info;

}
