package exercise;

// BEGIN
public class Segment {
    private Point beginPoint;
    private Point endPoint;

    public Segment(Point beginPoint, Point endPoint) {
        this.beginPoint = beginPoint;
        this.endPoint = endPoint;
    }
    public Point getBeginPoint() {
        return beginPoint;
    }
    public Point getEndPoint() {
        return endPoint;
    }
    public Point getMidPoint() {
        var x = (endPoint.getX() - beginPoint.getX())/2;
        var y = (endPoint.getY() - beginPoint.getY())/2;
        var midPoint = new Point(x, y);
        return midPoint;
    }

}
// END
