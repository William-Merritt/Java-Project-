/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupproject;

/**
 *
 * @author merrittw1813
 */
public class Wall 
{
    private double length;
    private double height;
    
    /**
     * Constructor
     * @param len The length of the wall
     * @param h the height of the wall
     */
    
    public Wall(double len, double h)
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
     * length field.
     * @param len The value to store length.
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
        return height / 12;
    }
    
    
    /**
     * The getLength method returns a rectangle
     * object's length.
     * @return The value in the length field.
     */
    
    public double getLength()
    {
        return length / 12; 
    }
    
    
    /**
     * The getArea method returns a rectangle
     * object's length.
     * @return The value in the length field.
     */
    
    public double getBrickLength()
    {
        return length / 8.25;
    }
    
    /**
     * The getBrickHeight method returns a walls object
     * @objects length.
     * @return the value of the length field
     */
    
    public double getBrickHeight()
    {
        return height / 2.5;
    }
 
}
