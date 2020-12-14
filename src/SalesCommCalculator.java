//The app is supposed the input what a person sold and output their earnings ($200 + 9% of their sales for that week)
//Basically, this app is to help prevent fraud so the company can track what salespeople sell

//HOW MIGHT WE BEGIN THIS?
/*
* - Set fixed salary of $200
* - Input full name of salesperson
* - Input items they sold (this is generated incrementally) and the price of item
* - Sum up all the prices of goods sold by salesperson and store in a variable totalEarnings
* - Calculate earning of salesperson for the week (salary + 9% of totalEarnings)
* - Print out full details of user (Full name, Items sold and price, total earnings, earning for the week)
* */

import javax.swing.*;

public class SalesCommCalculator {

    final int FIXED_SALARY = 200;
    private String firstName;
    private String lastName;
    private String items;
    private int price;
    private int startButton;

    public int checkForSentinel(){
        return startButton;
    }

    public void startApp(){
        startButton = Integer.parseInt(JOptionPane.showInputDialog("Enter any number to begin entering items and -1 to exit app"));
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        firstName = JOptionPane.showInputDialog("Enter first name");
    }

    public void setLastName() {
        lastName = JOptionPane.showInputDialog("Enter last name");
    }

    public String getLastName() {
        return lastName;
    }

    public int getItemPrices() {
        return price;
    }

    public void inputItemPrices(int newPrice) {
        price = newPrice;
    }

    public void inputItemsSold(String itemsSold) {
        items = itemsSold;
    }

    public String getItemsSold() {
        return items;
    }

    public double setSalaryForWeek(int earnings) {
         return FIXED_SALARY + (0.09 * earnings);
    }

    public static void main(String[] args) {
        SalesCommCalculator commCalculator = new SalesCommCalculator();

        String priceList = "";
        int items = 0;
        String itemList = "";
        int priceTotal = 0;

        commCalculator.setFirstName();
        commCalculator.setLastName();
        System.out.println("<<< Salesperson Report >>>" + "\n");
        System.out.println("Full Name:- " + commCalculator.getFirstName() + " " + commCalculator.getLastName());
        System.out.println("----------------------------");
        System.out.printf("%s%13s%11s%n", "Item", "Name", "Price");
        System.out.println("----------------------------");

        commCalculator.startApp();
        while(commCalculator.checkForSentinel() != -1){
            commCalculator.inputItemsSold(JOptionPane.showInputDialog("Enter item sold"));
            commCalculator.inputItemPrices(Integer.parseInt(JOptionPane.showInputDialog("Enter price of item sold")));
            commCalculator.getItemsSold();
            items++;
            itemList = commCalculator.getItemsSold();
            priceList = "$" + commCalculator.getItemPrices();
            priceTotal += commCalculator.getItemPrices();
            commCalculator.startApp();
            System.out.printf("%4s%13s%11s%n", items, itemList, priceList);
        }
        System.out.println("----------------------------");
        System.out.println("Gross Earnings = " + "$" + priceTotal);
        System.out.println("Salary for the week is:- " + "$" + commCalculator.setSalaryForWeek(priceTotal) + "cents");
        System.out.println("----------------------------");
    }
}
