package com.capgemini.forestrymanagementsystemjdbc.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class HaulierBean implements Serializable {
	
    private int haulid;
    private int htelno;
    private String hname;
    private String htown;
    private String hpostcode;
    private String hemail;

}
