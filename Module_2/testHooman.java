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
public class testHooman {
    
    public static void main(String[] args) {
        Hooman hooman1 = new Hooman();
        Hooman hooman2 = new Hooman("Joe", 36);
        Hooman hooman3 = new Hooman("Billy", 69, "Fresno");
        System.out.println(hooman1.checkName());
        System.out.println(hooman1.toString());
        System.out.println(hooman1.birthday());
        hooman1.add(17, 8);
        System.out.println(hooman2.checkName());
        System.out.println(hooman2.toString());
        System.out.println(hooman2.birthday());
        hooman2.add("eight", "five");
        System.out.println(hooman3.checkName());
        System.out.println(hooman3.toString());
        System.out.println(hooman3.birthday());
        hooman3.add("efgheghjh", "seven");
        
    }

}
