package com.esipovich.flyaway.controller;

import com.esipovich.flyaway.dto.PlaneDetails;
import com.esipovich.flyaway.service.PlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Artem Esipovich 24.09.2018
 */

@RestController
@RequestMapping("/planes")
@RequiredArgsConstructor
public class PlaneController {

    private final PlaneService planeService;

    @GetMapping("/{id}")
    public PlaneDetails getOne(@PathVariable Long id) {
        return this.planeService.getPlane(id);
    }
}
