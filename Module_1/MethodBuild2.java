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
public class MethodBuild2 {
    
    public static void main(String[] args) {
        
        int input1 = sum (2743);
        System.out.println(input1);
            
        int input2 = sum (5836);
        System.out.println(input2);
        
        int input3 = sum (28);
        System.out.println(input3);
        
        int input4 = sum (0);
        System.out.println(input4);
        
    }
    
    //takes input, separates numbers, then adds them together
    public static int sum(int num) {
        
        int n1 = num / 1000;
        int r1 = num % 1000;
        
        int n2 = r1 / 100;
        int r2 = r1 % 100;
        
        int n3 = r2 / 10;
        int r3 = r2 % 10;
        
        int n4 = r3;
        
        int sumNum = (n1 + n2 + n3 + n4);
        
        return sumNum;
        
    }
  
    
}
