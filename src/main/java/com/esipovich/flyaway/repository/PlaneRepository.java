package com.esipovich.flyaway.repository;

import com.esipovich.flyaway.model.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Artem Esipovich 22.09.2018
 */

public interface PlaneRepository extends JpaRepository<Plane, Long> {

}
