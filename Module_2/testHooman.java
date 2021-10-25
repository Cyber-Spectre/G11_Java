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
        Hooman hooman3 = new Hooman("Billy", 69, "Bogor");
        
        System.out.println(Hooman.checkName(hooman1));
        System.out.println(hooman1.toString());
        Hooman.birthday(hooman1);
        hooman1.add(17, 8);
        
        System.out.println(Hooman.checkName(hooman2));
        System.out.println(hooman2.toString());
        Hooman.birthday(hooman2);
        hooman2.add("eight", "five");
        
        System.out.println(Hooman.checkName(hooman3));
        System.out.println(hooman3.toString());
        Hooman.birthday(hooman3);
        hooman3.add("efgheghjh", "seven");
        
    }

}
