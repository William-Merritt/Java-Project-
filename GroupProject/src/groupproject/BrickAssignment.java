/*
 * biglerd7304      daniel bigler
 * 191028
 * This program deomstrates passing arguments to a superclass constructor
 */
package brickassignment;
import java.util.Scanner;
public class BrickAssignment {

    public static void main(String[] args) {
        double length;      // The cube's length
        double width;       // The cube's width
        double height;      // The cube's height
        double layerVol;    // length and width, won't include height
        double brickL = 8.25;   // 8 plus mortar
        double brickW = 3.875;  // 6.625 plus mortar
        double brickH = 2.5;    // 2.25 plus mortar
        double brickVol;    //
        double layer;       //
        double brickNum;    //
        double totalBricks; // total number of bricks
        int iter;           // iteration
        int colNum;
        String cont = "y";
        String error = "y";
        
        // Create a Scanner object for keyboard input.
        Scanner keyboard = new Scanner(System.in);

        // keep running until the user no longer wants to continue
        while (cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes")) {
                    
            totalBricks = 0;
            colNum = 0;
            length = 0;
            width = 0;
            height = 0;
            
            System.out.println("This program assumes brick dimensions of"
                    + "Length = 8.25in, Width = 3.875in, Height = 2.5in");
            System.out.println("How many pillars/columns: ");
            while (error.equals("y")) {
                try {
                    colNum = keyboard.nextInt();
                    while (colNum < 0) {
                        System.out.println("Must be a positive number: ");
                        colNum = keyboard.nextInt();
                    }
                    error = "n";
                } catch (Exception e) {
                    System.out.println("Must be an intiger.");
                }
            }
            error = "y";
            
            
            for (iter = 1; iter <= colNum; iter++){

                System.out.println("Enter the following " + 
                        "dimensions of pillar/column number " + iter + 
                        "(in inches):");
                
                // Get length.
                System.out.print("Length: ");
                while (error.equals("y")) {
                    try {
                        length = keyboard.nextDouble();
                        while (length <= 0) {
                            System.out.println("Must be a positive number: ");
                            length = keyboard.nextDouble();
                        }
                        error = "n";
                    } catch (Exception e) {
                        System.out.println("Must be a number.");
                    }
                }
                error = "y";
            
                // Get width.
                System.out.print("Width: ");
                while (error.equals("y")) {
                    try {
                        width = keyboard.nextDouble();
                        while (width <= 0) {
                            System.out.println("Must be a positive number: ");
                            width = keyboard.nextDouble();
                        }
                        error = "n";
                    } catch (Exception e) {
                        System.out.println("Must be a number");
                    }
                }
                error = "y";
            
                // Get height.
                System.out.print("Height: ");
                while (error.equals("y")) {
                    try {
                        height = keyboard.nextDouble();
                        while (height <= 0) {
                            System.out.println("Must be a positive number: ");
                            height = keyboard.nextDouble();
                        }
                        error = "n";
                    } catch (Exception e) {
                        System.out.println("Must be a number");
                    }
                }
                error = "y";
            
                // Calculate volume, and brick amount per layer
                brickVol = brickL * brickW;
                layerVol = length * width;
                brickNum = layerVol / brickVol;
            
                // Calculate number of layers and number of bricks for all layers
                layer = height / brickH;
                brickNum = brickNum * layer;
                
                
                System.out.println("\n\n");
                System.out.println("Length: " + length);
                System.out.println("Width: " + width);
                System.out.println("Height: " + height);
                System.out.println("layer count: " + layer);
                System.out.println("Brick number: " + brickNum);
                totalBricks = totalBricks + brickNum;
            }
            System.out.println("");
            System.out.println("The total number of bricks: " + totalBricks);
            cont = keyboard.nextLine();
            while (!cont.equalsIgnoreCase("n") && !cont.equalsIgnoreCase("no") &&
                    !cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("yes")) {
                System.out.println("Would you like to run the program again, "
                        + "starting from zero bricks? Yes or no: ");
                cont = keyboard.nextLine();
            }
        }
    }
}
