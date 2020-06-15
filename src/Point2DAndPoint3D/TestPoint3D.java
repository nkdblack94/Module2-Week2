package Point2DAndPoint3D;

public class TestPoint3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D.setXYZ(3, 2, 1);
        System.out.println("setXYZ" + point3D);

        point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);
    }
}
