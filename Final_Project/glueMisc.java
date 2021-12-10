/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 105337005
 */

public class glueMisc {
    
    public static void main(String[] args) {
        
        Random rand;
        Scanner scan1;
        
        String path = "C:\\Users\\105337005\\Documents\\NetBeansProjects\\G11_Java\\src\\main\\java\\Final_Project\\";
        File chars = new File(path + "characters.txt");
        File weapons = new File(path + "weapons.txt");
        File rooms = new File(path + "rooms.txt");
        
        String [] arrChars = new String[5];
        boolean [] charCheck = new boolean[26];
        for (int x = 0; x < 26; x++) {
            charCheck[x] = false;
        }
        String [] arrWeap = new String[5];
        boolean [] weapCheck = new boolean[26];
        for (int x = 0; x < 26; x++) {
            weapCheck[x] = false;
        }
        String [] arrRooms = new String[8];
        boolean [] roomCheck = new boolean[26];
        for (int x = 0; x < 26; x++) {
            roomCheck[x] = false;
        }
        
        if (chars.exists()) {
            System.out.println("File \"characters.txt\" found.");
        } 
        else {
            System.out.println("\"characters.txt\" does not exist, stopping program.");
            System.exit(0);
        }
        if (weapons.exists()) {
            System.out.println("File \"weapons.txt\" found.");
        } 
        else {
            System.out.println("\"weapons.txt\" does not exist, stopping program.");
            System.exit(0);
        }
        if (rooms.exists()) {
            System.out.println("File \"rooms.txt\" found.");
        } 
        else {
            System.out.println("\"rooms.txt\" does not exist, stopping program.");
            System.exit(0);
        }
        System.out.println("All files found, setting up game.");
        
        try {
            scan1 = new Scanner(chars);
            String [] charHold = new String[26];
        }
        catch (FileNotFoundException i) {
            System.out.println("An error occurred.");
            i.printStackTrace();
        }
        
        for (int x = 0; x < 5; x++) {

            rand = new Random();

            int charRand = rand.nextInt(26) + 1;

            if (charCheck[x]) {
                x--;
            }
            else {
                if (charRand > 18) {
                    int specRand = rand.nextInt(99) + 1;
                    if (specRand < 20) {
                        
                    }
                }
            }
            
        }
    }
}
