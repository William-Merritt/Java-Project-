/*
 * biglerd7304      daniel bigler
 * 191028
 * This program deomstrates passing arguments to a superclass constructor
 */
package brickassignment;
import javax.swing.JOptionPane;
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
        double allTotalBricks = 0;
        int iter;           // iteration
        int colNum;
        String cont = "y";
        String error = "y";
        String input;
        
        // keep running until the user no longer wants to continue
        while (cont.equalsIgnoreCase("y") || cont.equalsIgnoreCase("yes")) {
                    
            totalBricks = 0;
            colNum = 0;
            length = 0;
            width = 0;
            height = 0;
            
            while (error.equals("y")) {
                try {
                    input = JOptionPane.showInputDialog("This program assumes "
                            + "brick dimensions of Length = 8.25in, "
                            + "Width = 3.875in, Height = 2.5in" 
                            + '\n' + "How many pillars/columns: ");
                    colNum = Integer.parseInt(input);
                    while (colNum < 0) {
                        input = JOptionPane.showInputDialog("Must be a "
                                + "positive number: ");
                        colNum = Integer.parseInt(input);
                    }
                    error = "n";
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Must be a number.");
                }
            }
            error = "y";
            
            
            for (iter = 1; iter <= colNum; iter++){

                JOptionPane.showMessageDialog(null, "Enter the following " + 
                        "dimensions of pillar/column number " + iter + 
                        "(in inches):");
                
                // Get length.
                while (error.equals("y")) {
                    try {
                        input = JOptionPane.showInputDialog("Length: ");
                        length = Double.parseDouble(input);
                        while (length <= 0) {
                            input = JOptionPane.showInputDialog("Must be a "
                                    + "positive number: ");
                            length = Double.parseDouble(input);
                        }
                        error = "n";
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Must be a number.");
                    }
                }
                error = "y";
            
                // Get width.
                while (error.equals("y")) {
                    try {
                        input = JOptionPane.showInputDialog("Width: ");
                        width = Double.parseDouble(input);
                        while (width <= 0) {
                            input = JOptionPane.showInputDialog("Must be a "
                                    + "positive number: ");
                            width = Double.parseDouble(input);
                        }
                        error = "n";
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Must be a number.");
                    }
                }
                error = "y";
            
                // Get height.
                while (error.equals("y")) {
                    try {
                        input = JOptionPane.showInputDialog("Height: ");
                        height = Double.parseDouble(input);
                        while (height <= 0) {
                            input = JOptionPane.showInputDialog("Must be a "
                                    + "positive number: ");
                            height = Double.parseDouble(input);
                        }
                        error = "n";
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Must be a number.");
                    }
                }
                error = "y";
            
                // Calculate volume, and brick amount per layer
                brickVol = brickL * brickW;
                layerVol = length * width;
                brickNum = layerVol / brickVol;
            
                // Calculate number of layers and number of bricks for all layers
                layer = height / brickH;
                totalBricks = brickNum * layer;
                
                
                JOptionPane.showMessageDialog(null, "Length: " + length + '\n' +
                        "Width: " + width + '\n' +
                        "Height: " + height + '\n' +
                        "layer count: " + layer + '\n' +
                        "Brick number per layer: " + brickNum);
                allTotalBricks = allTotalBricks + totalBricks;
            }
            JOptionPane.showMessageDialog(null, "The total number of bricks: " + 
                    allTotalBricks);
            cont = JOptionPane.showInputDialog("Would you like to run pillar again"
                    + "starting from zero bricks: ");
            while (!cont.equalsIgnoreCase("n") && !cont.equalsIgnoreCase("no") &&
                    !cont.equalsIgnoreCase("y") && !cont.equalsIgnoreCase("yes")) {
                cont = JOptionPane.showInputDialog("Would you like to run the "
                        + "program again, starting from zero bricks? " 
                        + '\n' + "Yes or no: ");
            }
        }
    }
}
