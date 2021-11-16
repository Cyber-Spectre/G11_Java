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
public class Mastery1_1 {
    
    public static void main(String[] args) {
        
        boolean [] array = new boolean[200001];
        
        System.out.println("Please wait a moment");
        
        for (int x = 2; x < array.length; x++) {
            array[x] = true;
            }
        
        for (int x = 2; x < array.length; x++) {
            
            if (array[x]) {
                
                for (int y = (x + 1); y < array.length; y++) {
                    
                    if (y % x == 0) {
                        array[y] = false;
                    }
                } 
            }
        }
        
        for (int x = 2; x < array.length; x++) {
            
            if (array[x]) {
                System.out.println(x);
            }
        }
    }
}