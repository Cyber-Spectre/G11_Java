/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Project;

import java.io.File;
import java.io.FileNotFoundException;
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
        
        String [] charHold = new String[27];//setup variables
        String [] weapHold = new String[27];
        String [] roomHold = new String[27];
        
        int charID;//identifiers for guilty
        int weapID;
        int roomID;
        
        String [] arrChars = new String[6];//character variables
        int [] charCheck = new int[27];//0 = false, 1 = true, 2 = special true
        for (int x = 0; x < arrChars.length; x++) {
            charCheck[x] = 0;
        }
        String [] arrWeaps = new String[6];//weapon variables
        boolean [] weapCheck = new boolean[27];
        for (int x = 0; x < arrWeaps.length; x++) {
            weapCheck[x] = false;
        }
        String [] arrRooms = new String[9];//room variables
        boolean [] roomCheck = new boolean[27];
        for (int x = 0; x < arrRooms.length; x++) {
            roomCheck[x] = false;
        }
        //check if files exist
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
        System.out.println("All files found, setting up game. \n");
        //set object holders
        try {
            scan1 = new Scanner(chars);
            for (int x = 0; x < charHold.length;) {
                while(scan1.hasNextLine()) {
                    charHold[x] = scan1.nextLine();
                    x++;
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        try {
            scan1 = new Scanner(weapons);
            for (int x = 0; x < weapHold.length;) {
                while(scan1.hasNextLine()) {
                    weapHold[x] = scan1.nextLine();
                    x++;
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        try {
            scan1 = new Scanner(rooms);
            for (int x = 0; x < roomHold.length;) {
                while(scan1.hasNextLine()) {
                    roomHold[x] = scan1.nextLine();
                    x++;
                }
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace(); 
        }
        
        rand = new Random();
        
        for (int x = 0; x < 6; x++) {//set characters
            
            int charRand = rand.nextInt(27);
            if (charCheck[charRand] == 1 || charCheck[charRand] == 2) {
                x--;
            }
            else {
                if (charRand >= 18) {
                    int specRand = rand.nextInt(100) + 1;
                    if (specRand <= 20) {
                        arrChars[x] = charHold[charRand];
                        charCheck[charRand] = 2;
                    }
                    else {
                        x--;
                    }
                }
                else {
                    arrChars[x] = charHold[charRand];
                    charCheck[charRand] = 1;
                }
            } 
        }
        charID = rand.nextInt(6);
        System.out.println("Characters set.");
        
        for (int x = 0; x < 6; x++) {//set weapons
            
            int weapRand = rand.nextInt(19);
            if (weapCheck[weapRand]) {
                x--;
            }
            else {
                arrWeaps[x] = weapHold[weapRand];
                weapCheck[weapRand] = true;
            }
        }
        
        int weapShuf;
        boolean [] weapShufHold = new boolean[6];
        for (int x = 0; x < 6; x++) {
            weapShufHold[x] = false;
        }
        for (int x = 17; x < charCheck.length; x++) {
            if(charCheck[x] == 2) {
                boolean whileSet = false;
                while(!whileSet) {
                    weapShuf = rand.nextInt(6);
                    if (!weapShufHold[weapShuf]) {
                        arrWeaps[weapShuf] = weapHold[x];
                        whileSet = true;
                        weapShufHold[weapShuf] = true;
                    }
                }
            }
        }
        weapID = rand.nextInt(6);
        System.out.println("Weapons set.");
        
        for (int x = 0; x < 9; x++) {//set rooms
            
            int roomRand = rand.nextInt(27);
            if (roomCheck[roomRand]) {
                x--;
            }
            else {
                arrRooms[x] = roomHold[roomRand];
                roomCheck[roomRand] = true;
            }
        }
     roomID = rand.nextInt(9);
        System.out.println("Rooms set. \n");
     
        System.out.println("Everything is set up! Starting...");
        
        glue setup = new glue(arrChars, charID, arrWeaps, weapID, arrRooms, roomID);
        glue.Setup();
    }
}
