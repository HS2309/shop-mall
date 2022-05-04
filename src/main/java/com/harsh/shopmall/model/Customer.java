package com.harsh.shopmall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    private long phoneNumber;

    private String customerName;

    private int age;

    private GENDER gender;

    private int bill_price;

    private enum GENDER{
        MALE,FEMALE
    }
}
