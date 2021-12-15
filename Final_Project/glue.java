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
        String [] charNames = new String[6];
        
        for (int x = 0; x < 6; x++) {
            charNames[x] = "";
            boolean whilePrint = true;
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
        System.out.println("\n"
            + "-----------------------------------------------------------------\n"
            + "There are six suspects, these suspects are as follows: \n"
                + charNames[0] + "\n"
                + charNames[1] + "\n"
                + charNames[2] + "\n"
                + charNames[3] + "\n"
                + charNames[4] + "\n"
                + charNames[5] + "\n");
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
    }
}
