/**
 * This code is to define the monthly bill and monthly price. I used arrays, printfstatements, and .add() methods. 
 * This code prints my average monthy bill and price along with the annual amount of CO2 emmision I produce. 
 *
 * @author Annabel Hartmann
 * @version 12/4/17
 */

import java.util.ArrayList;
public class CO2FromElectricityTester {
    public static void main(String[] args) {
        CO2FromElectricity c02Electric = new CO2FromElectricity();

        ArrayList<Double> monthlyBill = new ArrayList();

        monthlyBill.add(2.61);
        monthlyBill.add(27.42);
        monthlyBill.add(14.53);
        monthlyBill.add(14.53);
        monthlyBill.add(14.03);
        monthlyBill.add(15.03);
        monthlyBill.add(16.03);
        monthlyBill.add(16.03);
        monthlyBill.add(16.03);
        monthlyBill.add(15.03);
        monthlyBill.add(14.53);
        monthlyBill.add(14.53);

        ArrayList<Double>monthlyPrice = new ArrayList();
        
        monthlyPrice.add(2.61/512); //Jump in price because we removed our solar panels
        monthlyPrice.add(27.42/526);
        monthlyPrice.add(14.53/407);
        monthlyPrice.add(14.53/402);
        monthlyPrice.add(14.03/332);
        monthlyPrice.add(15.03/354);
        monthlyPrice.add(16.03/456);
        monthlyPrice.add(16.03/443);
        monthlyPrice.add(16.03/462);
        monthlyPrice.add(15.03/344);
        monthlyPrice.add(14.53/404);
        monthlyPrice.add(14.53/408);

        double avgPrice = c02Electric.calcAveragePrice(monthlyPrice);
        double avgBill = c02Electric.calcAverageBill(monthlyBill);
        double CO2EM = c02Electric.calcElectricityCO2(avgBill, avgPrice);

        System.out.printf("Average Monthly Electricity Bill: %5.2f%n", avgBill);
        System.out.printf("Average Monthly Electricity Price: %3.2f%n", avgPrice);
        System.out.printf("Annual CO2 Emissions from Electricity Usage: %5.1f%n pounds",CO2EM);

    }

}
