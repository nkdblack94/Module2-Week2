package Interface;

import inheritance.CircleAndCylinder.systemOfGeometricObjects.Shape;

public class Circle extends Shape implements Colorable{
    private double radius = 1;

    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle area " + getArea() + ", Circle color = " + getColor() + " Color all four sides.. ";
    }

    @Override
    public void howToColor(String color) {
        setColor(color);
    }
}
