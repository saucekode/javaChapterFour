/*
* Let me get into the mind of this driver
* - The driver keeps track of several trips by recording the miles he drove
*   and the gallons of fuel he used for each tankful.
* - Probably, this driver has been keeping track of
*   all this information on paper and trying to calculate it himself, so we need to help him.
* - So, how do we help him?
* - Since he writes down the miles he drives and also the gallons he probably uses paper
* - Then, he needs to calculate his miles travelled per gallon manually and get an average of all of them
* */

/*
* - THE APPLICATION FOR JOHN THE DRIVER
*   - He can start the app by inputting any number
*   - He can end the app by inputting -1
*   - He can input the number of miles he drove
*   - He can input the gallons of fuel used for every trip
*   - Calculate miles per gallon
*   - Get the average of the trips taken
*   WE HAVE SUCCESSFULLY HELPED JOHN BUILD AN APP TO HELP HIM INPUT HIS TRIPS AND GET AN AVERAGE OF THEM ALL!!!!
* */

import javax.swing.*;

public class GasMileage {
    private double milesInput;
    private double gallonsInput;
    private int startButton;

    public void collectMilesDriven() {
        milesInput = Integer.parseInt(JOptionPane.showInputDialog("Enter miles driven per hour for this trip"));
    }

    public double getMilesDriven() {
        return milesInput;
    }

    public void collectGallonsUsed() {
        gallonsInput = Integer.parseInt(JOptionPane.showInputDialog("Enter gallons used for this trip"));
    }

    public double getGallonsUsed() {
        return gallonsInput;
    }

    public void startApp(){
        startButton = Integer.parseInt(JOptionPane.showInputDialog("Enter any number to start app and -1 to stop the app"));
    }

    public int checkForSentinel(){
        return startButton;
    }

    public double calculateMilesPerGallon(){
        return milesInput/gallonsInput;
    }

    public void takeTripValues(){
        collectMilesDriven();
        collectGallonsUsed();
    }

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