/**
 * The purpose of this code is to use for loops in java to code a lottery game where you can guess to see if you get the right lotter and make money!! (fake money though)
 * 
 * @author Annabel Hartmann
 * @version 10/19/17
 */

import java.util.Random;
import java.util.Scanner;
import java.lang.System;
public class Lottery {

    public static void main(String[] args){
        
//declare and initialized variables and objects
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        String lotteryNum = " ";
        String guessNum = " "; 

//Generate a 3-digit "lottery" number composed of random numbers
        for(int i = 0; i < 3; i++) {
            int randomNum = (int)(Math.random()*10);
            lotteryNum += Integer.toString(randomNum);
        }
        
System.out.print("Please enter your three numbers (e.g. 123): ");
        guessNum = in.nextLine();

//Simulate a lottery by drawing one number at a time and concatenating it to the string
        if (guessNum.equals(lotteryNum)){  
            System.out.print("Congrats! Both pairs matched. Money! Money! Money! $$$ The winning number is:" + lotteryNum);
        }
         else if (guessNum.substring(0,2).equals(lotteryNum.substring(0, 2))){
            System.out.print("Congratulations~ The front pair matched! No Money for you though!:" + lotteryNum);
            }

        else if(guessNum.substring(1,3).equals(lotteryNum.substring(1,3))){
            System.out.print("Congratulations~ The end pair matched! The winning number is:" + lotteryNum + "No money for you though!");  
            }

        else{
            System.out.print("Oh no! There was no match! The number to win was:" + lotteryNum);
            }

        }
}
