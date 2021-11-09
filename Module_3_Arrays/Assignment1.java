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
            + "7: Shuffle until ascending order \n"
            + "8: Scan for lowest value \n"
            + "9: Scan for highest value \n"
            + "10: Check how many times a number appears \n"
            + "11: replace all arrays with chosen value with another chosen value \n"
            + "12: Find 10 consecutive arrays with highest added sum \n");
        
        int input = scan1.nextInt();
        
        switch(input) {
            
            case 0: //Exit program
                
                run = false;
                
            break;
            
            case 1: //Populate randomly
                
                for (int x = 1; x < array.length; x++) {
                    
                    array [x] = rand.nextInt(100) + 1;
                    
                }
                
            break;
            
            case 2: //populate sequentially
                
                for (int x = 1; x < array.length; x++) {
                    
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
                
                for(int x = 1; x < array.length; x++) {
                    
                    int temp = array[x];
                    
                    int random = rand.nextInt(100) + 1;
                    
                    array[x] = array[random];
                    
                    array[random] = temp;
                    
                }
                
            break;
            
            case 5: //Find number
                
                int findNum;
                
                System.out.println("Input a number you want to find \n");
                
                findNum = scan1.nextInt();
                String holder = "null";
                
                for (int x = 1; x < array.length; x++) {
                    
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
                
                for (int x = 1; x < array.length - 1; x++) {
                    
                    if(array[x] >= array[(x + 1)]) {

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
                
                int counter = 1;
                
                for (int y = 1; y < 100001; y++) {
                    
                    if (counter <= (99)) {
                        counter++;
                    }
                    else {
                        counter = 1;
                    }
                    
                    if(counter < 99 && array[counter] >= array[counter + 1]) {

                        int temp = array[counter];

                        int random = rand.nextInt(100);
                        
                        if(array[random] >= array[random + 1]) {

                        array[counter] = array[random];

                        array[random] = temp;
                        
                        }
                        else {
                            y--;
                        }
                        
                    }
                    else if(array[counter] < array[counter - 1]) {
                        
                        int temp = array[counter];

                        int random = rand.nextInt(100);
                        
                        if(array[random] >= array[random + 1]) {

                        array[counter] = array[random];

                        array[random] = temp;
                        
                        }
                        
                    }
                    else {
                        y--;
                    }
                    
                    check2 = true;
                    
                    for (int x = 1; x < array.length - 1; x++) {
                        
                        if(array[x] > array[(x + 1)]) {

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
                
            case 8: //Scan for lowest
                
                int lowest = 999;
                int lowArray = 0;
                
                for (int x = 1; x < array.length; x++) {
                    
                    if(array[x] < lowest) {
                        lowest = array[x];
                        lowArray = x;
                    }
                    
                }
                
                System.out.println("Array " + lowArray + " has the lowest value of " + lowest + "\n");
                
            break;
            
            case 9: //Scan for highest
                
                int highest = 0;
                int highArray = 0;
                
                for (int x = 1; x < array.length; x++) {
                    
                    if(array[x] > highest) {
                        highest = array[x];
                        highArray = x;
                    }
                    
                }
                
                System.out.println("Array " + highArray + " has the highest value of " + highest + "\n");
                
            break;
            
            case 10: //check how many times a number appears
                
                int numAmount = 0;
                
                System.out.println("Input a number you want to find \n");
                
                findNum = scan1.nextInt();
                
                for (int x = 1; x < array.length; x++) {
                    
                    if(array[x] == findNum) {
                        numAmount++;
                    }
                    
                }
                
                if(numAmount == 0) {
                    System.out.println("No array has that value");
                }
                else {
                    System.out.println(numAmount + " arrays have that value");
                }
                
            break;
                
            case 11: //replace value with other value
                
                System.out.println("Input a value to find and a value to replace with");
                
                int value1 = scan1.nextInt();
                int value2 = scan1.nextInt();
                
                for (int x = 1; x < array.length; x++) {
                    
                    if(array[x] == value1) {
                        array[x] = value2;
                    }
                    
                    System.out.println("replaced all arrays with the value of " + value1 + " with " + value2 + "\n");
                    
                }
                
            break; 
            
            case 12: //Find 10 consecutive indexes with highest sum
                
                int tempsum = 0;
                int sum = 0;
                
                for (int x = 1; x < (array.length - 10); x++) {
                    
                    tempsum = (array[x] + array[x + 1] + array[x + 2] + array[x + 3]
                            + array[x + 4] + array[x + 5] + array[x + 6] + array[x + 7]
                            + array[x + 8] + array[x + 9] + array[x + 10]);
                    
                    if(tempsum > sum) {
                        sum = tempsum;
                    }
                }
                
                System.out.println("The highest sum of 10 consecutive indexes is " + sum + "\n");
                
            break;
            
            }
           
        }
        while (run);    
        
    }
    
}
