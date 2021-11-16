/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module_3_Arrays;

/**
 *
 * @author 105337005
 */
public class Mastery1 {
    
    public static void main(String[] args) {
        
        int [] array = new int[200001];
        int valHold;
        boolean check = false;
        for (int x = 2; x < array.length; x++) {
            
            array[x] = x;
            
        }
        
        for (int x = 2; x < array.length; x++) {
            
            if ((x % 2) != 0) {
                valHold = (x - 1) / 2;
            }
            else {
                valHold = x / 2;
            }
            
            check = false;
            
            for (int y = 2; y < valHold; y++) {
            
                if (array[x] % y == 0) {
                    check = true;
                }
            
            }
            
            if(!check) {
                System.out.println(array[x]);
            }
        }
        
    }
    
}
