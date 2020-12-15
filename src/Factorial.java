/*
* HOW TO IMPLEMENT THIS...
* - collect input from user
* - initialize a variable counter and set to user input
* - initialize a variable factorial and set to 0
* - while counter is greater than 0
* - compound assign values of counter by multiplication to factorial
* - decrement counter
* */

import javax.swing.*;

public class Factorial {
    private int userInput;

    public void collectUserInput(int userInput) {
        if(userInput > 0){
            this.userInput = userInput;
        }

    }

    public int getUserInput() {
        return userInput;
    }

    public int printFactorial() {
        int counter = getUserInput();
        int factorial = 1;
        while(counter > 0){
            factorial *= counter;
            counter--;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a number")));
        System.out.println("The factorial of " + factorial.getUserInput() + " is " + factorial.printFactorial());
    }
}
