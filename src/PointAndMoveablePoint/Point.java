package PointAndMoveablePoint;

public class Point {
    private float x;
    private float y;

    public Point (){}

    public Point (float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX (){
        return this.x;
    }

    public void setX (float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    public float[] getXY (){
        float[] result = new float[2];
        result[0] = getX();
        result[1] = getY();
        return result;
    }

    public void setXY (float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "X = " + getX() + ", Y = " + getY();
    }
}
