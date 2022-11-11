package exercise;

// BEGIN
public class Cottage implements Home{

    double area;
    int floor;

    public Cottage(double area, int floor) {
        this.area = area;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return this.area;
    }

    @Override
    public int compareTo(Home another) {
        if (this.getArea() > another.getArea()) {
            return 1;
        } else if (this.getArea() < another.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return floor + " этажный коттедж площадью " + area + " метров";
    }
}
// END
