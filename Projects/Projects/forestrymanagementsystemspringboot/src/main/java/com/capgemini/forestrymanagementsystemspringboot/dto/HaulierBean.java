package com.capgemini.forestrymanagementsystemspringboot.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="haulier")
public class HaulierBean {
	@Id
	@Column
    private int haulid;
	@Column
    private int htelno;
	@Column
    private String hname;
	@Column
    private String htown;
	@Column
    private String hpostcode;
	@Column
    private String hemail;

}
