/*
* - Karl Corp needs an app to calculate employee gross pay
* - Karl pays straight for the first 40 hours
* - If employee works above 40 hours, then it is pay + (1/2 of pay)
* */

/*
* - THE APP
* - On start of app, ask for user first name, last name, set hourly rate
* - set a counter to 0 for counting days
* - create a variable and set to 0, this will be our grosspay
* - create a variable and set to 0, this will be rate;
* - while counter is not up to 5, keep inputting hours worked
* - then, multiply rate by hours worked
* - if hours worked is greater than 40, then (multiply rate by hours worked[pay]) plus (1/2 of multiply rate by hours worked[pay])
* - while doing this, do a compound assignment of rate to grosspay
* - print grosspay
* */

import javax.swing.*;

public class SalaryCalculator {
    private String firstName;
    private String lastName;
    private String dayOfWeek;
    private int hourlyRate;
    private int hoursWorked;

    public void setFirstName() {
        firstName = JOptionPane.showInputDialog("Enter employee first name");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName() {
        lastName = JOptionPane.showInputDialog("Enter employee last name");
    }

    public String getLastName() {
        return lastName;
    }

    public void setHourlyRate() {
        hourlyRate = Integer.parseInt(JOptionPane.showInputDialog("Enter employee hourly rate"));
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setDayOfWeek(int day) {
        if(day == 1){
            dayOfWeek = "Monday";
        }else{
            if(day == 2){
                dayOfWeek = "Tuesday";
            }else{
                if(day == 3){
                    dayOfWeek = "Wednesday";
                }else{
                    if(day == 4){
                        dayOfWeek = "Thursday";
                    }else{
                        if(day == 5){
                            dayOfWeek = "Friday";
                        }else{
                            dayOfWeek = "";
                        }
                    }
                }
            }
        }
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void inputHoursWorked(String week) {
        hoursWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter hours worked for " + week));
    }

    public int getHoursInputted() {
        return hoursWorked;
    }

    public int getPayForHourlyRate() {
        return hoursWorked * hourlyRate;
    }

    public int calculateGrossPay(){
        int counter = 0;
        int grossPay = 0;
        int totalHours = 0;
        while(counter < 5){
            counter++;
            setDayOfWeek(counter);
            inputHoursWorked(getDayOfWeek());
            totalHours += getHoursInputted();
            grossPay += getPayForHourlyRate();
        }
        if(totalHours > 40){
            grossPay = (int) (grossPay + (0.5 * grossPay));
        }
        return grossPay;
    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        calculator.setFirstName();
        calculator.setLastName();
        calculator.setHourlyRate();
        System.out.println("Full Name:- " + calculator.getFirstName() + " " + calculator.getLastName());
        System.out.println("Hourly Rate:- " + "$" + calculator.getHourlyRate() + "/hr");
        System.out.println("Gross pay for the week:- " + "$" + calculator.calculateGrossPay());

    }
}
