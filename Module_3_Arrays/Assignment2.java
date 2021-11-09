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
import java.util.Random;
import java.util.Scanner;
public class Assignment2 {
    
    public static void main(String[] args) {
        
        int [][] array = new int[21][21];
        boolean run = true;
        Scanner scan1 = new Scanner(System.in);
        Random rand = new Random();
        
        do {
        
            System.out.println("Please select an option: \n"
                + "0: Exit program \n"
                + "1: Populate the array randomly \n"
                + "2: Display array"
                + "3: Find 3x3 array with highest sum \n");

            int input = scan1.nextInt();

            switch(input) {

                case 0: //Exit program
                    
                    run = false;
                    
                break;
                
                case 1: //Populate randomly
                    
                    for (int x = 1; x < array.length; x++) {
                        
                        for (int y = 1; y < array.length; y++) {
                            
                            array[x][y] = rand.nextInt(101);
                            
                        }
                        
                    }
                    
                break;
                
                case 2:
                    
                    for (int x = 1; x < array.length; x++) {
                        
                        System.out.println("X" + x + " || " + array[x][1] + " | " 
                                + array[x][2] + " | " + array[x][2] + " | " + array[x][4] 
                                + " | " + array[x][5] + " | " + array[x][6] + " | " 
                                + array[x][7] + " | " + array[x][8] + " | " + array[x][9] 
                                + " | " + array[x][10] + " | " + array[x][11] + " | " 
                                + array[x][12] + " | " + array[x][13] + " | " + array[x][14]
                                + " | " + array[x][15] + " | " + array[x][16] + " | " 
                                + array[x][17] + " | " + array[x][18] + " | " + array[x][19]
                                + " | " + array[x][20] + "\n");
                        
                    }
                    
                break;
                
                case 3: //Find highest 3x3 sum
                    
                    int tempsum = 0;
                    int sum = 0;
                    
                    for (int x = 1; x < (array.length - 2); x++) {
                        
                        for (int y = 1; y < (array.length - 2); y++) {
                            
                            tempsum = (array[x][y] + array[x][y + 1] +array[x][y + 2]
                                + array[x + 1][y] + array[x + 1][y + 1] + array[x + 1][y + 2]
                                + array[x + 2][y] + array[x + 2][y + 1] + array[x+ 2][y + 2]);
                            
                            if(tempsum > sum) {
                                sum = tempsum;
                            }
                            
                        }
                        
                    } 
                    
                    System.out.println("The highest 3x3 sum is " + sum + "\n");
                    
                break;

            }
            
        }
        while(run);
        
    }
    
}