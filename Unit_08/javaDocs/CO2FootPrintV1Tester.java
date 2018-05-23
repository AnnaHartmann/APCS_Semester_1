
/**
 * This program is to print out the amount of gas in gallons that I used, then the amount of gas that I used in lbs and then to tons.
 * This program used a static method (a standard one) and used printf statements for the output code.
 *
 * @author Annabel Hartmann
 * @version 12/1/17
 */
public class CO2FootPrintV1Tester {
    public static void main(String[] args){
        double gallons, cO2t, cO2lb; //initializing gallons used, CO2 in tons, CO2 in lbs
        gallons = 708.4; //creating the double variable of gallons that I got from the previous code written
        
        CO2FootprintV1 footprint = new CO2FootprintV1(gallons);

        footprint.calculateCO2Tons();
        footprint.calculateCO2TonsToLbs();
        cO2t = footprint.refCO2T();
        cO2lb = footprint.refCO2L();

        System.out.println("         ~CO2 Emissions~");
        System.out.println("   Gallons   Pounds      Tons");
        System.out.println("   of Gas   from Gas   from Gas");
        System.out.println("~-----------------------------~");
        System.out.printf("  %6.1f    %8.2f    %4.3f",gallons, cO2lb, cO2t);
    }
}
