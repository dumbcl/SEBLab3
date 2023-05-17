import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PointBordersTest {
    private Point point;
    private double x;
    private double y;
    private double r;

    public PointBordersTest(double x, double y) {
        point = new Point(x, y);
        this.x = x;
        this.y = y;
        this.r = 5;
        point.setR(r);
        point.checkIsInCircle();
    }

    @Test
    public void testBorderPoints() {
        assertEquals(point.toString(), "The point x: " + x + " y: " + y + " Result: " + "true");
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(
                new Object[]{-5, 0},
                new Object[]{5, 0},
                new Object[]{0, 5},
                new Object[]{0, -5}
        );
    }
}
