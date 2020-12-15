import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    @Test
    void testUserInputIsCollected(){
        Factorial factorial = new Factorial();
        factorial.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a number")));
        assertEquals(3, factorial.getUserInput());
    }

    @Test
    void testUserInputIsNotANegativeNumber(){
        Factorial factorial = new Factorial();
        factorial.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a number")));
        assertEquals(6, factorial.getUserInput());
    }

    @Test
    void testFactorialOfUserInputIsGenerated(){
        Factorial factorial = new Factorial();
        factorial.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a number")));
        assertEquals(120, factorial.printFactorial());
    }
}