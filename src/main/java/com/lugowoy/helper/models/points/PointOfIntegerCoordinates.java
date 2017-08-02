package com.lugowoy.helper.models.points;

/** Created by Konstantin Lugowoy on 31.07.2017. */

public class PointOfIntegerCoordinates extends Point<Integer> {

    private static final int DEFAULT_VALUE_INTEGER_COORDINATES = 0;

    private PointOfIntegerCoordinates() {
    }

    private PointOfIntegerCoordinates(Integer coordinateX, Integer coordinateY) {
        super(coordinateX, coordinateY);
        super.setCoordinateX(DEFAULT_VALUE_INTEGER_COORDINATES);
        super.setCoordinateY(DEFAULT_VALUE_INTEGER_COORDINATES);
    }

    public static PointOfIntegerCoordinates getInstancePointOfIntegerCoordinates() {
        return new PointOfIntegerCoordinates();
    }

    public static PointOfIntegerCoordinates getInstancePointOfIntegerCoordinates(Integer coordinateX, Integer coordinateY) {
        return new PointOfIntegerCoordinates(coordinateX, coordinateY);
    }

}