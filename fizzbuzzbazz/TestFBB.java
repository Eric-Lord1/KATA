/* Test del fizzbuzzbazz */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class TestFBB {
    
    @Nested
    @DisplayName("Acceptance criteria for numbers non mutiples of three, five and seven")
    class NonMultiplesOfThreeFiveSeven {
    
        @ParameterizedTest
        @CsvSource({
            "1, 1",
            "2, 2",
            "4, 4",
            "8, 8",
            "11, 11",
            "13, 13",
        })

        public void case1(int given, String expected) {
            // Let's check the case one
            String found = FBB.evaluateFBB(given);
            assertEquals(expected,found);
        }
    
        @Test
        public void case2() {
            // Let's check the case one
            int given = 2;
            String expected = "2";
            String found = FBB.evaluateFBB(given);
            assertEquals(expected,found);
        }

        @Test
            public void case4() {
            // Let's check the case one
            int given = 4;
            String expected = "4";
            String found = FBB.evaluateFBB(given);
            assertEquals(expected,found);
        }

        @Test
        public void case8() {
            // Let's check the case one
            int given = 8;
            String expected = "8";
            String found = FBB.evaluateFBB(given);
            assertEquals(expected,found);
        }

        @Test
        public void case11() {
            // Let's check the case one
            int given = 11;
            String expected = "11";
            String found = FBB.evaluateFBB(given);
            assertEquals(expected,found);
        }
 
    }

    @Nested
    @DisplayName("Acceptance criteria for numbers mutiples of three")
    class MultiplesOfThree {
    
        @ParameterizedTest
        @ValueSource(ints = {3,6,9,12})
        public void cases(int value) {
            // Let's check the case one
            int given = value;
            String expected = "fizz";
            String found = FBB.evaluateFBB(given);
            assertEquals(expected,found);
        }        

    }
 

}
