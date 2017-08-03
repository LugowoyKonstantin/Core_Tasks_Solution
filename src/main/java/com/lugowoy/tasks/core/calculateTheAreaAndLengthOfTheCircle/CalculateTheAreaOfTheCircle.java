package com.lugowoy.tasks.core.calculateTheAreaAndLengthOfTheCircle;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

/** Created by Konstantin Lugowoy on 15-Dec-16. */

public class CalculateTheAreaOfTheCircle {

    public Circle calculateTheAreaOfTheCircle(Circle circle) {
        circle.setArea(PI * pow(circle.getRadius(), 2));
        return circle;
    }

}
