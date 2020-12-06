import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GasMileageTest {
    GasMileage gasMileage;
    @BeforeEach
    void setUp() {
        gasMileage = new GasMileage();
    }

    @AfterEach
    void tearDown() {
        gasMileage = null;
    }

    @Test
    void testMilesDrivenCanBeCollected(){
        gasMileage = new GasMileage();
        gasMileage.collectMilesDriven();

//        assertEquals(40, driverInput);
    }

    @Test
    void testGallonsCanBeCollected(){
        gasMileage = new GasMileage();
        gasMileage.collectGallonsUsed();
        double driverInput = gasMileage.getGallonsUsed();
        assertEquals(25, driverInput);
    }

    @Test
    void testUserEnteredSentinel(){
        gasMileage = new GasMileage();
        gasMileage.startApp();
        double driverInput = gasMileage.getGallonsUsed();
        assertEquals(0, driverInput);
    }

    @Test
    void testToCalculateMilesPerGallon(){
        gasMileage = new GasMileage();
        gasMileage.collectMilesDriven();
        gasMileage.collectGallonsUsed();
        double milesPerGallon = gasMileage.calculateMilesPerGallon();
        assertEquals(2,milesPerGallon);
    }

    @Test
    void testToCalculateAverageOfAllTrips(){
        gasMileage = new GasMileage();
        gasMileage.startApp();
    }
}