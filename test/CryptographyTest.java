import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {

    @Test
    void testUserInputIsAFourDigitInteger(){
        Cryptography crypt = new Cryptography();
        crypt.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a four digit password")));
        assertEquals(2345, crypt.getUserInput());
    }

    @Test
    void testUserInputIsEncrypted(){
        Cryptography crypt = new Cryptography();
        crypt.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a four digit password")));
        assertEquals(6145, crypt.encryptNumber());
    }

    @Test
    void encryptedNumberIsDecrypted(){
        Cryptography crypt = new Cryptography();
        crypt.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a four digit password")));
        crypt.encryptNumber();
        assertEquals(7894, crypt.decryptNumber());
    }
}