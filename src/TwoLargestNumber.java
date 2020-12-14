/*
 * FIND THE WINNER FOR A SALES CONTEST [GET THE PERSON WHO SOLD THE HIGHEST UNITS]
 * - Input values 10 times which represent the units sold by each salesperson
 * - For each units entered, check the highest unit so far
 * - Check for the two highest units
 * */

import javax.swing.*;

public class TwoLargestNumber {

    private int inputUnit;
    private int firstLargest;
    private int secondLargest;

    public int getFirstLargest() {
        return firstLargest;
    }

    public void setFirstLargest(int firstLargest) {
        this.firstLargest = firstLargest;
    }

    public int getSecondLargest() {
        return secondLargest;
    }

    public void setSecondLargest(int secondLargest) {
        this.secondLargest = secondLargest;
    }

    public void requestUnitInput(int userInput) {
        inputUnit = userInput;
    }

    public int getUnitInput() {
        return inputUnit;
    }

    public static void main(String[] args) {
        TwoLargestNumber twoLargest = new TwoLargestNumber();
        int counter = 0;
        while(counter < 10){
            counter++;
            twoLargest.requestUnitInput(Integer.parseInt(JOptionPane.showInputDialog("Enter unit " + counter)));
            int inputUnit = twoLargest.getUnitInput();
            int firstLarge = twoLargest.getFirstLargest();
            int secondLarge = twoLargest.getSecondLargest();

            if(inputUnit > firstLarge){
                twoLargest.setSecondLargest(firstLarge);
                twoLargest.setFirstLargest(inputUnit);
            }else if(inputUnit > secondLarge){
                twoLargest.setSecondLargest(inputUnit);
            }
        }
        System.out.println("The first largest is: " + twoLargest.getFirstLargest() + "\n" + "The second largest is: " + twoLargest.getSecondLargest());
    }


}
