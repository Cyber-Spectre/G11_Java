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
public class RotatingSign {
    
    public static void main(String[] args) {
        
        Scanner scan1 = new Scanner(System.in);
        
        String signList;
        Boolean signWorks = true;
        int signLength = 0;
        
        System.out.println("Please write what text you want on the sign");
        
        signList = scan1.next();
        
        for(int i = 0; i < signList.length(); i++) {    
            if(signList.charAt(i) != ' ')    
                signLength ++;   
            //I, O, S, H, Z, X, and N
            
         }
        if (signLength <= 30) {
        
        for (int v = 0; v < signList.length(); v++) {
        if (signList.charAt(v) != 'I') {
            if (signList.charAt(v) != 'O') {
                if (signList.charAt(v) != 'S') {
                    if (signList.charAt(v) != 'H') {
                        if (signList.charAt(v) != 'Z') {
                            if (signList.charAt(v) != 'X') {
                                if (signList.charAt(v) != 'N') {
                                    signWorks = false;
                                }
                            }
                        }
                    }
                }
                
            }
        }
        
    }
        
        if (signWorks) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    
}
        else {
            System.out.println("Too many characters");
        }
    }
}

