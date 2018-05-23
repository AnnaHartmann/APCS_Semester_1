/**
 * The purpose of this project is to find the area, preimeter of a rectangle and circumfrence of a circle.
 * 
 * ©FLVS 2007
 * @author Annabel Hartmann 
 * @version 11/20/17
 */

public class ShapesV4
{
    //default constructor
    ShapesV4(){
    }
    
    public double calcTriArea(int s1, int s2) { //calculate area of a triangle  
        return s1 * s2 * .5;
    }
    
    public double calcHypoteneuse(int s1, int s2){ //calculate the hypoteneuse of a right triangle
        return Math.sqrt(Math.pow(s1, 2) + Math.pow(s2, 2));
    }
    
    public double calcRectArea(int w, int l){ //calculate the area of a rectangle
        return l * w;
    }
    
    public double calcRectPerimeter(int w, int l){ //calculate the area of a rectangle
        return (2 * l) * (2 * w);
    }
    
    public double calcCircCircumference(int r){ //calculate the circumference of a circle
        return 2 * Math.PI * (double)r;
    }
    
    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int side1, side2, width, length, radius;
        double triArea, hypoteneuse, rectArea, rectPerimeter, circCircumference;
        
        //initialization of variables
        side1 = 10; side2 = 5; width = 2; length = 5; radius = 4;
        triArea = 0; hypoteneuse = 0; rectArea = 0; rectPerimeter = 0; circCircumference = 0;
        
        ShapesV4 shapes = new ShapesV4();
        /*Can be written as:
         * ShapesV3 shapes;
         * shapes = new ShapesV3();
         */
        
        //call methods
        triArea = shapes.calcTriArea(side1, side2); 
        hypoteneuse = shapes.calcHypoteneuse(side1, side2);
        rectArea = shapes.calcRectArea(width, length);
        rectPerimeter = shapes.calcRectPerimeter(width, length);
        circCircumference = shapes.calcCircCircumference(radius);

        //print results
        System.out.printf("       Triangle Area = %8.2f%n", triArea);
        System.out.printf("         Hypoteneuse = %8.2f%n", hypoteneuse);
        System.out.printf("      Rectangle Area = %8.2f%n", rectArea);
        System.out.printf(" Rectangle Perimeter = %8.2f%n", rectPerimeter);
        System.out.printf("Circle Circumference = %8.2f%n", circCircumference);
    }
}