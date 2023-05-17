package main;

public class Point {
    private double x;
    private double y;
    private double r;
    private boolean res;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public boolean getRes() {
        return res;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setR(double r) {
        if (r > 0) {
            this.r = r;
        } else {
            throw new NullPointerException();
        }
    }

    @Override
    public String toString() {
        return "The point x: " + this.x + " y: " + this.y + " Result: " + this.res;
    }

    public void checkIsInCircle() {
        if (x * x + y * y <= r * r) {
            res = true;
        } else {
            res = false;
        }
    }
}
