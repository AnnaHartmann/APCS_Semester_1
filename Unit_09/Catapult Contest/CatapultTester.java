/**
 * This is program is meant to specify the velocity and degree variables along with assigning the variables to what is calculated in the Catapult program.
 * This code also prints what is needed before and after the code along with a happy message at the end!
 *
 * @author Annabel Hartmann
 * @version 12/14/17
 */

public class CatapultTester {       
    public static void main(String[] args) {
        
        int [] velocity = {20,25,30,35,40,45,50}; //specified variables for velocity
        int [] degree = {25,30,35,40,45,50}; //specified variables for each degree
        
        Catapult catapult = new Catapult(velocity, degree);
        catapult.calculateDistance();
   
        System.out.println("                                                  Projectile Distance (feet) ");
        System.out.println("    MPH          25 deg           30 deg           35 deg           40 deg           45 deg           50 deg");
        System.out.println("~---------------------------------------------------------------------------------------------------------------~");
        catapult.printStatement();
        System.out.println("~---------------------------------------------------------------------------------------------------------------~");
        System.out.println("I hope you have a wonderful winter break!");
    }
}