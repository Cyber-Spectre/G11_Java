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
                + "2: Display array \n"
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
                    
                    System.out.println("YX || X1 | X2 | X3 | X4 | X5 | X6 | X7 | X8 | X9 | X10 | X11 | X12 | X13 | X14 | X15 | X16 | X17 | X18 | X19 | X20");
                    
                    for (int y = 1; y < array.length; y++) {
                        
                        System.out.println("Y" + y + " || " + array[1][y] + " | " 
                                + array[2][y] + " | " + array[y][2] + " | " + array[y][4] 
                                + " | " + array[5][y] + " | " + array[6][y] + " | " 
                                + array[7][y] + " | " + array[8][y] + " | " + array[9][y] 
                                + " | " + array[10][y] + " | " + array[11][y] + " | " 
                                + array[12][y] + " | " + array[13][y] + " | " + array[14][y]
                                + " | " + array[15][y] + " | " + array[16][y] + " | " 
                                + array[17][y] + " | " + array[18][y] + " | " + array[19][y]
                                + " | " + array[20][y]);
                        
                    }
                    
                    System.out.println("\n");
                    
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
