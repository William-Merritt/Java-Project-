/**
 * First Edit: 11/18/2019
 * The project will calculate the cost of materials, and output them to the user
 * Final Edit: 12/8/2019
 * Group Names: Daniel Bigler, Reginald Jones, William Merritt
 */
package groupproject;
import javax.swing.JOptionPane;
import java.util.Scanner;


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
        //final double BRICK_LENGTH =  8.25;
        //final double BRICK_HEIGHT = 2.5;
        //final double BRICK_WIDTH = 3.875;
        
        
        int menuChoice = 0;
        
        String inputString;
        
        boolean exit = false;
        
        JOptionPane.showMessageDialog(null, "This program finds the cost of "
                + " creating Walls, Pillars, Ramps, and Archs"
                + " using brick.");
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
                        + "menu choice number 1.");
                getWallMaterials();
                break;

            case 2:
                JOptionPane.showMessageDialog(null, "You have selected "
                        +"menu choice number 2.");
                getPillarMaterials();
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "You have selected "
                        +"menu choice number 3.");
                getRampMaterials();
                break;
            
            case 4:
                JOptionPane.showMessageDialog(null, "You have selected "
                        +"menu choice number 4.");
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
        double length;              //To hold the width of the wall
        double width;
        double height;              //To hold the height of the wall
        double totalBricks;         //To hold the total number of bricks
        double totalPallets;        //To hold the total number of pallets
        double overallCost;         //To hold the final cost of materials
        
        String inputString;         //To hold input from the user
        
        JOptionPane.showMessageDialog(null, "Please enter the dimensions of "
                + "the wall");
        
        inputString = JOptionPane.showInputDialog("Width: ");
        length = Double.parseDouble(inputString) * 12;
        
        inputString = JOptionPane.showInputDialog("Height: ");
        height = Double.parseDouble(inputString) * 12;
    
        
        Wall myWall =
                new Wall(length,height);
        
       JOptionPane.showMessageDialog(null, "Here are the dimensions of the wall");
       
       totalBricks = myWall.getBrickHeight() * myWall.getBrickLength();
       
       totalPallets = totalBricks / 500;
       
       overallCost = Math.ceil(totalPallets) * 250.00;
       
        
       JOptionPane.showMessageDialog(null,"Materials of the Wall"
               + "\n" + "=================================" 
               + "\n" + "Width: " + myWall.getLength() 
               + "\n" + "Height: " + myWall.getHeight() +"\n"
               + "Number of bricks long: " + Math.round(myWall.getBrickLength()) 
               + "\n"  
               + "Number of bricks tall: " + Math.round(myWall.getBrickHeight())
               + "\n" + "Total number of bricks: " + Math.round(totalBricks) 
               + "\n" + "Total number of pallets: " + Math.ceil(totalPallets) 
               +"\n" + String.format("Overall Cost: $%.2f",overallCost));
       
