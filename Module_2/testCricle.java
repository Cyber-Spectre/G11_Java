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
public class testCricle {
    
    public static void main(String[] args) {
        System.out.println(cricle.getCount());
        cricle cricle1 = new cricle();
        cricle cricle2 = new cricle(2.0);
        cricle cricle3 = new cricle(3.0, "blue");
        System.out.println(cricle1.toString() + "\n The circle is " + cricle1.getColour() + ", has a radius of " + cricle1.getRadius() + " and an area of " + cricle1.getArea());
        System.out.println(cricle2.toString() + "\n The circle is " + cricle2.getColour() + ", has a radius of " + cricle2.getRadius() + " and an area of " + cricle2.getArea());
        System.out.println(cricle3.toString() + "\n The circle is " + cricle3.getColour() + ", has a radius of " + cricle3.getRadius() + " and an area of " + cricle3.getArea());
        System.out.println(cricle.getCount());
    }
    
}
