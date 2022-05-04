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
public class Staff {

    @Id
    private int id;

    private long phoneNumber;

    private String employeeName;

    private String position;

    private int age;

    private GENDER gender;

    private int salary;

    private enum GENDER{
        MALE,FEMALE
    }
}
