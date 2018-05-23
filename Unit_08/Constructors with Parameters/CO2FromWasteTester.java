/**
 * This code is to print out the booleans for the different household waste. It also prints total emission, reduction and net emission of CO2 in l
 *
 * @author Annabel Hartmann
 * @version 12/5/17
 */

import java.util.ArrayList;
public class CO2FromWasteTester {
    public static void main(String[] args) {

        ArrayList<CO2FromWaste> cO2 = new ArrayList<CO2FromWaste>();
        cO2.add(new CO2FromWaste(3, true, false, true, true));
        cO2.add(new CO2FromWaste(5, true, true, false, true));
        cO2.add(new CO2FromWaste(4, false, false, false, true));
        cO2.add(new CO2FromWaste(6, true, true, true, true));
        cO2.add(new CO2FromWaste(1, true, false, true, false));

        CO2FromWaste dataRecord;
        for (CO2FromWaste aCO2waste : cO2) {
            dataRecord = aCO2waste;
            dataRecord.calcGrossWasteEmission();
            dataRecord.calcWasteReduction();
            dataRecord.calcNetWasteEmission();
        }

        System.out.println("|       |        |                                         |              Pounds of CO2            |");
        System.out.println("|       |        |         Household Waste Recycled        |   Total    |             |    Net     |");
        System.out.println("| Index | People |   Paper  | Plastic  |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
        System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");
        
        for(int index = 0; index < cO2.size(); index++) {
            dataRecord = cO2.get(index);
            System.out.printf("|   %1d   |   %2d   |   %-5b  |  %-5b   |  %-5b  |  %-5b  |  %8.2f  |   %7.2f   |   %7.2f  |%n", index,
             dataRecord.getNumberOfPeople(), dataRecord.getRecyclingPaper(), dataRecord.getRecyclingPlastic(), dataRecord.getRecyclingGlass(),
             dataRecord.getRecyclingCans(), dataRecord.getGrossWasteEmission(),dataRecord.getWasteReduction(), dataRecord.getNetWasteEmission());
        }
        System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");
        System.out.println("Reuse! Reduce! Recycle! The Earth will thank you for it later!");
    }

}
