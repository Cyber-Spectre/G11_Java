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
        System.out.println(clyinder.Cly_getCount());
        clyinder clyinder1 = new clyinder();
        clyinder clyinder2 = new clyinder(2.0);
        clyinder clyinder3 = new clyinder(3.4, 6.8);
        clyinder clyinder4 = new clyinder(2.9, 5.3, "blurple");
        System.out.println(clyinder1.Cly_toString() + "\n The cylinder is " + clyinder1.Cly_getColour() + ", has a radius of " + clyinder1.Cly_getRadius() + ", a base area of " + clyinder1.Cly_getArea() + ", a surface area of " + clyinder1.Cly_getSurfArea() + " and a volume of " + clyinder1.Cly_getVolume());
        System.out.println(clyinder2.Cly_toString() + "\n The cylinder is " + clyinder2.Cly_getColour() + ", has a radius of " + clyinder2.Cly_getRadius() + ", a base area of " + clyinder2.Cly_getArea() + ", a surface area of " + clyinder2.Cly_getSurfArea() + " and a volume of " + clyinder2.Cly_getVolume());
        System.out.println(clyinder3.Cly_toString() + "\n The cylinder is " + clyinder3.Cly_getColour() + ", has a radius of " + clyinder3.Cly_getRadius() + ", a base area of " + clyinder3.Cly_getArea() + ", a surface area of " + clyinder3.Cly_getSurfArea() + " and a volume of " + clyinder3.Cly_getVolume());
        System.out.println(clyinder4.Cly_toString() + "\n The cylinder is " + clyinder4.Cly_getColour() + ", has a radius of " + clyinder4.Cly_getRadius() + ", a base area of " + clyinder3.Cly_getArea() + ", a surface area of " + clyinder4.Cly_getSurfArea() + " and a volume of " + clyinder4.Cly_getVolume());
        System.out.println(clyinder.Cly_getCount());
        
    }
    
}
