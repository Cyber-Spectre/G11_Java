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
public class MethodBuild1 {
    
    public static void main(String[] args) {
        
        int input1 = middleNum (5, 2, 8);
        System.out.println(input1);
            
        int input2 = middleNum (12, 38, 69);
        System.out.println(input2);
        
        int input3 = middleNum (73, 86, 52);
        System.out.println(input3);
        
        int input4 = middleNum (3, 3, 8);
        System.out.println(input4);
        
    }
    
    //takes 3 inputs, finds the middle number, returns middle number
    public static int middleNum(int n1, int n2, int n3) {
        
        int midNum = 0;
        
        if (((n1 >= n2) && (n1 <= n3)) || ((n1 <= n2) && (n1 >= n3))){
            midNum = n1;
        }
        if (((n2 >= n1) && (n2 <= n3)) || ((n2 <= n1) && (n2 >= n3))){
            midNum = n2;
        }
        if (((n3 >= n1) && (n3 <= n2)) || ((n3 <= n1) && (n3 >= n2))){
            midNum = n3;
        }
        
        return midNum;
        
    }
    
}
