package com.capgemini.jpawithhibernate.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.jpawithhibernate.onetoonedto.Employee;

import lombok.Data;

@Data
@Entity
@Table(name="Training_info")
public class TrainingInfo {
	@Id
	@Column
	private int tid;
	@Column
	private String tname;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name="training_employee",
	joinColumns = @JoinColumn(name="tid"),
	inverseJoinColumns=@JoinColumn(name="eid"))
	private List<Employee> eList;

}
