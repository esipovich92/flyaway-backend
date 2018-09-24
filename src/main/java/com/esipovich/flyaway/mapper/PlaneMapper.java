package com.esipovich.flyaway.mapper;

import com.esipovich.flyaway.dto.PlaneDetails;
import com.esipovich.flyaway.model.Plane;
import org.springframework.stereotype.Component;

/**
 * @author Artem Esipovich 22.09.2018
 */

@Component
public class PlaneMapper {

    public PlaneDetails map(Plane plane) {
        return PlaneDetails.builder()
                .model(plane.getModel())
                .capacity(plane.getCapacity())
                .maxDistance(plane.getMaxDistance())
                .build();
    }
}
