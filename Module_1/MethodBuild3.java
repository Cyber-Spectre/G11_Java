package Module_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 105337005
 */
import java.util.Random;
public class MethodBuild3 {
    
    public static void main(String[] args) {
        
        int input1 = ranNum (1, 10);
        System.out.println(input1);
            
        int input2 = ranNum (38, 17);
        System.out.println(input2);
        
        int input3 = ranNum (100, 1);
        System.out.println(input3);
        
        int input4 = ranNum (1, 2);
        System.out.println(input4);
        
    }
    
    // takes input, finds lower number for first int, then returns a random number between the two ints
    public static int ranNum(int n1, int n2) {
        
        Random rand = new Random();
        int output;
        
        if (n1 < n2) {
            
            output = rand.nextInt(n2 - n1 + 1) + n1;
            
        }
        else {
            output = rand.nextInt(n1 - n2 + 1) + n2;
        }
        
        return output;
    }
    
}
