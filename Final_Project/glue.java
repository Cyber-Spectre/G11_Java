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
    public static boolean d4;
    
    public static int chance;
    
    public static int inputInt;
    public static String inputStr;
    
    
    public static boolean whilePrint;
    public static boolean whileChoice;
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
        inputInt = scan1.nextInt();
        
        switch(inputInt) {
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
        System.out.println("There are nine rooms of interest, you must investigate them for clues\n"
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
        System.out.println("Please read the following so you know what you're doing\n"
            + "\n"
            + "You will have " + turns + " turns\n"
            + "Each turn you will roll a dice which decides your moves\n"
            + "Actions starting with a + don't use a move\n"
            + "Actions starting with a - cost one move\n"
            + "When you run out of moves, you are forced to return to the main room\n"
            + "When you run out of turns, you are given a final guess\n"
            + "If you get that guess wrong, you lose\n"
            + "You are allowed to guess at any time, but guessing wrong has consequences\n"
            + "\n"
            + "When you are ready to start, enter \"1\"");
        
        while (!isReady) {
            scan1 = new Scanner(System.in);
            inputInt = scan1.nextInt();
            if (inputInt == 1) {
                isReady = true;
                turn = 1;
                RoundStart();
            }
        }
    }
    
    public static void RoundStart() {
        
        System.out.println("-----------------------------------------------------------------\n"
            + "Turn " + turn + " of " + turns + "\n"
            + "Choose how hard you want to roll your dice: (1-10)");
        
        isReady = false;
        
        while (!isReady) {
            scan1 = new Scanner(System.in);
            String input = scan1.nextLine();
            try {
                if (Integer.valueOf(input) > 0 && Integer.valueOf(input) < 11) {
                    for (int x = 0; x < Integer.valueOf(input); x++) {
                        dice = rand.nextInt(6) + 1;
                    }
                    isReady = true;
                }
                else {
                    System.out.println("Number out of range");
                }
            }
            catch (Exception e) {
                System.out.println("Input a number");
            }
        }
        
        System.out.println("You rolled a " + dice);
        
        System.out.println("-----------------------------------------------------------------\n"
            + "Please select an action:\n"
            + "1) +Search a room \n"
            + "2) +Question suspect\n"
            + "3) +C H E E S E\n"
            + "4) +Guess killer\n");
        
        if (dice == 1) {
            System.out.println("5) +Lucky roll\n");
        }
        
        scan1 = new Scanner(System.in);
        inputInt = scan1.nextInt();
        
        whileChoice = false;
        
        while (!whileChoice) {
            try {
                switch(inputInt) {
                    case 1:
                        

                        break;
                    case 2:

                        break;
                    case 3:
                        whileChoice = true;
                        Cheese();
                        break;
                    case 4:

                        break;
                    case 5:
                        if (dice == 1) {
                            whileChoice = true;
                            LuckyRoll();
                        }
                        else {
                        break;
                        }
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
    }
    
    public static void RoundMain() {
        
    }
    
    public static void Rooms() {
        
    }
    
    public static void Cheese() {
        
        System.out.println("-----------------------------------------------------------------\n"
            + dice + " moves left\n"
            + "\n"
            + "You pull a piece of cheese out of your pocket\n"
            + "Eating the cheese can have the following effects:\n"
            + "70% chance of nothing happening and a move being wasted\n"
            + "20% chance to gain 3+ moves (2+ since you use one)\n"
            + "5% chance to gain 2+ turns\n"
            + "5% chance of it being blue cheese and you dying (lose the game instantly)\n"
            + "\n"
            + "Do you eat the cheese?\n"
                    + "1) -Yes\n"
                    + "2) +No\n");
        
        scan1 = new Scanner(System.in);
        inputInt = scan1.nextInt();
        
        if (inputInt == 1) {
            dice--;
            chance = rand.nextInt(100) + 1;
            if (chance <= 70) {
                System.out.println("Nothing happened.");
            }
            else if (chance <= 90) {
                System.out.println("The cheese gave you more moves!");
                dice = dice + 3;
            }
            else if (chance <= 95) {
                System.out.println("The cheese gave you more turns!!");
                turns = turns + 2;
            }
            else  {
                System.out.println("It was blue cheese, you died!!!");
                System.exit(0);
            }
        }
        else if (inputInt == 2) {
            RoundMain();
        }
    }
    
    public static void LuckyRoll() {
        
        System.out.println("=================================================================\n"
            + "Welcome to Lucky Roll!\n"
            + "\n"
            + "Lucky Roll gives you a chance to get more moves if you rolled a 1\n"
            + "You will have to make two 50/50 guesses\n"
            + "Getting one of them right lets you reroll (1-6)\n"
            + "Getting both of them right lets you roll two dice (2-12)\n"
            + "But, if you get both of them wrong, You lose 3 turns, and only get to roll a d4 next turn (1-4)\n"
            + "Alternatively, you can take your chance with cheese\n"
            + "Do you want to play Lucky Roll?\n"
            + "1) -Yes\n"
            + "2) +No\n");
        
        scan1 = new Scanner(System.in);
        inputInt = scan1.nextInt();
        
        whileChoice = false;
        
        while (!whileChoice) {
            try {
                switch(inputInt) {
                    case 1:
                        dice--;
                        int lucky1 = rand.nextInt(2) + 1;
                        String lucky2;
                        int luckyG1 = 0;
                        String luckyG2 = "";
                        
                        chance = rand.nextInt(2);
                        
                        if (chance == 0) {
                            lucky2 = "A";
                        }
                        else {
                            lucky2 = "B";
                        }
                        
                        whileChoice = false;
                        System.out.println("Choose either 1 or 2:");
                        while (!whileChoice) {
                            scan1 = new Scanner(System.in);
                            inputInt = scan1.nextInt();
                            
                            try {
                                if (inputInt == 1 || inputInt == 2) {
                                    whileChoice = true;
                                    luckyG1 = inputInt;
                                }
                                else {
                                    System.out.println("Invalid input");
                                }
                            }
                            catch (Exception e) {
                                System.out.println("Invalid input");
                            }
                        }
                        
                        whileChoice = false;
                        System.out.println("Choose either A or B:");
                        while (!whileChoice) {
                            scan1 = new Scanner(System.in);
                            inputStr = scan1.nextLine();
                            
                            if (inputStr == "A" || inputStr == "a") {
                                whileChoice = true;
                                luckyG2 = "A";
                            }
                            else if (inputStr == "B" || inputStr == "b") {
                                whileChoice = true;
                                luckyG2 = "B";
                            }
                            else {
                                System.out.println("Invalid input");
                            }
                        }
                        
                        int luckyScore = 0;
                        
                        if (lucky1 == luckyG1) {
                            luckyScore++;
                        }
                        if (lucky2 == luckyG2) {
                            luckyScore++;
                        }
                        
                        if (luckyScore == 2) {
                            
                        }
                        else if (luckyScore == 1) {
                            
                        }
                        else {
                            System.out.println("You got neither right! Better luck next time");
                            turns = turns - 2;
                            d4 = true;
                            
                        }
                        
                        break;
                    case 2:
                        
                        break;
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
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
