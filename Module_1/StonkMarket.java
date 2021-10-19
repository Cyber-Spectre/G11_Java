package Module_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 105337005
 */
import java.util.Scanner;
import java.util.Random;
public class StonkMarket {
    
    public static void main(String[] args) {
        
        boolean playAgain = true;
        
        //stonk variables
        double facebookValue = 180;
        int facebookStonk = 0;
        double googleValue = 1285;
        int googleStonk = 0;
        double microsoftValue = 161;
        int microsoftStonk = 0;
        double teslaValue = 702;
        int teslaStonk = 0;
        
        //misc variables
        double money = 10000.0;
        int day = 1;
        int sharedStonk = 0;
        double stonkValue = 0;
        
        display (facebookValue, facebookStonk, googleValue, googleStonk, microsoftValue, microsoftStonk, teslaValue, teslaStonk, money, sharedStonk, stonkValue, day, playAgain);
    }
    
    public static void display (double fbValue, int fbStonk, double gglValue, int gglStonk, double msValue, int msStonk, double tslValue, int tslStonk, double money, int sharedStonk, double stonkValue, int day, boolean playAgain) {
        
        
        boolean inProgress = true;
        Scanner scan1 = new Scanner(System.in);
        
        do{
            
            sharedStonk = (fbStonk + gglStonk + msStonk + tslStonk);
            stonkValue = ((fbStonk * fbValue) + (gglStonk * gglValue) + (msStonk * msValue) + (tslStonk * tslValue));
            stonkValue = 100 * stonkValue;
            stonkValue = Math.round(stonkValue);
            stonkValue = stonkValue/100;
        
        System.out.println("Day " + day + "\n"
            + "\n"
            + "==============================\n"
            + "Facebook:\n"
                + "---- $" + fbValue + "\n"
                + "---- " + fbStonk + " stonks\n"
            + "\n"
                        
            + "Google:\n"
                + "---- $" + gglValue + "\n"
                + "---- " + gglStonk + " stonks\n"
            + "\n"
            + "MicroSoft:\n"
                + "---- $" + msValue + "\n"
                + "---- " + msStonk + " stonks\n"
            + "\n"
            + "Tesla:\n"
                + "---- $" + tslValue + "\n"
                + "---- " + tslStonk + " stonks\n"
            + "==============================\n"
            + "\n"
            + "You have $" + money + "\n"
            + "You have " + sharedStonk + " stonks\n"
            + "Your stonks are worth $" + stonkValue + "\n"
            + "\n"
            + "What would you like to do?\n"
            + "==============================\n"
            + "(0) Next day\n"
            + "(1) Buy Stonks\n"
            + "(2) Sell Stonks");
        
        int menuChoice = scan1.nextInt();
        
        if (menuChoice == 0) {
            day++;
            
            fbValue = updatePrice (fbValue);
            gglValue = updatePrice (gglValue);
            msValue = updatePrice (msValue);
            tslValue = updatePrice (tslValue);
        }
        else if (menuChoice == 1){
            System.out.println("What stonks would you like to buy?\n"
                    + "1: Facebook\n"
                    + "2: Google\n"
                    + "3: MicroSoft\n"
                    + "4: Tesla");
            
            int buyChoice = scan1.nextInt();
            
            if (buyChoice == 1) {
                int oldFbStonk = fbStonk;
                fbStonk = buyPhase (fbValue, fbStonk, money);
                money = updateMoney_Buy (oldFbStonk, fbStonk, fbValue, money);
            }
            else if (buyChoice == 2) {
                int oldGglStonk = gglStonk;
                gglStonk = buyPhase (gglValue, gglStonk, money);
                money = updateMoney_Buy (oldGglStonk, gglStonk, gglValue, money);
            }
            else if (buyChoice == 3) {
                int oldMsStonk = msStonk;
                msStonk = buyPhase (msValue, msStonk, money);
                money = updateMoney_Buy (oldMsStonk, msStonk, msValue, money);
            }
            else if (buyChoice == 4) {
                int oldTslStonk = tslStonk;
                tslStonk = buyPhase (tslValue, tslStonk, money);
                money = updateMoney_Buy (oldTslStonk, tslStonk, tslValue, money);
            }
        }
        else if (menuChoice == 2) {
            System.out.println("What stonks would you like to sell?\n"
                    + "1: Facebook\n"
                    + "2: Google\n"
                    + "3: MicroSoft\n"
                    + "4: Tesla");
            
            int sellChoice = scan1.nextInt();
            
            if (sellChoice == 1) {
                int oldFbStonk = fbStonk;
                fbStonk = sellPhase (fbValue, fbStonk);
                money = updateMoney_Sell (oldFbStonk, fbStonk, fbValue, money);
            }
            else if (sellChoice == 2) {
                int oldGglStonk = gglStonk;
                gglStonk = sellPhase (gglValue, gglStonk);
                money = updateMoney_Sell (oldGglStonk, gglStonk, gglValue, money);
            }
            else if (sellChoice == 3) {
                int oldMsStonk = msStonk;
                msStonk = sellPhase (msValue, msStonk);
                money = updateMoney_Sell (oldMsStonk, msStonk, msValue, money);
            }
            else if (sellChoice == 4) {
                int oldTslStonk = tslStonk;
                tslStonk = sellPhase  (tslValue, tslStonk);
                money = updateMoney_Sell (oldTslStonk, tslStonk, tslValue, money);
            }
        }
        else if (menuChoice == 88224646) {
            money = 20000;
        }
        if (money >= 20000) {
                    System.out.println("You've won, you doubled your money in " + day + " days");
                    playAgain = false;
                }
                else if (sharedStonk == 0 && money < 100) {
                    System.out.println("You've gone bankrupt, you lost!");
                    playAgain = false;
                    
                }
                else if (day == 365) {
                    System.out.println("You ran out of days, you lost!");
                    playAgain = false;
                }
        }
        while (playAgain);
        
    }
    
