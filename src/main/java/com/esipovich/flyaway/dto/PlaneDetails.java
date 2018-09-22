package com.esipovich.flyaway.dto;

import lombok.experimental.SuperBuilder;

/**
 * @author Artem Esipovich 22.09.2018
 */

@SuperBuilder
public class PlaneDetails {
    private final String model;
    private final int capacity;
    private final int maxDistance;
}
