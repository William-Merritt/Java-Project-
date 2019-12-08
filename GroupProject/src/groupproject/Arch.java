package groupproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author The King
 */
public class Arch 
{
    private double height;
    private double length;
    private double width;
    
    /**
     * Constructor
     * @param len The length of the wall
     * @param w The width of the wall
     * @param h the height of the wall
     */
    
    public Arch(double len, double w, double h)
    {
        length = len;
        width = w;
        height = h;
    }
    
    /**
     * The setHeight method stores a value in the
     * height field.
     * @param h the value to store the height
     */
    
    public void setHeight(double h)
    {
        height = h;
    }
    
    /**
     * The setLength method stores a value in the
     * height field.
     * @param len the value to store the height
     */
    
    public void setLength(double len)
    {
        length = len;
    }
    
    /**
     * The setWidth method stores a value in the
     * height field.
     * @param w the value to store the height
     */
    
    public void setWidth(double w)
    {
        width = w;
    }
    
     /**
     * The getHeight method returns a objects
     * height.
     * @return The value of the height field.
     */
    
    public double getHeight()
    {
        return height;
    }
    
    /**
     * The getLength method returns a objects
     * length.
     * @return The value of the length field.
     */
    
    public double getLength()
    {
        return length; 
    }
    
    /**
     * The getWidth method returns a objects width
     * @return the value of the width field
     */
    
    public double getWidth()
    {
        return width;
    }
    
    public double getArchHeight()
    {
        return height / 2.5;
    }
    
    public double getArchLength()
    {
        return (length / 8.25) / 2;
    }
    
    public double getArchWidth()
    {
        return (width / 3.875);
    }
    
}
