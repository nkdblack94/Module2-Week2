package Point2DAndPoint3D;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        point2D.setXY(5, 6);
        System.out.println(point2D);

        point2D = new Point2D(2, 5);
        System.out.println(point2D);
    }
}
