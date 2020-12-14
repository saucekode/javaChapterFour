import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testIntegersAreArrangedInOrder(){
        SortArray sortArray = new SortArray();
        //given
        int[] values = {3,2,1,4,23,12};

        //when
        sortArray.arrange(values);
        //assert
    }
}