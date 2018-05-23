/**
 * Write a description of class CarV7Tester here.
 *
 * @author Annabel Hartmann
 * @version 11/29/2017
 */
public class CarV7Tester
{
    public static void main(String[] args) {
        
        String carType1 = "2015 Ford Expedition EL"; //This section is for the family car information
        int sMiles1 = 90084;
        int eMiles1 = 90491;
        double gUsed1 = 13.5;
        double pPG1 =  2.76;
       
        String carType2 = "2015 BMW i8"; //This section is for a hybrid car
        int sMiles2 = 1100;
        int eMiles2 = 1289;
        double gUsed2 = 12.2;
        double pPG2 =  3.19;
        
        String carType3 = "2017 Mercedes-Benz AMG G65"; //This section is for a jeep that has horrid MPG
        int sMiles3 = 20300;
        int eMiles3 = 20647;
        double gUsed3 = 15.8;
        double pPG3 =  3.19;
        
        CarV7 car1 = new CarV7(); //Section to call for calculations for the family car
        int distance1 = car1.calcMileage(eMiles1, sMiles1);
        double mpg = car1.calcMPG(distance1, gUsed1);
        double cost1 = car1.totalCost(gUsed1, pPG1);
        double gpm = car1.calcGPM(gUsed1, distance1);
        
        CarV7 car2 = new CarV7(); //Section to call for calculations for the hybrid car
        int distance2 = car1.calcMileage(eMiles2, sMiles2);
        double mpg2 = car1.calcMPG(distance2, gUsed2);
        double cost2 = car1.totalCost(gUsed2, pPG2);
        double gpm2 = car1.calcGPM(gUsed2, distance2);
        
        
        CarV7 car3 = new CarV7(); //Section to call for the calculations for the jeep
        int distance3 = car1.calcMileage(eMiles3, sMiles3);
        double mpg3 = car1.calcMPG(distance3, gUsed3);
        double cost3 = car1.totalCost(gUsed3, pPG3);
        double gpm3 = car1.calcGPM(gUsed3, distance3);
        
        System.out.println("                                       Gas Mileage Calculations                     ");
        System.out.println("");
        System.out.println("     Type of Car         Start Miles   End Miles   Distance   Gallons   Price   Cost   Miles/Gal  Gallons/Mi");
        System.out.println("~---------------------------------------------------------------------------------------------------------------~");
        System.out.printf("%s %9d %12d       %d       %.1f     %.2f %7.1f %8.1f %11.3f\n", carType1, sMiles1, eMiles1, distance1, gUsed1, pPG1, cost1, mpg, gpm);
        System.out.printf("%s %20d %12d       %d        %.1f     %.2f %7.1f %8.1f %11.3f\n", carType2, sMiles2, eMiles2, distance2, gUsed2, pPG2, cost2, mpg2, gpm2);
        System.out.printf("%s %6d %12d       %d       %.1f     %.2f %7.1f %8.1f %11.3f\n", carType3, sMiles3, eMiles3, distance3, gUsed3, pPG3, cost3, mpg3, gpm3);

    }
}
