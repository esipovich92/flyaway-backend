package com.esipovich.flyaway.service;

import com.esipovich.flyaway.dto.PlaneDetails;
import com.esipovich.flyaway.mapper.PlaneMapper;
import com.esipovich.flyaway.model.Plane;
import java.util.Collections;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * @author Artem Esipovich 12.09.2018
 */

@RequiredArgsConstructor
@Service
public class PlaneService {

    //private final PlaneRepository planeRepository;
    private final PlaneMapper planeMapper;

    public PlaneDetails getPlane(final Long id) {
        //Plane plane = this.planeRepository.findOne(id);
        return PlaneDetails.builder()
                .model("Boeing")
                .capacity(200)
                .maxDistance(1500)
                .build();
        //return this.planeMapper.map(plane);
    }

    public List<Plane> getAll() {
        return Collections.singletonList(null);
    }
}
