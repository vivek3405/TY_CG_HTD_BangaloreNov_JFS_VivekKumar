package com.capgemini.forestrymanagementsystemjdbc.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class ContractBean implements Serializable {

    private int contractNo;
    private int custId;
    private int haulId;
    private int prodId;
    private int quantity;
    private String deliveryDate;
    
}
