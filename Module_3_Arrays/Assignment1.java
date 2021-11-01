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
import java.util.Scanner;
import java.util.Random;
public class Assignment1 {
    
    public static void main(String[] args) {
        
        int [] array = new int[100];
        int y;
        boolean run = true;
        Scanner scan1 = new Scanner(System.in);
        Random rand = new Random();
        
        do{
        
        System.out.println("Please select an option: \n"
            + "0: Exit program \n"
            + "1: Populate the array randomly \n"
            + "2: Populate the array sequentially from 1 to 100 \n"
            + "3: Display the array \n"
            + "4: Shuffle the array \n");
        
        int input = scan1.nextInt();
        
        switch(input) {
            
            case 0:
                
                run = false;
                
            break;
            
            case 1:
                
                for (int x = 0; x < 99; x++) {
                    
                    y = x + 1;
                    
                    array [y] = (int)(rand.nextInt(99) + 1);
                    
                }
                
            break;
            
            case 2:
                
                for (int x = 0; x < 99; x++) {
                    
                    y = x + 1;
                    
                    array [y] = (int)(y);
                    
                }
                
            break;
            
            case 3:
                
                for(int x = 0; x < 99; x++) {
                    
                    y = x + 1;
                    
                    System.out.println("Array number " + (y) + ": " + array[y]);  
                
                }
                
            break;
            
            case 4:
                
                for(int x = 0; x < 300; x++) {
                    
                    int r1;
                    int r2;
                    int temp;
                    
                    r1 = rand.nextInt(99);
                    r2 = rand.nextInt(99);
                    
                    temp = array[r1];
                    array[r1] = array[r2];
                    array[r2] = temp;
                    
                }
                
            break;
            
            }
           
        
        }
        while (run == true);    
        
    }
    
}
