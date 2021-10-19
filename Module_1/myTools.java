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
import java.util.Scanner;
public class myTools {
    
    public static void main(String[] args) {
        
        
        int input = digitAt (573845923);
        
        System.out.println(input);
        
        
        
        
    }
    
    public static int ErrorTrap(int m1, int m2) {
        
        Scanner scan1 = new Scanner(System.in);
        
        int n1 = scan1.nextInt();
            
            if (n1 >= m1 && n1 <= m2){
                System.out.println("Accepted");
            }
            else if (n1 < m1 || n1 > m2){
                System.out.println("Denied");
                n1 = 0;
            }
        
        
        
        return n1;
    }
    
    public static double ErrorTrap(double m1, double m2) {
        
        Scanner scan1 = new Scanner(System.in);
        
        double n1 = scan1.nextInt();
            
            if (n1 >= m1 && n1 <= m2){
                System.out.println("Accepted");
            }
            else if (n1 < m1 || n1 > m2){
                System.out.println("Denied");
                n1 = 0;
            }
        
        
        
        return n1;
        
    }
    
    public static int ErrorTrapInt(double m1, double m2) {
        
        Scanner scan1 = new Scanner(System.in);
        
        double n1 = scan1.nextInt();
            
            if (n1 >= m1 && n1 <= m2){
                System.out.println("Accepted");
            }
            else if (n1 < m1 || n1 > m2){
                System.out.println("Denied");
                n1 = 0;
            }
        
        int num = (int) Math.round(n1);
        
        return num;
        
    }
    
    public static int ranNumGen (int r1, int r2) {
        
        Random rand = new Random();
        int output;
        
        if (r1 < r2) {
            
            output = rand.nextInt(r2 - r1 + 1) + r1;
            
        }
        else {
            output = rand.nextInt(r1 - r2 + 1) + r2;
        }
        
        return output;
        
    }
    
    public static int digitAt (int input) {
        
        Scanner scan1 = new Scanner(System.in);
        
        String input2 = Integer.toString(input);
        
        System.out.println("What digit do you want to take from the number?\n"
                + "Number: " + input);
        
        int digit = scan1.nextInt();
        
        digit = digit - 1;
        
        char digit2 = input2.charAt(digit);
        
        String digit3 = Character.toString(digit2);
        int digit4 = Integer.valueOf(digit3);
        
        return digit4;
        
    }
    
    public static char charAt (String input) {
        
        char output = input.charAt(0);
        
        return output;
        
    }
    
}
