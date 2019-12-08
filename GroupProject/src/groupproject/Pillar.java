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
public class Pillar 
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
    
    public Pillar(double len, double w, double h)
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
        return height / 12;
    }
    
    /**
     * The getLength method returns a objects
     * length.
     * @return The value of the length field.
     */
    
    public double getLength()
    {
        return length / 12; 
    }
    
    /**
     * The getWidth method returns a objects width
     * @return the value of the width field
     */
    
    public double getWidth()
    {
        return width / 12;
    }
    
    /**
     * The getLayerVolume returns the number of layers in the pillar.
     * @return the number of layers.
     */
    
    public double getLayerVolume()
    {
        return length * width; 
    }
    
    /**
     * The getLayer method returns the number of layers.
     * @return the number of layers.
     */
    
    public double getLayers()
    {
        return height / 2.5;
    }
    
    /**
     * The getBrickVolume returns the brick volume per layers
     * @return brick volume
     */
    
    public double getBrickVolume()
    {
        return 8.25 * 3.875;
    }
}