//       System.out.println("Width: "+
//               myWall.getLength());
//       
//       System.out.println("Height: "+
//               myWall.getHeight());
//       
//       System.out.println("Number of bricks wide: "+
//               Math.round(myWall.getBrickLength()));
//       
//       System.out.println("Number of bricks tall: "+
//               Math.round(myWall.getBrickHeight()));
//       
//       System.out.println("Total number of bricks: "+
//               Math.round(totalBricks));
       
       
        
        
    }
    /**
     * The getPillarMaterials method gets the measurements of the pillar from
     * the user and outputs the number of bricks plus the price of the materials
     * needed for one pillar. 
     */
    public static void getPillarMaterials()
    {
        double length;                  //To hold length of the pillar
        double width;                   //To hold width of the pillar
        double height;                  //To hold height of the pillar
       
        double brickVol;                //To hold the volume of brick
        double layerVol;                //To hold the volume of the layers
        double brickNum;                //To hold the numbers of bricks
        
        double totalBricks;             //To hold the total numbers of bricks
        double allTotalBricks = 0;
        double totalPallets;            //To hold the total numbers of pallets
        
        double overallCost;             //To hold the final cost
        
        String inputString;             //To hold input from the user
        
        
        JOptionPane.showMessageDialog(null, "Please enter the dimensions of "
                + "the pillar");
        
        inputString = JOptionPane.showInputDialog("Length: ");
        length = Double.parseDouble(inputString) * 12;
        
        inputString = JOptionPane.showInputDialog("Width: ");
        width = Double.parseDouble(inputString) * 12;
        
        inputString = JOptionPane.showInputDialog("Height");
        height = Double.parseDouble(inputString) * 12;
        
        Pillar myPillar = 
                new Pillar(length, width, height);
        
       JOptionPane.showMessageDialog(null, "Here are the dimensions of "
                + "the pillar ");
       
       brickVol = myPillar.getBrickVolume();
       
       layerVol = myPillar.getLayerVolume();
       
       brickNum = layerVol / brickVol;
       
       totalBricks = brickNum * myPillar.getLayers();
       
       totalPallets = totalBricks / 500;
       
       overallCost = Math.ceil(totalPallets) * 250.00;
       
       allTotalBricks = allTotalBricks + totalBricks;
       
        JOptionPane.showMessageDialog(null, "Materials of the Pillar"
               + "\n" + "=================================" 
               + "\n" + "Length: " + myPillar.getLength() 
               + "\n" + "Width: " + myPillar.getWidth() +"\n"
               + "Height: " + myPillar.getHeight() 
               + "\n"  
               + "Number of Layers: " + Math.ceil(myPillar.getLayers())
               + "\n" + "Total number of bricks per layer: " 
               + Math.round(brickNum) + "\n" 
               + "Total number of bricks: " + Math.ceil(allTotalBricks)
               + "\n" + "Total number of pallets: " + Math.ceil(totalPallets) 
               + "\n" + String.format("Overall Cost: $%.2f",overallCost));
       
//       System.out.println("Length: "+
//               myPillar.getLength());
//       
//       System.out.println("Width: "+
//               myPillar.getWidth());
//       
//       System.out.println("Height: "+
//               myPillar.getHeight());
//       
//       System.out.println("Layer Count: "+
//               Math.ceil(myPillar.getLayers()));
//       
//       System.out.println("Total number of bricks per layer: "+
//               Math.round(brickNum));
//       
//       System.out.println("The total number of bricks is: "+
//               Math.ceil(allTotalBricks));
       
    }
    /**
     * The getRampMaterials method will take user input and convert them into 
     * the materials needed/cost of creating a ramp. 
     */
    public static void getRampMaterials()
    {
        double height;                         //To hold height of the ramp
        double length;                         //To hold length of the ramp
        double rampSide;                       //To hold one side of bricks
        
        double totalBricks;                    //To hold total number of bricks
        double totalPallets;                   //To hold total number of pallets
        double overallCost;                    //To hold final cost
        
        String inputString;                    //To hold user input
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
        
       JOptionPane.showMessageDialog(null, "Here are the dimensions of "
                + "the ramp ");
       
       totalBricks = myRamp.getRampHeight() * myRamp.getRampLength();
       
       totalPallets = totalBricks / 500;
       
       overallCost = Math.ceil(totalPallets) * 250.00;
       
       rampSide = totalBricks / 2;
       
       JOptionPane.showMessageDialog(null, "Materials of the Ramp"
               + "\n" + "=================================" 
               + "\n" + "Height: " + myRamp.getRampHeight() 
               + "\n" + "Length: " + myRamp.getRampLength() +"\n"
               + "Total number of bricks for one side: " 
               + rampSide
               + "\n"  
               + "Total number of bricks: " + totalBricks
               + "\n" + "Total number of pallets: " + Math.ceil(totalPallets) 
               + "\n" + String.format("Overall Cost: $%.2f",overallCost));
        
//       System.out.println("Height: "+
//               myRamp.getRampHeight());
//       
//       System.out.println("Length: "+
//               myRamp.getRampLength());
//       
//       System.out.println("Total number of bricks: "
//               + totalBricks);
//       
//       System.out.println("Total number of bricks for one side: "
//               + rampSide);

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
        
        String inputString;                 //To hold user input
        
        double length;                      //To hold length of the arch
        double width;                       //To hold width of the arch
        double height;                      //To hold height of the arch
        
        double totalBricks;                 //Total number of bricks
        double totalPallets;                //To hold total number of pallets
        double overallCost;                 //To hold final cost
        
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
        
        totalBricks = Math.round(myArch.getArchLength()) * 
               Math.round(myArch.getArchHeight()) 
               * Math.round(myArch.getArchWidth());
        
       totalPallets = totalBricks / 500;
       
       overallCost = Math.ceil(totalPallets) * 250.00;
        
        JOptionPane.showMessageDialog(null, "Materials of the Arch"
               + "\n" + "=================================" 
               + "\n" + "Length: " + myArch.getLength() 
               + "\n" + "Width: " + myArch.getWidth() +"\n"
               + "Height: " + myArch.getHeight()
               + "\n"  
               + "Total number of bricks: " + Math.round(totalBricks)
               + "\n" + "Total number of pallets: " + Math.ceil(totalPallets) 
               + "\n" + String.format("Overall Cost: $%.2f",overallCost));
        
//       System.out.println("Length: "+
//               myArch.getArchLength());
//       
//       System.out.println("Width: "+
//               myArch.getArchWidth());
//       
//       System.out.println("Height: "+
//               myArch.getArchHeight());
//       
//       
//       System.out.println("Total Bricks Needed: "+
//               totalBricks);
       
    }
   
    
}
