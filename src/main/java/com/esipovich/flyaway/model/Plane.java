package com.esipovich.flyaway.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * @author Artem Esipovich 06.09.2018
 */

@AllArgsConstructor
@Getter
@SuperBuilder
public class Plane {

    private String model;
    private int capacity;
    private int maxDistance;

    @Override
    public String toString() {
        return this.model;
    }
}
