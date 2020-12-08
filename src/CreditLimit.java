/*
* What are we helping this Bloom store achieve?
* - This store wants to know when a customer has exceeded their credit limit on a charge account.
* What is credit limit? This is the maximum amount you can borrow using a credit card. It is issued by the bank or credit union.
* The credit card issuer assesses your income, credit history and current debt level before issuing a credit limit
* There is credit limit and card balance
 */

/*
* - Let us say HI to Jane who purchases regularly from Bloom.
* - We want Bloom to know when Jane has exceeded her credit limit so she can't purchase anymore on credit based on her credit balance
*
* - What qualifies Jane for a store credit in Bloom?
*
* - She must:-
* ## Have an account number
* ## Have a balance at the beginning of the month
*
* - Without these two things above, she can't really do anything credit in Bloom
*
* ## Total of all the items she has charged for the month
* ## Total of all credits applied to the Jane's account for the month
* ## Her allowed credit limit
*
* HOW MIGHT WE DO THIS?
* - Input:-
* - Jane's account number
* - Her balance at the beginning of the month
* - Her purchases for the month
* - Credits applied to her account for that month
* - Her allowed credit limit
* */

import javax.swing.*;

public class CreditLimit {
    private int accountNumber;
    private int creditBalance;
    private int totalPurchases;
    private int credits;
    private int creditLimit;

    public void setAccountNumber() {
        accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter customer account number or -1 to exit app"));
    }

    public int getAccountNumber(){
        return accountNumber;
    }

    public void setCreditBalance() {
        creditBalance = Integer.parseInt(JOptionPane.showInputDialog("Enter beginning balance for the month"));
    }

    public void setTotalPurchases() {
        totalPurchases = Integer.parseInt(JOptionPane.showInputDialog("Enter total purchases for the month"));
    }

    public void setCredits() {
        credits = Integer.parseInt(JOptionPane.showInputDialog("Enter total credits for the month"));
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public int calculateNewBalance() {
        return (getCreditBalance() + getTotalPurchases()) - getCredits();
    }

    public String checkCustomerStatus(){
        String status = "";
        if(calculateNewBalance() > getCreditLimit()){
            status = "Credit limit exceeded";
        }
        return status;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public int getCredits() {
        return credits;
    }

    public int getTotalPurchases() {
        return totalPurchases;
    }

    public void setCreditLimit() {
        creditLimit = Integer.parseInt(JOptionPane.showInputDialog("Enter customer credit limit"));
    }

    public void startApp(){
        setCreditLimit();
        setCreditBalance();
        setCredits();
        setTotalPurchases();
    }

    public static void main(String[] args) {
        CreditLimit creditLimit = new CreditLimit();

        creditLimit.setAccountNumber();

        while(creditLimit.getAccountNumber() != -1){
            creditLimit.startApp();
            System.out.println(creditLimit.checkCustomerStatus());
            creditLimit.setAccountNumber();
        }
    }
}
