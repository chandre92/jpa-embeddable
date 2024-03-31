package com.example.embeddable.model;

import jakarta.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue
    public Integer id;

    public String name;

    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "mainAddress_street")),
            @AttributeOverride(name = "building.buildingNumber", column = @Column(name = "mainAddress_building_number")),
            @AttributeOverride(name = "building.entranceNumber", column = @Column(name = "mainAddress_entrance_number"))
    })
    @Embedded
    public Address mainAddress;

    @AttributeOverrides({
            @AttributeOverride(name = "street", column = @Column(name = "secondAddress_street")),
            @AttributeOverride(name = "building.buildingNumber", column = @Column(name = "secondAddress_building_number")),
            @AttributeOverride(name = "building.entranceNumber", column = @Column(name = "secondAddress_entrance_number"))
    })
    @Embedded
    public Address secondAddress;
}
