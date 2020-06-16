package comparator;

import inheritance.CircleAndCylinder.Cylinder;

import java.util.Arrays;
import java.util.Comparator;

public class CylinderComparatorTest {
    public static void main(String[] args) {
        Cylinder[] cylinders = new Cylinder[3];
        cylinders[0] = new Cylinder(3.2);
        cylinders[1] = new Cylinder(2, "blue", 5);
        cylinders[2] = new Cylinder();

        System.out.println("Pre-sorted");
        for (Cylinder cylinder : cylinders){
            System.out.println(cylinder.getRadius());
        }

        Comparator cylinderComparator = new CylinderComparator();
        Arrays.sort(cylinders, cylinderComparator);

        System.out.println("After-sorted");
        for (Cylinder cylinder : cylinders){
            System.out.println(cylinder);
        }
    }
}
