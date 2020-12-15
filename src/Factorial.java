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
    private double factorial;

    public void collectUserInput(int userInput) {
        if(userInput > 0){
            this.userInput = userInput;
        }

    }

    public int getUserInput() {
        return userInput;
    }

    public void generateFactorial(int expectedNumber){
        int counter = expectedNumber;
        double factorial = 1;
        while(counter > 0){
            factorial *= counter;
            counter--;
        }
        this.factorial = factorial;
    }

    public double printFactorial() {
        return factorial;
    }

    public double generateMathConstant() {
        int eCounter = 0;
        int temp = getUserInput();
        double e = 0;
        while(eCounter < temp){
            generateFactorial(temp);
            temp--;
            e += 1/printFactorial();
        }
        e = e + 1;
        return e;
    }


    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.collectUserInput(Integer.parseInt(JOptionPane.showInputDialog("Enter a number")));
        factorial.generateFactorial(factorial.getUserInput());
        System.out.println("The factorial of " + factorial.getUserInput() + " is " + factorial.printFactorial());
        System.out.printf("The Math constant of %d is %.2f", factorial.getUserInput(), factorial.generateMathConstant());
    }

}
