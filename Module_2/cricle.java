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
    
    protected double radius = 1.0;
    
    protected String colour = "red";
    
    protected static int count = 0;
    
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
        double area = ((radius * radius) * Math.PI);
        area = area * 100;
        area = Math.round(area);
        area = area / 100;
        
        return area;
    }
    
    public static String getCount() {
        
        return("circle count: " + count);
        
    }
}

class clyinder extends cricle {
    
    private double height = 1.0;
    
    public clyinder() {
        
        count++;
    }
    
    public clyinder(double radius) {
        
        this.radius = radius;
        count++;
    }
    
    public clyinder(double radius, double height) {
        
        this.radius = radius;
        this.height = height;
        count++;
    }
    
    public clyinder(double radius, double height, String colour) {
        
        this.radius = radius;
        this.height = height;
        this.colour = colour;
        count++;
    }
    
    public double getHeight() {
        
        return height;
        
    }
    
    public void setHeight(double height) {
        
        this.height = height;
        
    }
    
    public String toString() {
        
        return("Radius = " + radius + ", Colour = " + colour + ", Height = " + height);
        
    }
    
    public double getVolume () {
        
        double volume = Math.PI * (radius * radius) * height;
        volume = volume * 100;
        volume = Math.round(volume);
        volume = volume / 100;
        
        return volume;
        
    }
    
    public double getSurfArea() {
        
        double surfArea = ((2 * (Math.PI * radius * height)) + (2 * (Math.PI * (radius * radius))));
        surfArea = surfArea * 100;
        surfArea = Math.round(surfArea);
        surfArea = surfArea / 100;
        
        return surfArea;
        
    }
    
}
