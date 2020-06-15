package triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle = new Triangle(2, 3, 4, "blue",true);
        System.out.println(triangle);
    }
}
