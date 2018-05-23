/**
 * This program is the other part of the Annual Fuel Use. It uses doubles, ints, static methods, arrays and printf statements.
 * 
 * @author Annabel Hartmann
 * @version 11/30/17
 */
public class AnnualFuelUseTester
{
    public static void main(String[] args)
    {
        int[] gasFillUps = new int[]{1, 2, 3, 4};
        int [] startMiles = {90084, 90129, 90159, 90201};
        int [] endMiles = { 90129, 90159, 90201, 90281};
        
        double[] fillDay = {1, 5, 9, 13},
                 gUsed = { 13.5, 12.1, 14.3, 12.5},
                 pPG = {2.76, 2.37, 2.37, 2.37},
                 MPG = new double[startMiles.length],
                 totalCost = new double[startMiles.length],
                 distance = new double[startMiles.length];
                        
        double minMPG, minPrice, maxMPG, maxPrice, minMileage, maxMileage, totalMileage, annualMileage, totalGUsed, totalSum, totalMPGA, 
               totalFillDay, annualGUsed, annualCost, annualMPG;
               
        AnnualFuelUse[] gas = {
            new AnnualFuelUse(gasFillUps[0], endMiles[0], startMiles[0], gUsed[0], pPG[0]),
            new AnnualFuelUse(gasFillUps[1], endMiles[1], startMiles[1], gUsed[1], pPG[1]),
            new AnnualFuelUse(gasFillUps[2], endMiles[2], startMiles[2], gUsed[2], pPG[2]),
            new AnnualFuelUse(gasFillUps[3], endMiles[3], startMiles[3], gUsed[3], pPG[3]),
        };
        
        for(int index = 0; index < gas.length; index++){
            distance[index] = gas[index].calculateMileage();
            MPG[index] = gas[index].calculateMPG();
            totalCost[index] = gas[index].calculateCost();
        }
        
        minMileage = AnnualFuelUse.min(distance);
        minMPG = AnnualFuelUse.min(MPG);
        minPrice = AnnualFuelUse.min(pPG);
        maxMileage = AnnualFuelUse.max(distance);
        maxMPG = AnnualFuelUse.max(MPG);
        maxPrice = AnnualFuelUse.max(pPG);

        totalMileage = AnnualFuelUse.totalOf(distance);
        totalGUsed = AnnualFuelUse.totalOf(gUsed);
        totalSum = AnnualFuelUse.totalOf(totalCost);
        totalMPGA = AnnualFuelUse.totalOf(MPG) / MPG.length;
        totalFillDay = AnnualFuelUse.totalOf(fillDay) - 1;
        
        annualMileage = AnnualFuelUse.annualProjection(fillDay, totalMileage);
        annualGUsed = AnnualFuelUse.annualProjection(fillDay, totalGUsed);
        annualCost = AnnualFuelUse.annualProjection(fillDay, totalSum);
        annualMPG = AnnualFuelUse.annualProjection(fillDay, totalMPGA);
        
        String[] headerInfo = { "Fill Up" , "   Days" , "    Start Miles" , "   End Miles" , "Distance" , "Gallons Used" , "  MPG", "   Price" , "Cost" };
        
        for(String info : headerInfo)
        {
            System.out.print(info + "\t");
        }
        
        System.out.println("\n~---------------------------------------------------------------------------------------------------------------------------~");
        
        for(int index = 0; index < gas.length; index++)
        {
            System.out.printf("%4d%10.0f%14d%14d%11.0f%20.1f%12.2f%11.2f%12.2f%n", gasFillUps[index], fillDay[index], startMiles[index], endMiles[index], distance[index], gUsed[index],  MPG[index],
            pPG[index], totalCost[index]);
        }
        
        System.out.println("~---------------------------------------------------------------------------------------------------------------------------~\n");
        
        System.out.printf("Minimum:%45.0f%32.2f%11.2f%n", minMileage, minPrice, minMPG);
        System.out.printf("Maximum:%45.0f%32.2f%11.2f%n%n", maxMileage, maxPrice, maxMPG);
        System.out.printf("Totals:%46.0f%20.1f%35.2f%n", totalMileage, totalGUsed, totalSum);
        System.out.printf("Annual Projection:%35.0f%20.1f%23.2f%12.2f%n", annualMileage, annualGUsed, annualCost, annualMPG);
    }
}