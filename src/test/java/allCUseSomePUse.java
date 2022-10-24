import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/*
Branch Coverage Criterion
 */

public class allCUseSomePUse {

    @Test
    public void test1() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(3, 5);
        assertTrue(result);
    }

    @Test
    public void test2() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(0, -5);
        assertFalse(result);
    }

    @Test
    public void test3() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(3, 2);
        assertTrue(result);
    }

    @Test
    public void test4() {
        Rectangle rectangle = new Rectangle();
        boolean result = rectangle.isBelongRectangle(3, 7);
        assertFalse(result);
    }
}
