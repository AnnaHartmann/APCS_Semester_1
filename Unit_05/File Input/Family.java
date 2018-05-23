/* 
 * The purpose of this project is to calculate the percentage of a 
 * repeating string of code (BG, GB, BB, GG) while using file reading in java.
 * 
 * Do you get the same results each time you run the program? Yes I got the same results each time I ran the program.
 * Do you think the sample data set in the text file is representative of the actual probability of 
 * a family with two children consisting of two boys, a boy and a girl, or two girls?  
 * Yes I think that this is an actual probability because the genetics within a human is rather spontaneous so this is possible 
 * 
 * @author Annabel Hartmann
 * 
 * @version 10/18/2017
 * 
 */
 
import java.util.Scanner; 
import java.io.File; 
import java.io.FileReader; 
import java.io.IOException; 
public class Family 
{
    public static void main(String[] args) throws IOException {
        //initialize variables
		int bothBoys = 0;
		int bothGirls = 0;
		int boyAndGirl = 0;
		int sampleSize = 0;
		int counter=0; 
		double probabilityOfBothBoy=0;
		double probabilityOfBoyAndGirl = 0;
		double probabilityOfBothGirl =0; 
		String token = ""; 
		Scanner inFile = new Scanner(new File("MaleFemaleInFamily.txt"));
		
		while(inFile.hasNext()){
			token = inFile.next();
			System.out.println(token); //this part may be commented out to demonstrate consistent results
				if(token.equals("BB")){
					bothBoys++;
					counter++;
				}else if(token.equals("GG")){
					bothGirls++;
					counter++;
				}else if(token.equals("BG")){
					boyAndGirl++;
					counter++;
				}else if(token.equals("GB")){
				    boyAndGirl++;
				    counter++;	
				}  
				 
		}
		
		sampleSize = counter;
		
		System.out.println("Sample size: " + sampleSize);
		
		inFile.close();
		probabilityOfBothBoy = (double)bothBoys / (double)sampleSize; 
		probabilityOfBothGirl = (double)bothGirls / (double)sampleSize; 
		probabilityOfBoyAndGirl = (double)boyAndGirl / (double)sampleSize; 
		System.out.println("Two Boys: "+ probabilityOfBothBoy); 
		System.out.println("One Boy One Girl: "+ probabilityOfBoyAndGirl); 
		System.out.println("Two Girls: " + probabilityOfBothGirl); 
	}
}