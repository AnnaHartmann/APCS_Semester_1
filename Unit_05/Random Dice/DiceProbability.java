
/**
 * The purpose of the class DiceProbability is to use nested loops to calculate the
 * probability of a certain sum.
 *
 * @author Annabel Hartmann
 * @version 10/19/2017
 */
import java.util.Scanner; 
import java.util.Random; 
import java.text.DecimalFormat; 

public class DiceProbability { 
    public static void main(String[] args) { 
        //Declare and initlialize variables and objects 
        Random random; 
        random = new Random(); 
        Scanner in = new Scanner(System.in); 
        int match = 0; 
        int die1, die2; 
        int sides; 
        int dieRolls; 
        int sum; 
        int sumOfDie; 
        double numOfRolls; 
        
        
        //Input: ask user for number of rolls and number of sides on a die
        System.out.print("Please Input The # of Sides You Want On The Dice: "); 
        sides = in.nextInt(); 
        System.out.print("Please enter the amount of times you want to roll the dice: "); 
        dieRolls = in.nextInt(); 
        //Print heading for output table
        System.out.println("Sum of dice\tProbability\n"); 
        
        //**************************************
        //Using nested loops, cycle through the possible sums of the dice. 
        //Roll the dice the given number of times for each sum. 
        //Count how many times the sum of the dice match the current sum being looked for. 
        //**************************************

        for(sum = 2; sum <= 2 * sides; sum ++) { 
            for(numOfRolls = 0; numOfRolls <= dieRolls; numOfRolls ++) { 
                die1 = random.nextInt(sides) + 1; 
                die2 = random.nextInt(sides) + 1; 
                sumOfDie = die1 + die2; 
                if(sumOfDie == sum) { 
                    match += 1; 
                } 
            } 
            double probability = (match / numOfRolls) * 100; 
            System.out.println(sum + "s" + "\t\t" + probability); 
            match = 0; 
        } 
    } //end
}//End class DiceProbablity