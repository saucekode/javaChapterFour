import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestNumberTest {
    LargestNumber large;
    @BeforeEach
    void setUp() {
        large = new LargestNumber();
    }

    @AfterEach
    void tearDown() {
        large = null;
    }

    @Test
    void testLoopIsWorking(){
        large = new LargestNumber();
        assertEquals(10, large.runApp());
    }

    @Test
    void testForMaximumNumber(){
        large = new LargestNumber();
        assertEquals(20, large.runApp());
    }
}