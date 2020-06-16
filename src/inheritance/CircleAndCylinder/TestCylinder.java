package inheritance.CircleAndCylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setColor("blue");
        cylinder.setRadius(5);
        cylinder.setHeight(7);
        System.out.println(cylinder);

        cylinder = new Cylinder(3, "red", 12);
        System.out.println(cylinder);
    }
}
