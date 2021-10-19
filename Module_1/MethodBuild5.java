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
public class MethodBuild5 {
    
    public static void main(String[] args) {
        
        Scanner scan1 = new Scanner(System.in);
        
        System.out.println("input a number between 1 and 100");
        
        String num = scan1.nextLine();
        num = numerals (num);
        
        System.out.println(num);
        
    }
    
    //takes input, converts string to int, then turns int value into Roman Numerals, then returns numerals in a string
    public static String numerals(String num) {
        
        int num2 = Integer.valueOf(num);
        String result = "";
        
        int C = 0; //100
        int LC = 0; //90
        int L = 0; //50
        int XL = 0; //40
        int X = 0; //10
        int VX = 0; //9
        int V = 0; //5
        int IV = 0; //4
        int I = 0; //1 
        
        String C_ =  "C";
        String LC_ = "LC";
        String L_ = "L";
        String XL_ = "XL";
        String X_ = "X";
        String VX_ = "VX";
        String V_ = "V";
        String IV_ = "IV";
        String I_ = "I";
        
        while (num2 >= 1) {
        if (num2 >= 100) {
                while (num2 >= 100) {
                    num2 = (num2 - 100);
                    C = (C + 1);
                }
                for (int Z = 0; Z < C; Z++) {
                    result = result + C_;
                }
        }
            else if (num2 >= 90) {
                while (num2 >= 90) {
                    num2 = (num2 - 90);
                    LC = (LC + 1);
                }
                for (int Z = 0; Z < LC; Z++) {
                    result = result + LC_;
                }
        }
            else if (num2 >= 50) {
                while (num2 >= 50) {
                    num2 = (num2 - 50);
                    L = (L + 1);
                }
                for (int Z = 0; Z < L; Z++) {
                    result = result + L_;
                }
        }
            else if (num2 >= 40) {
                while (num2 >= 40) {
                    num2 = (num2 - 40);
                    XL = (XL + 1);
                }
                for (int Z = 0; Z < XL; Z++) {
                    result = result + XL_;
                }
        }
            else if (num2 >= 10) {
                while (num2 >= 10) {
                    num2 = (num2 - 10);
                    X = (X + 1);
                }
                for (int Z = 0; Z < X; Z++) {
                    result = result + X_;
                }
        }
            else if (num2 >= 9) {
                while (num2 >= 9) {
                    num2 = (num2 - 9);
                    VX = (VX + 1);
                }
                for (int Z = 0; Z < VX; Z++) {
                    result = result + VX_;
                }
        }
            else if (num2 >= 5) {
                while (num2 >= 5) {
                    num2 = (num2 - 5);
                    V = (V + 1);
                }
                for (int Z = 0; Z < V; Z++) {
                    result = result + V_;
                }
        }
            else if (num2 >= 4) {
                while (num2 >= 4) {
                    num2 = (num2 - 4);
                    IV = (IV + 1);
                }
                for (int Z = 0; Z < IV; Z++) {
                    result = result + IV_;
                }
        }
            else if (num2 >= 1) {
                while (num2 >= 1) {
                    num2 = (num2 - 1);
                    I = (I + 1);
                }
                for (int Z = 0; Z < I; Z++) {
                    result = result + I_;
                }
        }
        
    }
        
        return result;
        
    }
    
    
    
}
