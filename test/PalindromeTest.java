import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void testUserInputLength(){
        Palindrome palindrome = new Palindrome();
        palindrome.collectInput(JOptionPane.showInputDialog("Enter number"));
        assertEquals(5, palindrome.getInputLength());
    }

    @Test
    void testUserInputAboveFiveNumberThrowsAnError(){
        Palindrome palindrome = new Palindrome();
        palindrome.collectInput(JOptionPane.showInputDialog("Enter number"));
        while(palindrome.getInputLength() < 5){
            System.out.println("The number you entered is less than 5");
            palindrome.collectInput(JOptionPane.showInputDialog("Enter number again"));
        }
        assertEquals(5, palindrome.getInputLength());
    }

    @Test
    void testIfIndexPositionOfStringIsCorrect(){
        Palindrome palindrome = new Palindrome();
        palindrome.collectInput(JOptionPane.showInputDialog("Enter number"));
        while(palindrome.getInputLength() < 5){
            System.out.println("The number you entered is less than 5");
            palindrome.collectInput(JOptionPane.showInputDialog("Enter number again"));
        }
        assertEquals(55, palindrome.getCharValue(2));
    }

    @Test
    void testNumberIsPalindrome(){
        Palindrome palindrome = new Palindrome();
        palindrome.collectInput(JOptionPane.showInputDialog("Enter number"));
        while(palindrome.getInputLength() < 5){
            System.out.println("The number you entered is less than 5");
            palindrome.collectInput(JOptionPane.showInputDialog("Enter number again"));
        }
        assertTrue(palindrome.isPalindromeNumber());
    }
}