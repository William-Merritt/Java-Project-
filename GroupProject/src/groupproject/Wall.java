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
    private double width;
    private double height;
    
    /**
     * Constructor
     * @param len The length of the wall
     * @param w The width of the wall
     * @param h the height of the wall
     */
    
    public Wall(double len, double w, double h)
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
     * length field.
     * @param len The value to store length.
     */
    
    public void setLength(double len)
    {
        length = len;
    }
    
     /**
     * The setWidth method stores a value in the
     * width field.
     * @param w The value to store length.
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
     * The getLength method returns a rectangle
     * object's length.
     * @return The value in the length field.
     */
    
    public double getLength()
    {
        return length; 
    }
    
    /**
     * The getWidth method returns a rectangle
     * object's length.
     * @return The value in the length field.
     */
    
    public double getWidth()
    {
        return width;
    }
    
    /**
     * The getArea method returns a rectangle
     * object's length.
     * @return The value in the length field.
     */
    
    public double getArea()
    {
        return length * width;
    }
 
}
