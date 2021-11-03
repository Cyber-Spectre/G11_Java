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
        
        int [] array = new int[101];
        int numHolder;
        boolean run = true;
        Scanner scan1 = new Scanner(System.in);
        Random rand = new Random();
        
        do{
        
        System.out.println("Please select an option: \n"
            + "0: Exit program \n"
            + "1: Populate the array randomly \n"
            + "2: Populate the array sequentially from 1 to 100 \n"
            + "3: Display the array \n"
            + "4: Shuffle the array \n"
            + "5: Find number \n"
            + "6: Ascending order check \n"
            + "7: Shuffle until ascending order \n");
        
        int input = scan1.nextInt();
        
        switch(input) {
            
            case 0: //Exit program
                
                run = false;
                
            break;
            
            case 1: //Populate randomly
                
                for (int x = 0; x < array.length; x++) {
                    
                    array [x] = (rand.nextInt(101));
                    
                }
                
            break;
            
            case 2: //populate sequentially
                
                for (int x = 0; x < array.length; x++) {
                    
                    array [x] = (x);
                    
                }
                
            break;
            
            case 3: //display
                
                for(int x = 1; x < array.length; x++) {
                    
                    boolean check = true;
                    
                    System.out.println("Array number " + (x) + ": " + array[x]);  
                
                }
                
                System.out.println("\n");
                
            break;
            
            case 4: //shuffle
                
                for(int x = 0; x < array.length; x++) {
                    
                    int temp = array[x];
                    
                    int random = rand.nextInt(100);
                    
                    array[x] = array[random];
                    
                    array[random] = temp;
                    
                }
                
            break;
            
            case 5: //Find number
                
                int findNum;
                
                System.out.println("Input a number you want to find \n");
                
                findNum = scan1.nextInt();
                String holder = "null";
                
                for (int x = 0; x < array.length; x++) {
                    
                    if(array[x] == findNum) {
                        holder = ("Array number " + x + ": " + array[x] + "\n");
                    }
                    
                }    
                
                if(holder == "null") {
                    findNum = -1;
                    System.out.println("No array has that value: " + findNum + "\n");
                }
                else {
                    System.out.println(holder);
                }
                    
            break;
            
            case 6: //Check Ascending order
                
                boolean check = true;
                
                for (int x = 0; x < array.length; x++) {
                    
                    if(array[x] != x) {
                        
                        check = false;
                        
                    }
                    
                }
                  
                if(!check) {
                    System.out.println("Array is not in ascending order \n");
                }
                else {
                    System.out.println("Array is in ascending order \n");
                }
                
            break;
            
            case 7: //shuffle until ascending order
                
                boolean check2 = true;
                
                for (int y = 0; y < 100001; y++) {
                    
                    int temp = array[x];

                    int random = rand.nextInt(100);

                    array[x] = array[random];

                    array[random] = temp;
                    
                    check2 = true;
                    
                    for (int x = 0; x < array.length; x++) {
                        
                        if(array[x] != x) {

                            check2 = false;
                            
                        }

                    }
                    
                    if(check2) {
                        System.out.println("Successfully shuffled to ascending order \n");
                        break;
                    }
                    else if(y == 100000) {
                        System.out.println("Too many shuffle attempts, stopping \n");
                        break;
                    }
                }
                
            break;
            
            }
           
        }
        while (run);    
        
    }
    
}
