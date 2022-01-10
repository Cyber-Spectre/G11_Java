/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Project;

import java.util.Random;
import java.util.Scanner;
import java.awt.Desktop; 
import java.io.*;
/**
 *
 * @author 105337005
 */
public class glue {
    
    public static Scanner scan1 = new Scanner(System.in);
    public static Random rand = new Random();
    
    public static String path = "C:\\Users\\105337005\\Documents\\NetBeansProjects\\G11_Java\\src\\main\\java\\Final_Project\\";
    
    public static String[] arrChars;
    public static String[] arrWeaps;
    public static String[] arrRooms;
    
    public static int charID;
    public static int weapID;
    public static int roomID;
    
    public static int [] weapLoc = new int[9];
    public static int locHold;
    public static boolean [] locCheck = new boolean[9];
    
    public static boolean [] isSearched = new boolean[9];
    public static String [] isSearchedStr = new String[9];
    
    public static int turn;
    public static int turns = 20;
    public static int dice;
    
    public static boolean whilePrint;
    public static boolean isReady = false;
    
    public glue(String[] arrChars, int charID, String[] arrWeaps, int weapID, String[] arrRooms, int roomID) {
        
        this.arrChars = arrChars;
        this.arrWeaps = arrWeaps;
        this.arrRooms = arrRooms;
        this.charID = charID;
        this.weapID = weapID;
        this.roomID = roomID;
    }
    
    public static void Setup() {
        System.out.println("\n"
            + "/-----------------------------------------------------------------\\\n"
            + "|Welcome to Glue!                                                 |\n"
            + "|                                                                 |\n"
            + "|You are a detective that was called to a mansion to investigate  |\n"
            + "|the murder of the owner.                                         |\n"
            + "|                                                                 |\n"
            + "|There are 6 suspects, you have to investigate rooms, looking     |\n"
            + "|for items that could be used as weapons, determine what was used |\n"
            + "|as a weapon and what room the murder took place in, then question|\n"
            + "|suspects to see how they respond.                                |\n"
            + "|                                                                 |\n"
            + "|You must successfully guess the weapon, room, and murderer at    |\n"
            + "|the same time to arrest them, get any wrong and you start at     |\n"
            + "|square one!                                                      |\n"
            + "\\-----------------------------------------------------------------/\n"
            + "\n"
            + "Please input an option: \n"
            + "1) Start Game \n"
            + "2) Quit Game \n");
        
        scan1 = new Scanner(System.in);
        int input = scan1.nextInt();
        
        switch(input) {
            case 1:
                Startup();
            break;
            
            case 2:
                Quit();
            break;
        }
    }
    
    public static void Startup() {
        for (int x = 0; x < 9; x++) {
            locCheck[x] = false;
            isSearched[x] = false;
        }
        
        String [] charNames = new String[6];
        for (int x = 0; x < 6; x++) { //sets character name displays
            charNames[x] = "";
            whilePrint = true;
            scan1 = new Scanner(arrChars[x]);
            for (int y = 0; whilePrint; y++) {
                if(arrChars[x].charAt(y) != '|') {
                    charNames[x] = charNames[x] + arrChars[x].charAt(y);   
                }
                else {
                    whilePrint = false;
                }
            }
        }
        
        String [] roomNames = new String[9];
        for (int x = 0; x < 9; x++) { //sets room name displays
            roomNames[x] = "";
            whilePrint = true;
            scan1 = new Scanner(arrRooms[x]);
            for (int y = 0; whilePrint; y++) {
                if(arrRooms[x].charAt(y) != '|') {
                    roomNames[x] = roomNames[x] + arrRooms[x].charAt(y);
                }
                else {
                    whilePrint = false;
                }
            }
        }
        
        for (int x = 0; x < 6; x++) { //sets weapon locations
            locHold = rand.nextInt(9);
            if(locCheck[locHold]) {
                x--;
            }
            else {
                weapLoc[locHold] = x;
                locCheck[locHold] = true;
            }
        }
        
        System.out.println("\n"
            + "-----------------------------------------------------------------\n"
            + "There are six suspects, these suspects are as follows: \n"
            + charNames[0] + "\n"
            + charNames[1] + "\n"
            + charNames[2] + "\n"
            + charNames[3] + "\n"
            + charNames[4] + "\n"
            + charNames[5] + "\n"
            + "-----------------------------------------------------------------\n");
        System.out.println("There are nine rooms of interest, you must investigate them for clues"
            + "The rooms are as follows: \n"
            + roomNames[0] + "\n"
            + roomNames[1] + "\n"
            + roomNames[2] + "\n"
            + roomNames[3] + "\n"
            + roomNames[4] + "\n"
            + roomNames[5] + "\n"
            + roomNames[6] + "\n"
            + roomNames[7] + "\n"
            + roomNames[8] + "\n"
            + "-----------------------------------------------------------------\n");
        System.out.println("You will have " + turns + " turns\n"
            + "Each turn you will roll a dice which decides your moves\n"
            + "Each action costs one move"
            + "When you run out of moves, you are forced to return to the main room\n"
            + "When you run out of turns, you are given a final guess\n"
            + "If you get that guess wrong, you lose\n"
            + "You are allowed to guess at any time, but guessing wrong has consequences\n"
            + "\n"
            + "When you are ready to start, enter \"1\"");
        
        while (!isReady) {
            scan1 = new Scanner(System.in);
            int input = scan1.nextInt();
            if (input == 1) {
                isReady = true;
                turn = 1;
                Play();
            }
        }
    }
    
    public static void Play() {
        
        System.out.println("-----------------------------------------------------------------\n"
            + "Turn " + turn + " of " + turns + "\n"
            + "Choose how hard you want to roll your dice: (1-10)");
        
        isReady = false;
        
        while (!isReady) {
            scan1 = new Scanner(System.in);
            int input = scan1.nextInt();
            if (input > 0 && input < 11) {
                for (int x = 0; x < input; x++) {
                    dice = rand.nextInt(6) + 1;
                }
                isReady = true;
            }
            else {
                System.out.println("Invalid input");
            }
        }
        
        System.out.println("You rolled a " + dice);
        
    }
    
    public static void Quit() {
        File quitImg = new File(path + "understandable.jpg");   
        try {
            if(!Desktop.isDesktopSupported()) {
                System.out.println("Not supported.");  
                return;  
            }
            Desktop desktop = Desktop.getDesktop();  
            if(quitImg.exists()) {
                desktop.open(quitImg);
            }
        }
        catch (Exception e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();  
        }
        System.exit(0);
    }
}
