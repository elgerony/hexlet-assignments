package exercise;

// BEGIN
public class Flat implements Home {
    final private double area;
    final private double balconyArea;
    final private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyArea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return area + balconyArea;
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

    @Override
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }
}
// END
