package com.esipovich.flyaway.dto;

import lombok.Builder;

/**
 * @author Artem Esipovich 22.09.2018
 */

@Builder
public class PlaneDetails {
    private final Long id;
    private final String model;
    private final int capacity;
    private final int maxDistance;
}
