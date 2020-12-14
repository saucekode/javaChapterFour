import javax.swing.*;

/*
* Get the decimal equivalent of a binary number
* - Collect input from user
* - Input should be in 0s and 1s eg 110011
* - convert binary number to decimal number
*
* - we collect user input and get the length of number
* - initialize a counter to length of inputted number
* - initialize total to 0
* - using a while loop, set counter to be greater than zero
* - decrement counter
* - separate each number using the modulo operator
* - compound assign values of each separated number raised to power [Math.pow] of the counter value to total
* - outside the while loop, print total
* */
public class BinaryNumber {

    private String userInput;
    private boolean isBinaryNumber;
    private String valueOfOne = "1";

    public void collectInput(String input) {
        userInput = input;
    }

    public int getUserInput(){
        return Integer.parseInt(userInput);
    }

    public int getLength(){
        return userInput.length();
    }

    public boolean isBinaryNumber() {
        int counter = 0;
        int totalFalse = 0;
        int totalTrue = 0;
        while(counter < getLength()){
            if(userInput.charAt(counter) > valueOfOne.charAt(0)){
                totalFalse++;
            }else if(userInput.charAt(counter) < valueOfOne.charAt(0) && userInput.charAt(counter) != 48){
                totalFalse++;
            }else{
                totalTrue++;
            }
            counter++;
        }
        if(totalFalse > totalTrue){
            isBinaryNumber = false;
        }else if(totalFalse == 0){
            isBinaryNumber = true;
        }
        return isBinaryNumber;
    }

    public int convertToDecimal() {
        int count = getLength();
        int total = 0;
        int divisor = 0;
        int modulo = 0;
        while(count > 0){
            count--;
            int powerValue = (int) Math.pow(10,count);
            divisor = getUserInput()/powerValue;
            modulo = divisor%10;
            total += Math.pow((modulo * 2), count);
        }
        return total;
    }

    public static void main(String[] args) {
        BinaryNumber binary = new BinaryNumber();
        binary.collectInput(JOptionPane.showInputDialog("Enter a binary number"));
        while(!binary.isBinaryNumber()){
            System.out.println("This is not a binary number");
            binary.collectInput(JOptionPane.showInputDialog("Enter a binary number"));
        }
        System.out.println(binary.convertToDecimal());
    }
}
