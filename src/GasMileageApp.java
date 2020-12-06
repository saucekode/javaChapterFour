import javax.swing.*;

public class GasMileageApp {

    public static void main(String[] args) {
        GasMileage trip = new GasMileage();

        trip.startApp();

        double totalTripsTaken = 0;
        double totalMilesPerGallon = 0;

        while(trip.checkForSentinel() != -1){
            trip.takeTripValues();
            totalMilesPerGallon += trip.calculateMilesPerGallon();
            totalTripsTaken++;
            trip.startApp();
        }

        System.out.printf("Average of miles per gallon is %.2f", totalMilesPerGallon/totalTripsTaken);
    }
}
