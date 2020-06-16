package inheritance.CircleAndCylinder.Point2DAndPoint3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D (){
        super(1, 1);
        this.z = 1;
    }

    public Point3D (float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ (){
        float[] result = new float[3];
        result[0] = getX();
        result[1] = getY();
        result[2] = getZ();
        return result;
    }

    public void setXYZ (float x, float y, float z){
        setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", Z = " + getZ();
    }
}
