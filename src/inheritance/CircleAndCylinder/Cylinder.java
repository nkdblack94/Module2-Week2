package inheritance.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder (){
        super(3.5, "indigo", false);
    }

    public Cylinder (double radius, String color,double height){
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume (){
        return getArea() * getHeight();
    }

    @Override
    public String toString() {
        return  " Cylinder height = " + getHeight() + super.toString() + " A Cylinder volume = " + getVolume();
    }
}
