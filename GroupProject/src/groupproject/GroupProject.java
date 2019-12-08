/**
 * First Edit: 11/18/2019
 * The project will calculate the cost of materials, and output them to the user
 * 
 */
package groupproject;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author merrittw1813
 */
public class GroupProject 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        final double BRICK_LENGTH =  8.25;
        final double BRICK_HEIGHT = 2.5;
        final double BRICK_WIDTH = 3.875;
        
        
        int menuChoice = 0;
        
        String inputString;
        
        boolean exit = false;
        
     do
      {
        
        try
        {
       
        inputString = JOptionPane.showInputDialog("Please enter a 1-5"
                +" for the menu option"
                +"\n1.Find Materials for a Wall"
                +"\n2.Find Materials for a Pillar"
                +"\n3.Find Materials for a Ramp"
                +"\n4.Find Materials for an Arch"
                +"\n5.Quit Program");

        //Getting the menu choice using parseInt and setting it to menuChoice
        menuChoice = Integer.parseInt(inputString);

        if (menuChoice < 1 || menuChoice > 5)
        {
            JOptionPane.showMessageDialog(null, "Please enter a number from"
                    +" the menu");
        }
        
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Please enter a number from"
                    +" the menu");
        }
        //Creating the switch statement for the menu.
        switch (menuChoice)
        {
            case 1:
                JOptionPane.showMessageDialog(null, "You have selected "
                        + " menu choice number 1.");
                getWallMaterials();
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "You have selected "
                        +" menu choice number 2.");
                getPillarMaterials();
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "You have selected "
                        +" menu choice number 3.");
                getRampMaterials();
                break;
            
            case 4:
                JOptionPane.showMessageDialog(null, "You have selected "
                        +" menu choice number 4.");
                getArchMaterials();
                break;
            
            case 5:
                JOptionPane.showMessageDialog(null, "Have a great day");
                System.exit(0);
                break;

        }
       
      }while(exit == false);
        
    }
    
    /**
     * The getWall Materials method gets the cost and materials of the wall
     * Then writes it into a file
     */
    
    public static void getWallMaterials()
    {
        double length;
        double width;
        double height;
        
        String inputString;
        
        JOptionPane.showMessageDialog(null, "Please enter the dimensions of "
                + " the wall");
        
        inputString = JOptionPane.showInputDialog("Width: ");
        length = Double.parseDouble(inputString) * 12;
        
        inputString = JOptionPane.showInputDialog("Height: ");
        height = Double.parseDouble(inputString) * 12;
        
        Wall myWall =
                new Wall(length,height);
        
       JOptionPane.showMessageDialog(null, "Here are the dimensions of the wall");
        
       System.out.println("Width: "+
               myWall.getLength());
       
       System.out.println("Height: "+
               myWall.getHeight());
       
       System.out.println("Number of bricks wide: "+
               Math.round(myWall.getBrickLength()));
       
       System.out.println("Number of bricks tall: "+
               Math.round(myWall.getBrickHeight()));
       
       System.out.println("Total number of bricks: "+
               Math.round(myWall.getBrickHeight() * myWall.getBrickLength()));
        
        
    }
    /**
     * The getPillarMaterials method gets the measurements of the pillar from
     * the user and outputs the number of bricks plus the price of the materials
     * needed for one pillar. 
     */
    public static void getPillarMaterials()
    {
        double length;
        double width;
        double height;
        double brickVol;
        double layerVol;
        double brickNum;
        double totalBricks;
        double allTotalBricks = 0;
        
        String inputString;
        
        totalBricks = 0;
        
        JOptionPane.showMessageDialog(null, "Please enter the dimensions of "
                + " the pillar");
        
        inputString = JOptionPane.showInputDialog("Length: ");
        length = Double.parseDouble(inputString) * 12;
        
        inputString = JOptionPane.showInputDialog("Width: ");
        width = Double.parseDouble(inputString) * 12;
        
        inputString = JOptionPane.showInputDialog("Height");
        height = Double.parseDouble(inputString) * 12;
        
        Pillar myPillar = 
                new Pillar(length, width, height);
        
       JOptionPane.showMessageDialog(null, "Here are the dimensions of"
                + " the pillar ");
        
       System.out.println("Length: "+
               myPillar.getLength());
       
       System.out.println("Width: "+
               myPillar.getWidth());
       
       System.out.println("Height: "+
               myPillar.getHeight());
       
       System.out.println("Layer Count: "+
               Math.ceil(myPillar.getLayers()));
       
       brickVol = myPillar.getBrickVolume();
       
       layerVol = myPillar.getLayerVolume();
       
       brickNum = layerVol / brickVol;
       
       totalBricks = brickNum * myPillar.getLayers();
       
       System.out.println("Total number of bricks per layer: "+
               Math.round(brickNum));
       
       allTotalBricks = allTotalBricks + totalBricks;
       
       System.out.println("The total number of bricks is: "+
               Math.ceil(allTotalBricks));
       
    }
    /**
     * The getRampMaterials method will take user input and convert them into 
     * the materials needed/cost of creating a ramp. 
     */
    public static void getRampMaterials()
    {
        double height;
        double length;
        double rampSide;
        double totalBricks;
        
        String inputString;
        /**
         * Getting user input and converting to cubic yards to calculate 
         * the amount of concrete needed for building the ramp. 
         */
        JOptionPane.showMessageDialog(null, "Please enter the dimensions of the"
                + " ramp in feet.");
        
        inputString = JOptionPane.showInputDialog("Height: ");
        height = Double.parseDouble(inputString)*12;
        
        
        inputString = JOptionPane.showInputDialog("Length: ");
        length = Double.parseDouble(inputString)*12;
        
        Ramp myRamp = 
                new Ramp(length, height);
        
       JOptionPane.showMessageDialog(null, "Here are the dimensions of"
                + " the ramp in yards ");
        
       System.out.println("Height: "+
               myRamp.getRampHeight());
       
       System.out.println("Length: "+
               myRamp.getRampLength());
       
       totalBricks = myRamp.getRampHeight() * myRamp.getRampLength();
       
       rampSide = totalBricks / 2;
       
       System.out.println("Total number of bricks: "
               + totalBricks);
       
       System.out.println("Total number of bricks for one side: "
               + rampSide);

   
    }
    /**
     * The getArchMaterials method will take user input and convert them into
     * the materials/cost needed for creating an arch.
     */
    public static void getArchMaterials()
    {
        /**
         * Creating the variables for the arch materials.
         */
        
        String inputString;
        
        double length;
        double width;
        double height;
        double totalBricks;
        
        JOptionPane.showMessageDialog(null, "Please enter the dimensions of the"
                + " arch in feet.");
        
        inputString = JOptionPane.showInputDialog("Length: ");
        length = Double.parseDouble(inputString)*12;
        
        inputString = JOptionPane.showInputDialog("Width: ");
        width = Double.parseDouble(inputString)*12;
        
        inputString = JOptionPane.showInputDialog("Height: ");
        height = Double.parseDouble(inputString)*12;
        
        Arch myArch =
                new Arch(length, width, height);
        
        JOptionPane.showMessageDialog(null, "Here are the dimensions of"
                + " the arch. ");
        
//        System.out.println("Length: "+
//               myArch.getLength());
//       
//       System.out.println("Width: "+
//               myArch.getWidth());
//       
//       System.out.println("Height: "+
//               myArch.getHeight());
       
       System.out.println("Length: "+
               myArch.getArchLength());
       
       System.out.println("Width: "+
               myArch.getArchWidth());
       
       System.out.println("Height: "+
               myArch.getArchHeight());
       
       totalBricks = myArch.getArchLength() * myArch.getArchHeight() 
               * myArch.getArchWidth();
       
       System.out.println("Total Bricks Needed: "+
               totalBricks);
       
    }
   
    
}
