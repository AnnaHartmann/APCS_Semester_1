import java.util.Scanner;
import java.lang.Math;


public class cashRegister {
    public static void main(String[] args) {    
    Scanner input = new Scanner(System.in);

    double total; 
    double cost; 
    double amtPaid;
    double change;
    double changeOutput;
    int twenties;
    int ten;
    int five;
    int one;
    int quarter;
    int dime;
    int penny;
    int nickel;
    double p = .01;
    double n = .05;
    double d = .1;
    double q = .25;
    double dollar = 1;
    double f = 5;
    double t10 = 10;
    double t20 = 20;
    
    System.out.print("Cost");
    cost = input.nextDouble();

    System.out.print("How much you wanna pay");
    amtPaid = input.nextDouble();

    change = amtPaid - cost;
    System.out.print("Your change is ");
    System.out.printf("%.2f%n", change);
    System.out.println();
     
    twenties = (int) Math.floor(change/t10);
    ten = (int) Math.floor((change - twenties * t20)/t10);
    five = (int) Math.floor((change-twenties * t20 - ten * t10)/f);
    one = (int) Math.floor((change - twenties * t20 - ten * t10 - five * f));
    
    changeOutput = change - twenties * t20 - ten * t10 - five * f - one * d;
    changeOutput = Math.round(changeOutput * 100.0) /100.0;
    quarter =  (int) Math.floor(changeOutput/.25);
    
    changeOutput = change - twenties * t20 - ten * t10 - five * t10 - one * dollar - quarter * q;
    changeOutput = Math.round(changeOutput * 100.0) /100.0;
    dime =  (int) Math.floor(changeOutput/d);    
    
    changeOutput = change - twenties * t20 - ten * t10 - five * f - one * dollar - quarter * q - dime * d;   
    changeOutput = Math.round(changeOutput * 100.0) /100.0;  
    nickel =  (int) Math.floor(changeOutput/n);
    
    changeOutput = change - twenties * t20 - ten * t10 - five * f - one * dollar - quarter * q - dime * d - nickel * n;
    changeOutput = Math.round(changeOutput * 100.0) /100.0;        
    penny =  (int) Math.floor(changeOutput/p);
        
    if (twenties > 0)
    {
       System.out.print(twenties + " $20 dollar(s)" + "\n");
    }
        
    if (ten > 0)
    {
       System.out.print(ten + " $10 dollar(s)" +  "\n");
    }
        
    if (five > 0)
    {
       System.out.print(five + " $5 dollar(s)" + "\n");
    }   
    
    if (one > 0)
    {
       System.out.print(one + " $1 dollar(s) " + "\n");
    }   
    
    if (quarter > 0)
    {
       System.out.print(quarter + " Quarter(s)" + "\n");
    }   
        
    if (dime > 0)
    {
       System.out.print(dime + " Dime(s)" + "\n");
    }
        
    if (nickel > 0)
    {
       System.out.print(nickel + " Nickel(s) " + "\n");
    }
        
    if (penny > 0)
    {
       System.out.print(penny + " Penny(ies)" + "\n");
    }
   }
 }           
 