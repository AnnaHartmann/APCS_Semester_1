
/**
 * This program is so that I can practice the output formats with using printf and differeny arrays. This code has the conversion between celsius,fahrenheit and inch, centimeters.
 *
 * @author Annabel Hartmann
 * @version 10/31/2017
 */
import java.util.Scanner; //Importing Scanner Util
public class AnnualClimate2
{
  public static void main (String[] args){
   Scanner in = new Scanner(System.in); //Declare Scanner object
   
   String fahrenheit = "F"; //Input for fahrenheit
   String celsius = "C"; //Input for celsius
   String inch = "in"; //Display "inches"
   String centimeteres = "cm"; //Display "centimeters"
   String city = "Orlando"; //Display the chosen city
   String state = "Florida"; //Display the State
   String orTemp = ""; //declaring User Input temperature type (F or C)
   String orLength = ""; //declaring User Input length type they want (in or cm)
   String tempType = ""; //declaring temperature type (F or C)
   String precType = ""; //declaring precipitation type (in or cm)
   double sum = 0.0; //declaring sum
   
   String[] months = {"January", "February", "March", "April", "May", "June", "July", "August","September", "October", "November", "December"};
   //Months declared in a string
   
   double[] temperatures = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};
   //temperatures for each month
   
   double[] percipitation = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};
   //percipitation for each month
   
   
   System.out.println("Would you like the temperature in Fahrenheit (F) or in Celsius (C)?");
   //Prints out a question about F or C
   orTemp = in.nextLine();//Input F or C
   
   System.out.println("Would you like the precipitation to be in inches (in) or in centimeters (cm)");
   //Prints out a question about in or cm
   orLength = in.nextLine();//Input in or cm
   
    if (orTemp.equalsIgnoreCase("F")) {
    tempType = "F";
        }

    else if (orTemp.equalsIgnoreCase("C")) {
            for (int i=0; i<12; i++) {
                temperatures[i] = temperatures[i]-32;
                temperatures[i] = (.555)*(temperatures[i]);
                temperatures[i] = ((temperatures[i]*10));
                temperatures[i] = ((int)temperatures[i]);
                temperatures[i] = temperatures[i]/10;
        }
        tempType = "C";
     }

    if (orLength.equalsIgnoreCase("in")) {
    precType = "In.";
    }

    else if (orLength.equalsIgnoreCase("cm")) {
            for (int i=1; i<12; i++) {
                percipitation[i] = percipitation[i] * 2.54;
                percipitation[i] = percipitation[i] * 10;
                percipitation[i] = ((int)percipitation[i]);
                percipitation[i] = percipitation[i] / 10;
        }
     precType = "Cm.";
      }
        
    for(int i=0; i<12; i++) //Code to solve temperature average 
    {
     sum=sum+temperatures[i];
    }
        
   double tempAvg = sum/12;
        tempAvg = ((tempAvg*10));
        tempAvg = ((int)tempAvg);
        tempAvg = tempAvg/10;
        sum = 0.0;      //End of snipet for temperature average
        
    for(int i=0; i<12; i++)  //Code to solev percipitation average
    {
     sum=sum+percipitation[i];
    }     
   double precipAvg = (sum*10);
        precipAvg = (int)precipAvg;
        precipAvg = precipAvg/10;   //End of snipet for percipitation average
   
   //Output for Code
   System.out.println("                   Climate Data");
   System.out.println("            Location " + city + ", " + state + "\n");
   System.out.printf("%8s%21s%24s\n", "Month", "Temperature (" + tempType + ")", "Precipitation (" + precType + ")");
   System.out.println("~-----------------------------------------------------~");
   
   for(int i=0; i<12; i++) 
        {
         System.out.printf("%9s%15s%20s\n", months[i], temperatures[i], percipitation[i]);
        }
        
  System.out.println("~-----------------------------------------------------~");
  System.out.println("           Average: " + tempAvg + "        Annual: " + precipAvg); 
 }
}
