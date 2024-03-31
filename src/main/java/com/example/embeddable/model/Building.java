package com.example.embeddable.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class Building {
    public Integer buildingNumber;

    public Integer entranceNumber;
}
