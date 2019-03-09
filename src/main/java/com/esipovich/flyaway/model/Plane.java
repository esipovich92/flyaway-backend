package com.esipovich.flyaway.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.EnumType;

/**
 * @author Artem Esipovich 06.09.2018
 */

@AllArgsConstructor
@Getter
@SuperBuilder
@Entity
public class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private int capacity;
    private int maxDistance;
    @Enumerated(EnumType.STRING)
    private PlaneStatus status = PlaneStatus.READY;

    @Override
    public String toString() {
        return this.model;
    }
}
