import javax.swing.*;

public class Palindrome {
    private String userInput;
    private boolean isPalindrome;

    public void collectInput(String input) {
        userInput = input;
    }

    public int getInputLength() {
        return userInput.length();
    }

    public int getCharValue(int charValue) {
        return userInput.charAt(charValue);
    }

    public boolean isPalindromeNumber() {
        int count = 0;
        int secondCount = 0;
        int firstThreeNumbers = 0;
        int lastThreeNumbers = 0;
        while(count < getInputLength()){
            firstThreeNumbers += getCharValue(count);
            count++;
            if(count == 3){
                secondCount = count - 1;
                break;
            }
        }

        while(secondCount < 5){
            lastThreeNumbers += getCharValue(secondCount);
            secondCount++;
        }

        if(firstThreeNumbers == lastThreeNumbers){
            isPalindrome = true;
        }else{
            isPalindrome = false;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.collectInput(JOptionPane.showInputDialog("Enter number"));
        while(palindrome.getInputLength() < 5){
            System.out.println("Number entered is less than 5 digits");
            palindrome.collectInput(JOptionPane.showInputDialog("Enter number again"));
        }

        if(palindrome.isPalindromeNumber()){
            System.out.println("This is a palindrome number");
        }else{
            System.out.println("This is not a palindrome number");
        }
    }

}