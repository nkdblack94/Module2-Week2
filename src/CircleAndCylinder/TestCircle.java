package CircleAndCylinder;

public class TestCircle extends Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        circle.setColor("blue");
        System.out.println(circle);

        circle = new Circle(5, "red");
        System.out.println(circle);
    }
}
