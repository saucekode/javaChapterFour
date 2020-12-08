import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryCalculatorTest {
    SalaryCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new SalaryCalculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

    @Test
    void testThatEmployeeHourlyRateCanBeCollected(){
        calculator = new SalaryCalculator();
        calculator.setHourlyRate();
        assertEquals(50, calculator.getHourlyRate());
    }

    @Test
    void testForDaysOfWeek(){
        calculator = new SalaryCalculator();
        calculator.setDayOfWeek(3);
        assertEquals("Wednesday", calculator.getDayOfWeek());
    }

    @Test
    void testThatCounterWorks(){
        calculator = new SalaryCalculator();
        assertEquals(5, calculator.calculateGrossPay());
    }

    @Test
    void testForHoursWorked(){
        calculator = new SalaryCalculator();
        assertEquals(3, calculator.calculateGrossPay());
    }

    @Test
    void testForPayFromHourlyRate(){
        calculator = new SalaryCalculator();
        calculator.setHourlyRate();
        assertEquals(30, calculator.calculateGrossPay());
    }

    @Test
    void testForGrossPay(){
        calculator = new SalaryCalculator();
        calculator.setHourlyRate();
        assertEquals(230, calculator.calculateGrossPay());
    }

    @Test
    void testForWhenHourIsGreaterThanForty(){
        calculator = new SalaryCalculator();
        calculator.setHourlyRate();
        assertEquals(705, calculator.calculateGrossPay());
    }

}