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
        System.out.println(hooman1.toString());
        hooman1.add(7, 8);
        System.out.println(hooman2.toString());
        hooman2.add("eight", "five");
        System.out.println(hooman3.toString());
        hooman3.add("efgheghjh", "seven");
    }
    
}
