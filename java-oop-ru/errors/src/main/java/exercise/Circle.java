package exercise;

import exercise.exception.CustomException;

// BEGIN
public class Circle {
    private Point point;
    private int radius;
    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSquare() throws NegativeRadiusException {
        if (radius < 0) {
            throw new NegativeRadiusException("001");
        }
        return radius * radius * Math.PI;
    }

}
// END
