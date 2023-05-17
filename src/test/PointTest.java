package test;

import main.Point;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    private Point point;

    @Before
    public void create() {
        point = new Point(0, 0);
    }

    @After
    public void resetPoint() {
        point = null;
    }

    @Test
    public void testInsidePoints() {
        point.setR(5);
        for (double i = -2.5; i <= 2.5; i += 0.1) {
            for (double j = -2.5; j <= 2.5; j += 0.1) {
                point.setX(i);
                point.setY(j);
                point.checkIsInCircle();
                assertEquals(point.toString(), "The point x: " + i + " y: " + j + " Result: " + "true");
            }
        }
    }

    @Test
    public void testOutsidePoints() {
        point.setR(1);
        for (double i = -5; i <= -2; i += 0.1) {
            for (double j = -5; j <= -2; j += 0.1) {
                point.setX(i);
                point.setY(j);
                point.checkIsInCircle();
                assertEquals(point.toString(), "The point x: " + i + " y: " + j + " Result: " + "false");
            }
        }
    }

    @Test
    public void testRandomPoints() {
        double x, y;
        int r;
        String testResult;
        for (int i = 0; i < 100; i++) {
            x = Math.random() * 10;
            y = Math.random() * 10;
            r = (int) (Math.random() * 10) + 1;
            point.setX(x);
            point.setY(y);
            point.setR(r);
            if (x * x + y * y <= r * r) {
                testResult = "The point x: " + x + " y: " + y + " Result: " + "true";
            } else {
                testResult = "The point x: " + x + " y: " + y + " Result: " + "false";
            }
            point.checkIsInCircle();
            assertEquals(point.toString(), testResult);
        }
    }

    @Test(expected = NullPointerException.class)
    public void testNegativeRadius() {
        point.setR(-1);
    }

    @Test(expected = NullPointerException.class)
    public void testZeroRadius() {
        point.setR(0);
    }
}
