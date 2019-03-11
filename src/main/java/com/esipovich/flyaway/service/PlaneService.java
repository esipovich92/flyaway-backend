package com.esipovich.flyaway.service;

import com.esipovich.flyaway.dto.PlaneDetails;
import com.esipovich.flyaway.mapper.PlaneDetailsMapper;
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
    private final PlaneDetailsMapper planeDetailsMapper;

    public PlaneDetails getPlane(final Long id) {
        //Plane plane = this.planeRepository.findOne(id);
        return PlaneDetails.builder()
                .model("Boeing")
                .capacity(200)
                .maxDistance(1500)
                .build();
        //return this.planeMapper.map(plane);
    }

    public List<PlaneDetails> getAll() {
        return Collections.singletonList(
                PlaneDetails.builder()
                .model("Boeing")
                .capacity(200)
                .maxDistance(1500)
                .build());
    }
}
