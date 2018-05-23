/**
 * The purpose of this program is to code a mini game/ solve how many times a person may win a prize
 * in a bottle cap game by asking for how many bottles they are wanting to drink.
 * @author Annabel Hartmann
 * @version 10/22/2017
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;
public class BottleCapPrize
{
 public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        
        PrintWriter outputFile = new PrintWriter(new File("Trials.txt"));
        Random randNum = new Random();
        int bottleCapNum = 0;
        int wins = 0;
        int openBottles = 0;
        int input;
        
        System.out.print("How many trials would you like? ");
        input = in.nextInt();

        for(int i = 1; i <= input; i++)
        {
            bottleCapNum = randNum.nextInt(5);
            while(bottleCapNum != 0)
            {
                bottleCapNum = randNum.nextInt(5);
                openBottles++;
            }
            if(bottleCapNum == 0)
            {
                openBottles++;
                wins++;
            }
        }
        
        outputFile.println("The number of bottles opened was: " + openBottles);
        outputFile.println("The number of winning bottle caps found was: " + wins);
        int averageNumberOfBottles = (openBottles / wins);
        outputFile.println("The average number of bottles that need to be opened to win is: " + averageNumberOfBottles);    
        outputFile.close();

        Scanner inputFile = new Scanner(new File("trials.txt"));
        while(inputFile.hasNextLine())
        {
            String token = inputFile.nextLine();
            System.out.println(token);
        }
        
        inputFile.close();
    }
}
