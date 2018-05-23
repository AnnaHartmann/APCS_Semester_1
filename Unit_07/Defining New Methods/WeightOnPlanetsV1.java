/**
 * The purpose of this project is to call the project gravity1 so that way I can calculate my weight on different planets along with gravity and the planet names while using
 * printf, static methods and for loops. 
 *
 * @author Annabel Hartmann
 * @version 11/10/17
 */
import java.util.Scanner;

import java.io.File;
import java.io.IOException;
public class WeightOnPlanetsV1 {
    public static double [] g()throws IOException {
		int i = 0;
		double[] gravity = new double[9];
		File fileName = new File("gravity1.txt");
		Scanner inFile = new Scanner(fileName);
		while (inFile.hasNext()){
			gravity[i] = inFile.nextDouble() / 10;
			i++;
		}
		inFile.close();
		return gravity;
    }

    static double kPP = 0.453592; //kPP = kilo per pound
    static int lb = 125; //lb = pound
    static double k = lb / kPP; // pounds / kilo per pound
    public static double[] lbs(double[]gravityIndex, double[]weight) {
		for (int i = 0; i < 9; i++){
			weight[i] = k * gravityIndex[i];
		}
		return weight;
    }

    public static void print(double[] gravityIndex, double[] weight, String[] planets) {
	    System.out.println("          My Weight on the Planets");
	    System.out.println("   Planet	Gravity		Weight (lbs)");
	    System.out.println("⋆+---------------------------------------------+⋆");
	    for (int i = 0; i< 9; i ++){
	        System.out.printf("   %7s    %7.2f		%7.1f", planets[i],gravityIndex[i],weight[i]);
	        System.out.println();
	    }
    }

    public static void main(String[] args) throws IOException {
        String [] planet = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "*Pluto"};
	double gravity[] = g();
	double[] weight = new double[9];
	weight = lbs(gravity, weight);
	print(gravity, weight, planet);
	System.out.println();
        System.out.println("*I added Pluto because they have feelings too! c:");
    }
}