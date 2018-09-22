package com.esipovich.flyaway.service;

import com.esipovich.flyaway.model.Plane;
import com.esipovich.flyaway.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Collections;
import java.util.List;

/**
 * @author Artem Esipovich 12.09.2018
 */

@Service
@Transactional
public class PlaneService {

    private final PlaneRepository planeRepository;

    @Autowired
    public PlaneService(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;

    }

    public Plane getPlane(final Long planeId) {
        return Plane.builder()
                .model("Boeing")
                .capacity(200)
                .maxDistance(1500)
                .build();
        //return this.planeRepository.getOne(planeId);
    }

    public List<Plane> getAll() {
        return Collections.singletonList(null);
    }
}
