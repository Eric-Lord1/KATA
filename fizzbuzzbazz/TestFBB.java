/* Test del fizzbuzzbazz */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFBB {

    @Test
    public void case1() {
        // Let's check the case one
        int given = 1;
        int expected = 1;
        int found = FBB.evaluateFBB(given);
        assertEquals(expected,found);
    }
    
    @Test
    public void case2() {
        // Let's check the case one
        int given = 2;
        int expected = 2;
        int found = FBB.evaluateFBB(given);
        assertEquals(expected,found);
    }

    @Test
    public void case4() {
        // Let's check the case one
        int given = 4;
        int expected = 4;
        int found = FBB.evaluateFBB(given);
        assertEquals(expected,found);
    }

    @Test
    public void case8() {
        // Let's check the case one
        int given = 8;
        int expected = 8;
        int found = FBB.evaluateFBB(given);
        assertEquals(expected,found);
    }

    @Test
    public void case11() {
        // Let's check the case one
        int given = 11;
        int expected = 11;
        int found = FBB.evaluateFBB(given);
        assertEquals(expected,found);
    }

   

}
