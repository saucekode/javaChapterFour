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
        assertEquals(factorial.getUserInput(), 0);
    }

    @Test
    void testFactorialOfUserInputIsGenerated(){
        Factorial factorial = new Factorial();
        factorial.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a number")));
        factorial.generateFactorial(factorial.getUserInput());
        assertEquals(120, factorial.printFactorial());
    }

    @Test
    void testMathematicalConstantIsGenerated(){
        Factorial factorial = new Factorial();
        factorial.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a number")));
        factorial.generateFactorial(factorial.getUserInput());
        assertEquals(2.6666666666666665, factorial.generateMathConstant());
    }
}