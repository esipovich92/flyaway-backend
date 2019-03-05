package com.esipovich.flyaway.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * @author Artem Esipovich 22.09.2018
 */

@Getter
@SuperBuilder
public class PlaneDetails {
    private final String model;
    private final int capacity;
    private final int maxDistance;

    @JsonCreator
    public PlaneDetails(
            @JsonProperty String model,
            @JsonProperty int capacity,
            @JsonProperty int maxDistance) {
        this.model = model;
        this.capacity = capacity;
        this.maxDistance = maxDistance;
    }
}
