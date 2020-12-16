/*
* - ENCRYPT & DECRYPT DATA
* A company wants to send data over the internet, so they need it encrypted
* - Data is transmitted as four-digit integers
* - User inputs four-digit integer and encrypt it as follows
*
* - Encrypt digit
*   -> Replace each digit of the integer with the result of adding 7 to the digit
*       and getting the remainder after dividing the value by 10
*   -> Swap the first digit with the third
*   -> Swap the second digit with the fourth
* */

import javax.swing.*;

public class Cryptography {
    private int password;
    private int encryptedValue;
    private int decryptedValue;

    public void collectUserInput(int newPassword) {
        if(String.valueOf(newPassword).length() == 4){
            password = newPassword;
        }
    }

    public int getUserInput(){
        return password;
    }

    public int getInputLength() {
        return String.valueOf(password).length();
    }

    public int encryptNumber() {
        int count = getInputLength();
        int divisor = 0;
        int modulo = 0;
        String newValue = "";
        int numberPlusSeven = 0;
        int numberRemainder = 0;
        while(count > 0){
            count--;
            int powerValue = (int) Math.pow(10,count);
            divisor = getUserInput()/powerValue;
            modulo = divisor%10;
            numberPlusSeven = modulo + 7;
            numberRemainder = numberPlusSeven%10;
            newValue += "" + numberRemainder;
        }
        String swapValues = "";
        swapValues += "" + newValue.charAt(2) + newValue.charAt(3) + newValue.charAt(0) + newValue.charAt(1);
        encryptedValue = Integer.parseInt(swapValues);
        return encryptedValue;
    }

    public int decryptNumber() {
        int encryptedNumber = encryptNumber();
        String encrypted = String.valueOf(encryptNumber());
        int count = encrypted.length();
        int divisor = 0;
        int modulo = 0;
        String decryptValue = "";
        int numberMinusSeven = 0;
        int numberRemainder = 0;
        while(count > 0){
            count--;
            int powerValue = (int) Math.pow(10,count);
            divisor = encryptedNumber/powerValue;
            modulo = divisor%10;
            if(modulo < 7){
                numberMinusSeven = (modulo + 10) - 7;
            }else{
                numberMinusSeven = modulo - 7;
            }
            numberRemainder = numberMinusSeven%10;
            decryptValue += "" + numberRemainder;
        }

        String swapValues = "";
        swapValues += "" + decryptValue.charAt(2) + decryptValue.charAt(3) + decryptValue.charAt(0) + decryptValue.charAt(1);
        decryptedValue = Integer.parseInt(swapValues);
        return decryptedValue;
    }

    public static void main(String[] args) {
        Cryptography crypt = new Cryptography();
        crypt.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a number to encrypt")));
        System.out.println(crypt.encryptNumber());
        System.out.println(crypt.decryptNumber());
    }
}
