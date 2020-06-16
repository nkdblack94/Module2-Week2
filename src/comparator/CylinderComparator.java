package comparator;

import inheritance.CircleAndCylinder.Cylinder;

import java.util.Comparator;

public class CylinderComparator implements Comparator<Cylinder> {
    @Override
    public int compare(Cylinder o1, Cylinder o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
