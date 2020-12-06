import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditLimitTest {
    CreditLimit creditLimit;
    @BeforeEach
    void setUp() {
        creditLimit = new CreditLimit();
    }

    @AfterEach
    void tearDown() {
        creditLimit = null;
    }

    @Test
    void testNewCreditBalanceIsGreaterThanCreditLimit(){
        creditLimit = new CreditLimit();
        creditLimit.setCreditLimit();
        creditLimit.setCreditBalance();
        creditLimit.setCredits();
        creditLimit.setTotalPurchases();
        assertTrue(creditLimit.calculateNewBalance() > creditLimit.getCreditLimit());
    }
}