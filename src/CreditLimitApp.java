public class CreditLimitApp {
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
