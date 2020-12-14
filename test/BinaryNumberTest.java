import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class BinaryNumberTest {
    @Test
    void testUserInputIsABinaryNumber(){
        BinaryNumber binary = new BinaryNumber();
        binary.collectInput(JOptionPane.showInputDialog("Enter a binary number"));
        assertTrue(binary.isBinaryNumber());
    }

    @Test
    void testBinaryNumberConvertsToDecimal(){
        BinaryNumber binary = new BinaryNumber();
        binary.collectInput(JOptionPane.showInputDialog("Enter a binary number"));
        assertEquals(13, binary.convertToDecimal());
    }
}