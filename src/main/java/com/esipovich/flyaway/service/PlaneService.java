package com.esipovich.flyaway.service;

import com.esipovich.flyaway.model.Plane;
import java.util.Collections;
import java.util.List;

/**
 * @author Artem Esipovich 12.09.2018
 */

public class PlaneService {

    public List<Plane> getAll() {
        return Collections.singletonList(new Plane());
    }
}
