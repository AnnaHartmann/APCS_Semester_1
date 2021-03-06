
/**
 *This assignment is to teach the student to be able to use loops, if - elseif statements and other iterative controls.
 *This project allows a use to input how a password type and length by using iterative controls. 
 *
 * @author Annabel Hartmann
 * @version 10/23/2017
 */
import java.util.Random;
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
       
        String lowercase = "abcdefghijklmnopqrstuvwxyz"; //declaring lowercase
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //declaring uppercase
        String numbers = "1234567890"; //delcaring numbers
        String symbols = "!@#$%^&*()_+=-.,/\';[]{}|:"; //declaring symbols
        String password = "";
        Random randomNumber = new Random();
        Random randomSelection = new Random();
        int loopSelection = 0;
        int choice = 0;
        int length = 0;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("                   Password Generator Menu");
        System.out.println("**********************************************************");
        System.out.println("* [1] Lowercase letters                                  *");                               
        System.out.println("* [2] Lowercase & Uppercase letters                      *");
        System.out.println("* [3] Lowercase, Uppercase & Numbers                     *");
        System.out.println("* [4] Lowercase, Uppercase, Numbers and Punctuation      *");
        System.out.println("* [5] Quit                                               *");
        System.out.println("**********************************************************\n");
       
        System.out.println("Enter a selection (1-5): ");
        choice = in.nextInt();
        System.out.print("\n");
        if (choice < 5) {
            System.out.println("Choose a password length (1 - 14)");
            length = in.nextInt();  
        }
        
        // Choice 1
        if (choice == 1) {
            
            for (int i = 0; i < length; i++) {
                password += lowercase.charAt(randomNumber.nextInt(lowercase.length()));
            }
            
        }
        // Choice 2
        else if (choice == 2) {
            
            for (int i = 0; i < length; i++) {
                
                loopSelection = randomSelection.nextInt(2);
                
                if (loopSelection == 0) {
                    password += lowercase.charAt(randomNumber.nextInt(lowercase.length()));
                }
                else if (loopSelection == 1) {
                    password += uppercase.charAt(randomNumber.nextInt(uppercase.length()));
                }
            }
            
        }
        // Choice 3
        else if (choice == 3) {
            
            for (int i = 0; i < length; i++) {
                
                loopSelection = randomSelection.nextInt(3);
                
                if (loopSelection == 0) {
                    password += lowercase.charAt(randomNumber.nextInt(lowercase.length()));
                }
                else if (loopSelection == 1) {
                    password += uppercase.charAt(randomNumber.nextInt(uppercase.length()));
                }
                else if (loopSelection == 2) {
                    password += numbers.charAt(randomNumber.nextInt(numbers.length()));
                }
            }
            
        }
        // Choice 4
        else if (choice == 4) {
            
            for (int i = 0; i < length; i++) {
                
                loopSelection = randomSelection.nextInt(4);
                
                if (loopSelection == 0) {
                    password += lowercase.charAt(randomNumber.nextInt(lowercase.length()));
                }
                else if (loopSelection == 1) {
                    password += uppercase.charAt(randomNumber.nextInt(uppercase.length()));
                }
                else if (loopSelection == 2) {
                    password += numbers.charAt(randomNumber.nextInt(numbers.length()));
                }
                else if (loopSelection == 3) {
                    password += symbols.charAt(randomNumber.nextInt(symbols.length()));
                }
            }
            
        }
        // Choice 5
        else if (choice == 5) {
            System.out.println("The program will exit now!");
        }
        // If 1 - 5 are not chosen
        else {
            System.out.println("Please choose a number between 1 and 5.");
        }
        // Print generated password
        if (choice < 5) {
            System.out.println("Password: " + password);
        }
    }
}