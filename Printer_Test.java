package material_calculator;
import javax.swing.JOptionPane;
import java.io.*;
public class Material_Calculator 
{

    public static void main(String[] args) throws FileNotFoundException 
    {
        JOptionPane.showMessageDialog(null, "This is a Small Test.");
        
        int num1, num2, num3;
        int total;
        String input;
        String filename;
        
        JOptionPane.showMessageDialog(null, "This Will Print A Statement");
        
        input = JOptionPane.showInputDialog("Enter the First Number: ");
        num1 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the First Number: ");
        num2 = Integer.parseInt(input);
        
        input = JOptionPane.showInputDialog("Enter the First Number: ");
        num3 = Integer.parseInt(input);
        
        total = num1 + num2 + num3;
        JOptionPane.showMessageDialog(null, "\nYou entered " + num1 + ", " +
                                            + num2 + " & " + num3
                                            + "\nThe Total is: " + total);
        
        filename = JOptionPane.showInputDialog("Enter the filename.");
        PrintWriter outputFile = new PrintWriter(filename);
        
    }    
}
