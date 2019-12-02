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
        final double BRICK_LENGTH =  210.0;
        final double BRICK_HEIGHT = 64.0;
        final double BRICK_WIDTH = 98.4;
        
        
        int menuChoice = 0;
        
        String inputString;
        
        boolean exit = false;
        
     do
      {
        
        try
        {
       
        inputString = JOptionPane.showInputDialog("Please enter a 1 or 2"
                +" for the menu option"
                +"\n1.Find Materials for a Wall"
                +"\n2.Find Materials for a Ramp"
                +"\n3.Find Materials for a Pillar"
                +"\n4.Find MAterials for an Arch"
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
                getRampMaterials();
                break;

            case 3:
                JOptionPane.showMessageDialog(null, "You have selected "
                        +" menu choice number 3.");
                getPillarMaterials();
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
    
    public static void getWallMaterials()throws IOException
    {
        double length;
        double width;
        double height;
        
        String inputString;
        
        JOptionPane.showMessageDialog(null, "Please enter the dimensions of "
                + " the wall");
        
        inputString = JOptionPane.showInputDialog("Length: ");
        length = Double.parseDouble(inputString);
        
        inputString = JOptionPane.showInputDialog("Width: ");
        width = Double.parseDouble(inputString);
        
        inputString = JOptionPane.showInputDialog("Height: ");
        height = Double.parseDouble(inputString);
        
        Wall myWall =
                new Wall(length, width, height);
        
    }
   
    
}
