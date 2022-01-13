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
    
    public static String [] charNames = new String[6];
    public static String [] weapNames = new String[6];
    public static String [] roomNames = new String[9];
    
    public static int [] weapLoc = new int[9];
    public static int locHold;
    public static boolean [] locCheck = new boolean[9];
    
    public static boolean [] roomSearched = new boolean[9];
    public static String [] roomSearchedStr = new String[9];
    public static boolean [] weapSearched = new boolean[6];
    
    public static int turn;
    public static int turns = 20;
    public static int dice;
    public static boolean d4;
    
    public static int chance;
    
    public static int input;
    
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
        input = scan1.nextInt();
        
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
            roomSearched[x] = false;
            weapSearched[x] = false;
        }
        
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
        
        for (int x = 0; x < 6; x++) { //sets weapon name displays
            weapNames[x] = "";
            whilePrint = true;
            scan1 = new Scanner(arrWeaps[x]);
            for (int y = 0; whilePrint; y++) {
                if(arrWeaps[x].charAt(y) != '|') {
                    weapNames[x] = weapNames[x] + arrWeaps[x].charAt(y);
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
            input = scan1.nextInt();
            if (input == 1) {
                isReady = true;
                turn = 1;
                RoundStart();
            }
        }
    }
    
    public static void RoundStart() {
        
        System.out.println("-----------------------------------------------------------------\n"
            + "Turn " + turn + " of " + turns);
        if (d4) {
            System.out.println("You have a d4 this turn, so you can only roll a 1-4\n"
                + "Choose how hard you want to roll (1-10)");
            
            isReady = false;
        
            while (!isReady) {
                scan1 = new Scanner(System.in);
                String input = scan1.nextLine();
                try {
                    if (Integer.valueOf(input) > 0 && Integer.valueOf(input) < 11) {
                        for (int x = 0; x < Integer.valueOf(input); x++) {
                            dice = rand.nextInt(4) + 1;
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
        }
        else {
            System.out.println("Choose how hard you want to roll (1-10)");
            
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
        }
        
        
        
        System.out.println("-----------------------------------------------------------------\n"
            + "Please select an action:\n"
            + "1) +Search a room \n"
            + "2) +Question suspect\n"
            + "3) +C H E E S E\n"
            + "4) +Guess killer");
        
        if (dice == 1) {
            System.out.println("5) +Lucky roll\n");
        }
        
        scan1 = new Scanner(System.in);
        input = scan1.nextInt();
        
        whileChoice = false;
        
        while (!whileChoice) {
            try {
                switch(input) {
                    case 1:
                        SearchStart();
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
                        break;
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
    }
    
    public static void RoundMain() {
        System.out.println("-----------------------------------------------------------------\n"
            + "Turn " + turn + " of " + turns + "\n"
            + "You have " + dice + " moves left\n"
            + "\n"
            + "1) +Search a room\n"
            + "2) +Question suspect\n"
            + "3) +C H E E S E\n"
            + "4) +Guess killer");
        
        scan1 = new Scanner(System.in);
        input = scan1.nextInt();
        
        whileChoice = false;
        
        while (!whileChoice) {
            try {
                switch(input) {
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
                }
            }
            catch (Exception e) {
                System.out.println("Invalid input");
            }
        }
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
        input = scan1.nextInt();
        
        if (input == 1) {
            dice--;
            chance = rand.nextInt(100) + 1;
            if (chance <= 70) {
                System.out.println("Nothing happened.");
                RoundMain();
            }
            else if (chance <= 90) {
                System.out.println("The cheese gave you more moves!");
                dice = dice + 3;
                RoundMain();
            }
            else if (chance <= 95) {
                System.out.println("The cheese gave you more turns!!");
                turns = turns + 2;
                RoundMain();
            }
            else  {
                System.out.println("It was blue cheese, you died!!!");
                System.exit(0);
            }
        }
        else if (input == 2) {
            RoundMain();
        }
    }
    
    public static void SearchStart() {
        System.out.println("What room would you like to search?\n"
            + "1) -" + roomNames[0] + "\n"
            + "2) -" + roomNames[1] + "\n"
            + "3) -" + roomNames[2] + "\n"
            + "4) -" + roomNames[3] + "\n"
            + "5) -" + roomNames[4] + "\n"
            + "6) -" + roomNames[5] + "\n"
            + "7) -" + roomNames[6] + "\n"
            + "8) -" + roomNames[7] + "\n"
            + "9) -" + roomNames[8] + "\n");
        
        scan1 = new Scanner(System.in);
        input = scan1.nextInt();
        
        switch(input) {
            case 1:
                SearchRoom(0);
                break;
            case 2:
                SearchRoom(1);
                break;
            case 3:
                SearchRoom(2);
                break;
            case 4:
                SearchRoom(3);
                break;
            case 5:
                SearchRoom(4);
                break;
            case 6:
                SearchRoom(5);
                break;
            case 7:
                SearchRoom(6);
                break;
            case 8:
                SearchRoom(7);
                break;
            case 9:
                SearchRoom(8);
                break;
        }
    }
    
    public static void SearchRoom(int input) {
        
        roomSearched[input] = true;
        
        System.out.println("-----------------------------------------------------------------\n"
            + "Room " + roomNames[input] + "\n"
            + "\n"
            + "What do you want to do in this room?\n"
            + "0) -Exit room\n"
                    + "1)Inspect room\n"
                    + "");
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
        input = scan1.nextInt();
        
        whileChoice = false;
        
        while (!whileChoice) {
            try {
                switch(input) {
                    case 1:
                        dice--;
                        int lucky1 = rand.nextInt(2) + 1;
                        int lucky2;
                        int luckyG1 = 0;
                        int luckyG2 = 0;
                        
                        chance = rand.nextInt(2);
                        
                        if (chance == 0) {
                            lucky2 = 3;
                        }
                        else {
                            lucky2 = 4;
                        }
                        
                        whileChoice = false;
                        System.out.println("Choose either 1 or 2:");
                        while (!whileChoice) {
                            scan1 = new Scanner(System.in);
                            input = scan1.nextInt();
                            
                            try {
                                if (input == 1 || input == 2) {
                                    whileChoice = true;
                                    luckyG1 = input;
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
                        System.out.println("Choose either 3 or 4:");
                        while (!whileChoice) {
                            scan1 = new Scanner(System.in);
                            input = scan1.nextInt();
                            
                            if (input == 3 || input == 4) {
                                whileChoice = true;
                                luckyG2 = input;
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
                            System.out.println("You got both right! choose how hard you want to reroll your dice (1-10");
                            
                            while (!isReady) {
                                scan1 = new Scanner(System.in);
                                String input = scan1.nextLine();
                                try {
                                    if (Integer.valueOf(input) > 0 && Integer.valueOf(input) < 11) {
                                        for (int x = 0; x < Integer.valueOf(input); x++) {
                                            int reroll1 = rand.nextInt(6) + 1;
                                            int reroll2 = rand.nextInt(6) + 1;
                                            dice = reroll1 + reroll2;
                                        }
                                        isReady = true;
                                        System.out.println("You rerolled a " + dice);
                                        RoundMain();
                                    }
                                    else {
                                        System.out.println("Number out of range");
                                    }
                                }
                                catch (Exception e) {
                                    System.out.println("Input a number");
                                }
                            }
                        }
                        else if (luckyScore == 1) {
                            System.out.println("You got one right, choose how hard you want to reroll your dice (1-10)");
                            
                            while (!isReady) {
                                scan1 = new Scanner(System.in);
                                String input = scan1.nextLine();
                                try {
                                    if (Integer.valueOf(input) > 0 && Integer.valueOf(input) < 11) {
                                        for (int x = 0; x < Integer.valueOf(input); x++) {
                                            int reroll1 = rand.nextInt(6) + 1;
                                            dice = reroll1;
                                        }
                                        isReady = true;
                                        System.out.println("You rerolled a " + dice);
                                        RoundMain();
                                    }
                                    else {
                                        System.out.println("Number out of range");
                                    }
                                }
                                catch (Exception e) {
                                    System.out.println("Input a number");
                                }
                            }
                        }
                        else {
                            System.out.println("You got neither right! Better luck next time");
                            turns = turns - 2;
                            d4 = true;
                            RoundStart();
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
