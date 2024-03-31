package com.example.embeddable.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;

@Embeddable
public class Address {
    public String street;

    @Embedded
    public Building building;
}
