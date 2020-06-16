package inheritance.CircleAndCylinder.PointAndMoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed;
    private float ySpeed;

    public MovablePoint (){}

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint (float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed (){
        float[] result = new float[2];
        result[0] = getXSpeed();
        result[1] = getYSpeed();
        return result;
    }

    public void setSpeed (float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return super.toString() + ", xSpeed = " + getXSpeed() + ", ySpeed = " + getYSpeed();
    }
}
