package com.esipovich.flyaway.model;

/**
 * @author Artem Esipovich 1/1/19
 */

public enum PlaneStatus {
    READY("Ready"),
    IN_FLIGHT("In flight"),
    SERVICE("Service"),
    OUT("Out");

    private String value;

    PlaneStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
