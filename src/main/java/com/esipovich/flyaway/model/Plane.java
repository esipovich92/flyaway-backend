package com.esipovich.flyaway.model;

import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * @author Artem Esipovich 06.09.2018
 */

@AllArgsConstructor
@Builder(builderClassName = "Builder", builderMethodName = "newBuilder")
public class Plane {

    private String model;
    private int capacity;
    private int maxDistance;

    @Override
    public String toString() {
        return this.model;
    }
}
