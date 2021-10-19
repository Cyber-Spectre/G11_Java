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
import java.util.Scanner;
public class MethodBuild4 {
    
    public static void main(String[] args) {
        
       boolean run = true;
       Scanner scan1 = new Scanner(System.in);
       
       while (run == true) {
           
               System.out.println("input a minimum, maximum, and between number");
               
               int num1 = scan1.nextInt();
               int num2 = scan1.nextInt();
               int num3 = scan1.nextInt();
               int num = minMaxNum (num1, num2, num3);
           
               if (num == 1) {
                   System.out.println("Accepted");
                   run = false;
               }
               else {
                   System.out.println("Denied");
                   run = true;
               }
       }
        
    }
    
    //takes input, checks if third int is between first and second, and accepts if it is, otherwise denies and repeats
    public static int minMaxNum(int m1, int m2, int n1) {
        
        int accept;
        
        if (n1 >= m1 && n1 <= m2) {
            accept = 1;
        }
        else {
            accept = 0;
        }
        
        return accept;
    }
    
}
