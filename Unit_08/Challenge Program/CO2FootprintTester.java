/**
 * This code is to print out what was calculated in CO2Footprint and to print in the user friendly format using arrays, methods, printf statements and
 * .add methods. this code is also to specify certain variables for each family footprint. A good bit of the code that I used was from my previous codes since I created it
 * to be easily used in this code :D
 *
 * @author Annabel Hartmann
 * @version 12/6/17
 */

import java.util.ArrayList;
public class CO2FootprintTester {
    public static void main(String[] args) {

        ArrayList<CO2Footprint> footprint = new ArrayList<CO2Footprint>();
        footprint.add(new CO2Footprint(2361.34, 0.19531, 159.28, 3, true, false, true, true,  19));
        footprint.add(new CO2Footprint(3225.60, 0.33896, 200.42, 5, true, true, false, true,  7));
        footprint.add(new CO2Footprint(2875.58, 0.28753, 189.74, 4, false, false, false, true,  14));

        CO2Footprint dataRecord;
        for (CO2Footprint footPrint1 : footprint) {
            dataRecord = footPrint1;
            dataRecord.calcGrossWasteEmission();
            dataRecord.calcWasteReduction();
            dataRecord.calcNetWasteEmission();
        }

        System.out.println("|               Pounds of CO2              |       Pounds of CO2         |                     |");
        System.out.println("|               Emitted From               |       Reduced From          |                     |");
        System.out.println("|    Gas     |   Electricity   |   Waste   |   Recycling  |  New Bulbs   |    CO2 Footprint    |");
        System.out.println("|------------|-----------------|-----------|--------------|--------------|---------------------|");
        
        for(CO2Footprint footprint2 : footprint) {
            dataRecord = footprint2;
             System.out.printf("|  %8.2f  | %11.2f     | %8.2f  | %10.2f   | %9.2f    |   %11.2f       |\n", 
             dataRecord.calcPoundsCO2FromGas(), dataRecord.calcElectricityCO2(), dataRecord.calcGrossWasteEmission(),
             dataRecord.calcWasteReduction(), dataRecord.calcBulbReduction(), dataRecord.calcNetWasteEmission());
        }
        
        System.out.println("~----------------------------------------------------------------------------------------------~");
        System.out.println("Reuse! Reduce! Recycle! The Earth will thank you for it later!");
        System.out.println("I hope you have a great day! <3");
     }
}
