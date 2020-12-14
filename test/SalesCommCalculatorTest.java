import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class SalesCommCalculatorTest {
    SalesCommCalculator commCalculator;
    @BeforeEach
    void setUp() {
        commCalculator = new SalesCommCalculator();
    }

    @AfterEach
    void tearDown() {
        commCalculator = null;
    }

    @Test
    void testToCheckIfSoldItemsBeingInputtedDisplayIncrementally(){
        commCalculator = new SalesCommCalculator();
        int itemsSold = 0;
        commCalculator.startApp();
        while(commCalculator.checkForSentinel() != -1){
            commCalculator.inputItemsSold(JOptionPane.showInputDialog("Enter item sold"));
            commCalculator.inputItemPrices(Integer.parseInt(JOptionPane.showInputDialog("Enter price of item sold")));
            itemsSold++;
            commCalculator.startApp();
        }
        assertTrue(itemsSold == 3);
    }

    @Test
    void testToCheckAllItemsSoldBySalesPerson(){
        commCalculator = new SalesCommCalculator();
        String items = "";
        commCalculator.startApp();
        while(commCalculator.checkForSentinel() != -1){
            commCalculator.inputItemsSold(JOptionPane.showInputDialog("Enter item sold"));
            items += commCalculator.getItemsSold() + "\n";
            commCalculator.startApp();
        }
        System.out.println(items);
        assertEquals("bag\nshoes\n", items);
    }

    @Test
    void testToCheckPricesOfAllItemsSoldBySalesPerson(){
        commCalculator = new SalesCommCalculator();
        String priceList = "";
        commCalculator.startApp();
        while(commCalculator.checkForSentinel() != -1){
            commCalculator.inputItemPrices(Integer.parseInt(JOptionPane.showInputDialog("Enter price of item sold")));
            priceList += "$" + commCalculator.getItemPrices() + "\n";
            commCalculator.startApp();
        }

        System.out.println(priceList);

        assertEquals("$1000\n$3000\n$200\n", priceList);
    }

    @Test
    void testToCheckTotalForPricesOfItemsSold(){
        commCalculator = new SalesCommCalculator();
        int priceTotal = 0;
        commCalculator.startApp();
        while(commCalculator.checkForSentinel() != -1){
            commCalculator.inputItemPrices(Integer.parseInt(JOptionPane.showInputDialog("Enter price of item sold")));
            priceTotal += commCalculator.getItemPrices();
            commCalculator.startApp();
        }
        System.out.println(priceTotal);

        assertEquals(3000, priceTotal);
    }

    @Test
    void testToCheckIfSalaryOfSalespersonIsCorrect(){
        commCalculator = new SalesCommCalculator();
        int priceTotal = 0;
        commCalculator.startApp();
        while(commCalculator.checkForSentinel() != -1){
            commCalculator.inputItemPrices(Integer.parseInt(JOptionPane.showInputDialog("Enter price of item sold")));
            priceTotal += commCalculator.getItemPrices();
            commCalculator.startApp();
        }

        assertEquals(470, commCalculator.setSalaryForWeek(priceTotal));

    }
}