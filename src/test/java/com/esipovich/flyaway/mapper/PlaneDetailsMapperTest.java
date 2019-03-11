package com.esipovich.flyaway.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import com.esipovich.flyaway.dto.PlaneDetails;
import com.esipovich.flyaway.model.Plane;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * @author Artem Esipovich 3/11/19
 */

@ExtendWith(MockitoExtension.class)
class PlaneDetailsMapperTest {

    private static final String MODEL = "model";
    private static final int CAPACITY = 100;
    private static final int MAX_DISTANCE = 1500;

    @Mock
    private Plane plane;

    @InjectMocks
    private PlaneDetailsMapper planeDetailsMapper;

    @Test
    void should_MapPlaneToPlaneDetails() {
        when(plane.getModel()).thenReturn(MODEL);
        when(plane.getCapacity()).thenReturn(CAPACITY);
        when(plane.getMaxDistance()).thenReturn(MAX_DISTANCE);

        PlaneDetails planeDetails = planeDetailsMapper.map(plane);

        assertEquals(planeDetails.getModel(), MODEL);
        assertEquals(planeDetails.getCapacity(), CAPACITY);
        assertEquals(planeDetails.getMaxDistance(), MAX_DISTANCE);
    }
}
