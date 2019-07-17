package com.ea.ecommerceshippingandtrackingservicebackend.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor
@Data
@Embeddable
public class Address {
    private String street;
    @Column(nullable = true)
    private String houseNumber;
    private String zipCode;
    private String city;
    private String state;
}
