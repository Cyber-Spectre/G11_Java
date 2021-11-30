/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File_Streaming;

/**
 *
 * @author 105337005
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
public class SkillBuild2 {
    
    public static void main(String[] args) {
        
        String path = "C:\\Users\\105337005\\Documents\\NetBeansProjects\\G11_Java\\src\\main\\java\\File_Streaming\\";
        File firstName = new File(path + "firstNames.txt");
        String firstData = "";
        String [] firstArray = new String[21];
        File lastName = new File(path + "lastName.txt");
        String lastData = "";
        String [] lastArray = new String[21];
        File landName = new File(path + "land.txt");
        String landData = "";
        String [] landArray = new String[21];
        int e = 0;
        Scanner myReader;
        Random rand;
        
        if (firstName.exists()) {
            System.out.println("File \"firstNames.txt\" found.");
        }
        else {
            System.out.println("File \"firstNames.txt\" does not exist, stopping program.");
            System.exit(e);
        }
        
        if (lastName.exists()) {
            System.out.println("File \"lastName.txt\" found.");
        }
        else {
            System.out.println("File \"lastName.txt\" does not exist, stopping program.");
            System.exit(e);
        }
        
        if (landName.exists()) {
            System.out.println("File \"land.txt\" found.");
        }
        else {
            System.out.println("File \"land.txt\" does not exist, stopping program.");
            System.exit(e);
        }
        
        System.out.println("\n");
        
        try {
            myReader = new Scanner(firstName);
            
            while (myReader.hasNextLine()) {
                e++;
                firstData = myReader.nextLine();
                firstArray[e] = firstData;
            }
            myReader.close();
            e = 0;
        } 
        catch (FileNotFoundException i) {
            
        System.out.println("An error occurred.");
        i.printStackTrace();
        }
        try {
            myReader = new Scanner (lastName);
            
            while (myReader.hasNextLine()) {
                e++;
                lastData = myReader.nextLine();
                lastArray[e] = lastData;
            }
            myReader.close();
            e = 0;
        } 
        catch (FileNotFoundException i) {
            
        System.out.println("An error occurred.");
        i.printStackTrace();
        }
        try {
            myReader = new Scanner(landName);
            
            while (myReader.hasNextLine()) {
                e++;
                landData = myReader.nextLine();
                landArray[e] = landData;
            }
            myReader.close();
            e = 0;
        } 
        catch (FileNotFoundException i) {
            
        System.out.println("An error occurred.");
        i.printStackTrace();
        }
        
        for (int x = 0; x < 20; x++) {
            
            rand = new Random();
            
            int firstRand = rand.nextInt(20) + 1;
            int lastRand = rand.nextInt(20) + 1;
            int landRand = rand.nextInt(20) + 1;
            
            System.out.println(firstArray[firstRand] + " " + lastArray[lastRand] + " of " + landArray[landRand]);
            
        } 
        /* extra special feature (1% chance with 25% chance to continue after happening)
        (0.015625% chance to get them all)
        */
        rand = new Random();
        int specialRand = rand.nextInt(100) + 1;
        
            if(specialRand == 1) {
                System.out.println("Donald Trump of Beyond the Wall");
                specialRand = rand.nextInt(100) + 1;
                
                if(specialRand <= 25) {
                    System.out.println("Elon Musk of SpaceX");
                    specialRand = rand.nextInt(100) + 1;
                    
                    if(specialRand <= 25) {
                        System.out.println("Chris Pratt of the Mushroom Kingdom");
                        specialRand = rand.nextInt(100) + 1;
                        
                        if(specialRand <= 25) {
                            System.out.println("Paul Blart of Mall Cop");
                        }
                    }
                }
            }
    }
}
