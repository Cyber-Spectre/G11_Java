/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module_2;

/**
 *
 * @author 105337005
 */
public class testClyinder {
    
    public static void main(String[] args) {
        System.out.println(clyinder.getCount());
        clyinder clyinder1 = new clyinder();
        clyinder clyinder2 = new clyinder(2.0);
        clyinder clyinder3 = new clyinder(3.4, 6.8);
        clyinder clyinder4 = new clyinder(2.9, 5.3, "blurple");
        System.out.println(clyinder1.toString() + "\n The cylinder is " + clyinder1.getColour() + ", has a radius of " + clyinder1.getRadius() + ", a base area of " + clyinder1.getArea() + ", a surface area of " + clyinder1.getSurfArea() + " and a volume of " + clyinder1.getVolume());
        System.out.println(clyinder2.toString() + "\n The cylinder is " + clyinder2.getColour() + ", has a radius of " + clyinder2.getRadius() + ", a base area of " + clyinder2.getArea() + ", a surface area of " + clyinder2.getSurfArea() + " and a volume of " + clyinder2.getVolume());
        System.out.println(clyinder3.toString() + "\n The cylinder is " + clyinder3.getColour() + ", has a radius of " + clyinder3.getRadius() + ", a base area of " + clyinder3.getArea() + ", a surface area of " + clyinder3.getSurfArea() + " and a volume of " + clyinder3.getVolume());
        System.out.println(clyinder4.toString() + "\n The cylinder is " + clyinder4.getColour() + ", has a radius of " + clyinder4.getRadius() + ", a base area of " + clyinder3.getArea() + ", a surface area of " + clyinder4.getSurfArea() + " and a volume of " + clyinder4.getVolume());
        System.out.println(clyinder.getCount());
        
    }
    
}
