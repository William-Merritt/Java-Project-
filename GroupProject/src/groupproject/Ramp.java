/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

/**
 *
 * @author The King
 */
public class Ramp 
{
    private double length;
    private double height;
    
    /**
     * Constructor
     * @param len The length of the wall
     * @param h the height of the wall
     */
    
    public Ramp(double len, double h)
    {
        length = len;
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
     * The getSquareYards methods returns an objects square yards
     * @return the value of the square yards field.
     */
    
    public double getRampHeight()
    {
        return height / 2.5;
    }
    
    public double getRampLength()
    {
        return length / 8.25;
    }
} 
