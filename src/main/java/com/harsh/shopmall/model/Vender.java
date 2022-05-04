package com.harsh.shopmall.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vender {

    @Id
    private int venderId;

    private String venderName;

    @Column(name = "is_iso_certified")
    private ISO isIsoCertified;

    private int profitPerItem;

    private String itemName;

    public enum ISO{
        TRUE,FALSE
    }
}
