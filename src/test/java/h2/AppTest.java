package h2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    App c = new App();

    @Test
    void testAdd() {
        assertEquals(15, c.add(10, 5));
    }

    @Test
    void testSub() {
        assertEquals(5, c.sub(10, 5));
    }

    @Test
    void testMul() {
        assertEquals(50, c.mul(10, 5));
    }

    @Test
    void testDiv() {
        assertEquals(2, c.div(10, 5));
    }
}