    public static double updatePrice (double price) {
        
        Random rand = new Random();
        
        int updown = rand.nextInt(2);
                        if (updown == 0) {updown = -1;}
                        int bigSmall = rand.nextInt(100) + 1;
                        double change = 0.0;
                        if (bigSmall <= 80) {
                            change = rand.nextInt(25) + 5;
                            change = change / 10.0;
                        }
                         else if (bigSmall <= 85) {
                            change = rand.nextInt(10) + 5;
                        }
                        else {change = 0;}
                        
                        price = price + (updown * (change /100) * price);
                        price = 100 * price;
                        price = Math.round(price);
                        price = price/100;
        
                        return price;
    }
    
    public static int buyPhase (double shareValue, int shareAmount, double money) {
        
        Scanner scan1 = new Scanner(System.in);
        boolean buyPhase = true;
        double moneyX;
        int quantity;
        
        while (buyPhase) {
            
            System.out.println("How many stonks would you like to buy?\n"
                + "Cost: $" + shareValue + "\n"
                + "Stocks owned: " + shareAmount);
            
            quantity = scan1.nextInt();
            
            moneyX = (quantity * shareValue);
                if (moneyX > money) {
                    System.out.println("Not enough money for that");
                }
                else {
                    shareAmount = shareAmount + quantity;
                    buyPhase = false;
                }
            
        }
        
        return shareAmount;
          
    }
    
    public static double updateMoney_Buy (int oldStonk, int newStonk, double stonkValue, double money) {
        
        int stonkBought = (newStonk - oldStonk);
        
        money = (money - (stonkBought * stonkValue));
        
        return money;
        
    }
    
    public static int sellPhase (double shareValue, int shareAmount) {
        
        Scanner scan1 = new Scanner(System.in);
        boolean sellPhase = true;
        int quantity;
        
        while (sellPhase) {
        System.out.println("How many stonks would you like to sell?\n"
            + "Worth: $" + shareValue + "\n"
            + "Stocks owned: " + shareAmount);
        quantity = scan1.nextInt();
        if (quantity > shareAmount) {
            System.out.println("You don't have that many stocks");
        }
        else {
            shareAmount = shareAmount - quantity;
            sellPhase = false;
        }
        }
        return shareAmount;
    }
    
    public static double updateMoney_Sell (int oldStonk, int newStonk, double stonkValue, double money) {
        
        int stonkSold = (oldStonk - newStonk);
        
        money = (money + (stonkSold * stonkValue));
        
        return money;
        
    }
    
}