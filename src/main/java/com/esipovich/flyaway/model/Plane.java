package com.esipovich.flyaway.model;

/**
 * @author Artem Esipovich 06.09.2018
 */

public class Plane {

    private String model;
    private int capacity;
    private int maxDistance;

    @Override
    public String toString() {
        return this.model;
    }
}
