package Interface;

import inheritance.CircleAndCylinder.systemOfGeometricObjects.Rectangle;

public class Square extends Rectangle implements Colorable{
    public Square (){}

    public Square (double side){
        super(side, side);
    }

    public Square (double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide (){
        return getWidth();
    }

    public void setSide (double side){
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String toString() {
        return "A Square area = " + getArea() + ", Square color = " + getColor() + " Color all four sides.. ";
    }

    @Override
    public void howToColor(String color) {
        setColor(color);
    }
}
