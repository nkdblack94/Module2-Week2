package inheritance.CircleAndCylinder.triangle;

import inheritance.CircleAndCylinder.systemOfGeometricObjects.Shape;

public class Triangle extends Shape{
    private double size1 = 1;
    private double size2 = 1;
    private double size3 = 1;

    public Triangle (){}

    public Triangle (double side1, double side2, double side3, String color, boolean filled){
        super(color, filled);
        this.size1 = side1;
        this.size2 = side2;
        this.size3 = side3;
    }

    public double getSize1() {
        return size1;
    }

    public void setSize1(double size1) {
        this.size1 = size1;
    }

    public double getSize2() {
        return size2;
    }

    public void setSize2(double size2) {
        this.size2 = size2;
    }

    public double getSize3() {
        return size3;
    }

    public void setSize3(double size3) {
        this.size3 = size3;
    }

    public double getPerimeter (){
        return this.getSize1() + this.getSize2() + this.getSize3();
    }

    public double getArea (){
        double area;
        double p = this.getPerimeter();
        area = Math.sqrt(p *(p - this.getSize1()) * (p - this.getSize2()) * (p - this.getSize3()));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle side1 = " + getSize1()
                + ", Triangle side2 = " + getSize2()
                + ", Triangle side3 = " + getSize3()
                + ", Perimeter = " + getPerimeter()
                + ", Area = " + getArea()
                + super.toString();
    }
}
