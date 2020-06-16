package inheritance.CircleAndCylinder;

public class TestCircle extends Circle {
    public TestCircle() {
        super(3.5, "indigo", false);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.5, "indigo", true);
        circle.setRadius(3);
        circle.setColor("blue");
        System.out.println(circle);

        circle = new Circle();
        System.out.println(circle);
    }
}
