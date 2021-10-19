package Module_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 105337005
 */
public class cricle {
    
    private double radius = 1.0;
    
    private String colour = "red";
    
    private static int count = 0;
    
    public cricle() {
        
        count++;
        
    }
    
    public cricle(double radius) {
        
        this.radius = radius;
        count++;
        
    }
    
    public cricle(double radius, String colour) {
        
        this.radius = radius;
        this.colour = colour;
        count++;
        
    }
    
    public double getRadius() {
        return radius;
    }
    
    public String getColour() {
        
        return colour;
        
    }
    
    public void setRadius(double radius) {
        
        this.radius = radius;
        
    }
    
    public void setColour(String colour) {
        
        this.colour = colour;
        
    }
    
    public String toString() {
        
        return("Radius = " + radius + ", Colour = " + colour);
        
    }
    
    public double getArea() {
        double area = ((radius * radius) * 3.14);
        
        return area;
    }
    
    public static String getCount() {
        
        return("circle count: " + count);
        
    }
}
