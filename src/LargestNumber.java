/*
* FIND THE WINNER FOR A SALES CONTEST [GET THE PERSON WHO SOLD THE HIGHEST UNITS]
* - Input values 10 times which represent the units sold by each salesperson
* - For each units entered, check the highest unit so far
* */

import javax.swing.*;

public class LargestNumber {
    private int inputUnit;

    public void requestUnitInput() {
        inputUnit = Integer.parseInt(JOptionPane.showInputDialog("Enter unit"));
    }

    public int getUnitInput() {
        return inputUnit;
    }

    public int runApp() {
        int counter = 0;
        int maximumUnit = 0;
        while(counter < 10){
            counter++;
            requestUnitInput();
            if(maximumUnit < inputUnit){
                maximumUnit = inputUnit;
            }
            System.out.println(maximumUnit + " is the highest so far");
        }
        System.out.println();
        System.out.println(maximumUnit + " is the highest unit!!!");
        return maximumUnit;
    }

    public static void main(String[] args) {
        LargestNumber largest = new LargestNumber();
        largest.runApp();
    }
}
