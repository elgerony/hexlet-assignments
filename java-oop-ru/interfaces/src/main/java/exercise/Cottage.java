package exercise;

// BEGIN
public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
    @Override
    public String toString() {
        return floorCount + " этажный коттедж площадью " + area + " метров";
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public int compareTo(Home another) {
        double anotherTotalArea = another.getArea();
        double thisTotalArea = getArea();

        if (thisTotalArea > anotherTotalArea) {
            return 1;
        } else if (thisTotalArea < anotherTotalArea) {
            return -1;
        } else {
            return 0;
        }
    }
}
// END
