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
public class RomanNumerals {
    
    public static void main(String[] args) {
        
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number");
        
        int num = scan1.nextInt();
        
        int M = 0; //1000
        int CM = 0; //900
        int D = 0; //500
        int CD = 0; //400
        int C = 0; //100
        int LC = 0; //90
        int L = 0; //50
        int XL = 0; //40
        int X = 0; //10
        int VX = 0; //9
        int V = 0; //5
        int IV = 0; //4
        int I = 0; //1 
        
        String result = "";
        
        String M_ = "M";
        String CM_ = "CM";
        String D_ = "D";
        String CD_ = "CD";
        String C_ =  "C";
        String LC_ = "LC";
        String L_ = "L";
        String XL_ = "XL";
        String X_ = "X";
        String VX_ = "VX";
        String V_ = "V";
        String IV_ = "IV";
        String I_ = "I";
        
        if (num <=3000) {
        
        while (num >= 1) {
            if (num >= 1000) {
                while (num >= 1000) {
                    num = (num - 1000);
                    M = (M + 1);
                }
                for (int Z = 0; Z < M; Z++) {
                    result = result + M_;
                }
        }
            else if (num >= 900) {
                while (num >= 900) {
                    num = (num - 900);
                    CM = (CM + 1);
                }
                for (int Z = 0; Z < CM; Z++) {
                    result = result + CM_;
                }
        }
            else if (num >= 500) {
                while (num >= 500) {
                    num = (num - 500);
                    D = (D + 1);
                }
                for (int Z = 0; Z < D; Z++) {
                    result = result + D_;
                }
        }
            else if (num >= 400) {
                while (num >= 400) {
                    num = (num - 400);
                    CD = (CD + 1);
                }
                for (int Z = 0; Z < CD; Z++) {
                    result = result + CD_;
                }
        }
            else if (num >= 100) {
                while (num >= 100) {
                    num = (num - 100);
                    C = (C + 1);
                }
                for (int Z = 0; Z < C; Z++) {
                    result = result + C_;
                }
        }
            else if (num >= 90) {
                while (num >= 90) {
                    num = (num - 90);
                    LC = (LC + 1);
                }
                for (int Z = 0; Z < LC; Z++) {
                    result = result + LC_;
                }
        }
            else if (num >= 50) {
                while (num >= 50) {
                    num = (num - 50);
                    L = (L + 1);
                }
                for (int Z = 0; Z < L; Z++) {
                    result = result + L_;
                }
        }
            else if (num >= 40) {
                while (num >= 40) {
                    num = (num - 40);
                    XL = (XL + 1);
                }
                for (int Z = 0; Z < XL; Z++) {
                    result = result + XL_;
                }
        }
            else if (num >= 10) {
                while (num >= 10) {
                    num = (num - 10);
                    X = (X + 1);
                }
                for (int Z = 0; Z < X; Z++) {
                    result = result + X_;
                }
        }
            else if (num >= 9) {
                while (num >= 9) {
                    num = (num - 9);
                    VX = (VX + 1);
                }
                for (int Z = 0; Z < VX; Z++) {
                    result = result + VX_;
                }
        }
            else if (num >= 5) {
                while (num >= 5) {
                    num = (num - 5);
                    V = (V + 1);
                }
                for (int Z = 0; Z < V; Z++) {
                    result = result + V_;
                }
        }
            else if (num >= 4) {
                while (num >= 4) {
                    num = (num - 4);
                    IV = (IV + 1);
                }
                for (int Z = 0; Z < IV; Z++) {
                    result = result + IV_;
                }
        }
            else if (num >= 1) {
                while (num >= 1) {
                    num = (num - 1);
                    I = (I + 1);
                }
                for (int Z = 0; Z < I; Z++) {
                    result = result + I_;
                }
        }
        
    }
        
        
        System.out.println(result);
        
        }
        else {
            System.out.println("That number is too high");
        }
    
}
}
