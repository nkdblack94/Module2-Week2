package comparable;

import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3];
        comparableCircles[0] = new ComparableCircle();
        comparableCircles[1] = new ComparableCircle(8);
        comparableCircles[2] = new ComparableCircle(5, "blue", true);

        System.out.println("pre sorted");
        for (ComparableCircle arr : comparableCircles){
            System.out.println(arr);
        }

        Arrays.sort(comparableCircles);

        System.out.println("after sorted");
        for (ComparableCircle arr : comparableCircles){
            System.out.println(arr);
        }
    }
}
