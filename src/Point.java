public class Point {
    private double x;
    private double y;
    private double z;
    private String c;

    public Point(double x, double y, double z, String c) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.c = c;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
}
