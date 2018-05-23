
/**
 * The purpose of this program is to use java code to read files, use arrays and different loop types along with arthmetic statements to display a set of hurricanes their type,
 * pressure and wind speed (Knots to MPH). 
 * 
 *
 * @author Annabel Hartmann
 * @version 11/3/2017
 */

import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Hurricanes2
{
  public static void main(String[] args) throws IOException {
      int c1 = 0; //category 1
      int c2 = 0; //category 2
      int c3 = 0; //category 3 
      int c4 = 0; //category 4
      int c5 = 0; //category 5
      int maxC = 0; //max category 
      int avgC = 0; //avg category
      int maxPress = 0; //max pressure
      int avgPress = 0; //average pressure
      int maxWind = 0; //max wind
      int avgWind = 0; //average wind
      int index = 0; //index
      int lengthA = 59; //length of array
      
      
      int[] year; //int array for the year
      int[] press; //int array for the pressure
      int[] wind; //int array for the wind
      int[] category; //int array for the category
      double[] windMPH; //double array for the wind in MPH
      String[] month; //string array for month
      String[] name; //string array for name of the hurricanes
      
      year = new int[lengthA];
      wind = new int[lengthA];
      press = new int[lengthA];
      windMPH = new double[lengthA];
      month = new String[lengthA];
      name = new String[lengthA];
      category = new int[lengthA];

      File fileName = new File("hurcdata2.txt");
      Scanner inFile = new Scanner(fileName);

      
      while (inFile.hasNext()) {
         year[index] = inFile.nextInt();
         month[index] = inFile.next();
         press[index] = inFile.nextInt();
         wind[index] = inFile.nextInt();
         name[index] = inFile.next();
         index++;
        }
      int minPress = press[0];
      int minWind = wind[0];
      inFile.close();
 
      double windInMPH = 1.15078; //double for what needs to be multipled in order to convert knots to mph
      for (index = 0; index < wind.length; index++) {
         windMPH[index] = wind[index] * windInMPH;
         avgWind += windMPH[index];
         avgPress += press[index];

         if (windMPH[index] > 74 && windMPH[index] < 95) {
            category[index] = 1;
            avgC += category[index];
            c1++;
         }
         
         else if (windMPH[index] > 96 && windMPH[index] < 110) {
            category[index] = 2;
            avgC += category[index];
            c2++;
         }
         
         else if (windMPH[index] > 111 && windMPH[index] < 129) {
            category[index] = 3;
            avgC += category[index];
            c3++;
         }
         
         else if (windMPH[index] > 130 && windMPH[index] < 156) {
            category[index] = 4;
            avgC += category[index];
            c4++;
         }
         
         else if (windMPH[index] > 157) {
            category[index] = 5;
            avgC += category[index];
            c5++;
         }
        }
        int categoryMin = category[0];

      for (index = 0; index < category.length; index++) {
         if (category[index] < categoryMin) {
             categoryMin = category[index];
         }
      }
      for (index = 0; index < category.length; index++) {
         if (category[index] > maxC) {
             maxC = category[index];
         }
      }
      for (index = 0; index < press.length; index++) {
         if (press[index] < minPress) {
             minPress = press[index];
         }
        }
      for (index = 0; index < press.length; index++) {
         if (press[index] > maxPress) {
             maxPress = press[index];
         }
      }
      for (index = 0; index < wind.length; index++) {
         if (wind[index] < minWind) {
             minWind = wind[index];
         }
      }
      for (index = 0; index < wind.length; index++) {
          if (wind[index] > maxWind) {
          maxWind = wind[index];
          }
      }

      avgWind = avgWind / windMPH.length;
      avgC = avgC / category.length;
      avgPress = avgPress / press.length;

      //Output for code
      System.out.println("                         ~Hurricanes 1980 - 2006~");
      System.out.println();
      System.out.println("    Year     Hurricane    Category     Pressure (MB)     Wind Speed (MPH)");
      System.out.println("~---------------------------------------------------------------------------~");
      for (index = 0; index < year.length; index++) {
           System.out.printf("    %d%13s%10d%18d%19d\n" , year[index] , name[index] , category[index] , press[index] , (int)windMPH[index]);
      }
      System.out.println("~---------------------------------------------------------------------------~");
      System.out.printf("%s%23d%18d%19d\n" , "Average:" , avgC , avgPress , avgWind / 2);
      System.out.printf("%s%23d%18d%19d\n" , "Maximum:" , maxC , maxPress , maxWind);
      System.out.printf("%s%23d%18d%19d\n" , "Minimum:" , categoryMin , minPress , minWind);
      System.out.println();
      System.out.println("# of Category 1 Hurricanes: " + c1);
      System.out.println("# of Category 2 Hurricanes: " + c2);
      System.out.println("# of Category 3 Hurricanes: " + c3);
      System.out.println("# of Category 4 Hurricanes: " + c4);
      System.out.println("# of Category 5 Hurricanes: " + c5);
    }

}

 