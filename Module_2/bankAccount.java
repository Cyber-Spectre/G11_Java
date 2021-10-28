/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Module_2;

/**
 *
 * @author 105337005
 */
public class bankAccount {
    //data variables
    private static int accountNum = 1000000;
    private int personalNum = 0;
    private String username = "R̴E̸D̷A̷C̵T̴E̴D̵";
    private double balance = 00.00;
    private double annualInterest = 1.25;
    private double withdrawFee = 1.5;
    
    public bankAccount() {
        //Constructor with no inputs, increases accountNum by 1
        accountNum++;   
        personalNum = accountNum;
    }
    
    public bankAccount(String username) {
        /*
        Constructor with username input, sets username, if username exceeds 20
        characters, use default username, increases accountNum by 1
        */
        accountNum++;
        personalNum = accountNum;
        if (username.length() > 20) {
            System.out.println("That username is too long, using default username");
        }
        else {
            this.username = username;
        }
        
    }
    
    public bankAccount(double balance) {
        /*
        Constructor with balance input, sets balance and increases accountNum 
        by 1
        */
        accountNum++;
        personalNum = accountNum;
        this.balance = balance;
    }
    
    public bankAccount(String username, double balance) {
        /*
        Constructor with username and balance input, sets username and balance,
        if username exceeds 20 characters, use default username, increases 
        accountNum by 1
        */
        accountNum++;
        personalNum = accountNum;
        if (username.length() > 20){
            System.out.println("That username is too long, using default username");
        }
        else {
            this.username = username;
        }
        
        this.balance = balance;
        
    }
    
    public int getAccountNum() {
        //makes accountNum accessible
        return accountNum;
    }
    
    public String getName() {
        //Makes username accessible
        return username;
    }
    
    public double getBalance() {
        //Makes balance accessible
        return balance;
    }
    
    public double getInterest() {
        //makes annualInterest accessible
        return annualInterest;
    }
    
    public double getFee() {
        //Makes withdrawFee accessible
        return withdrawFee;
    }
    
    public void setName(String username) {
        //Changes name parameters
        if (username.length() > 20) {
            System.out.println("That username is too long, using previous username");
        }
        else {
            this.username = username;
            System.out.println("Username successfully changed to " + this.username);
        }
    }
    
    public void deposit(double deposit) {
        //Takes in a double, rounds it and adds it to the balance
        balance = deposit + balance;
        
        if (balance < 0.0) {
            System.out.println("User deposited $" + deposit + ", new balance is ($" + Math.abs(balance) + ")");
        }
        else {
            System.out.println("User deposited $" + deposit + ", new balance is $" + balance);
        }
    }
    
    public void withdraw(double withdraw) {
        /*
        Takes in a double, subtracts withdrawFee from balance, then subtracts 
        the double from the balance
        */
        balance = (balance - withdrawFee) - withdraw;
        
        if (balance < 0.0) {
            System.out.println("User withdrew $" + withdraw + ", withdrawal fee $" + withdrawFee + ", new balance is ($" + Math.abs(balance) + ")");
        }
        else {
            System.out.println("User withdrew $" + withdraw + ", new balance is $" + balance);
        }
    }
    
    public boolean isOverDrawn() {
        //Checks if balance is overdrawn
        if(balance < 0.0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public void addInterest() {
        //Adds annualInterest to balance if balance is above 0.0
        if(balance > 0.0) {
        balance = (balance * annualInterest);
            System.out.println("Annual interest added, you now have $" + balance);
        }
        else {
            System.out.println("No annual interest can be added");
        }
    }
    
    public String toString() {
        if(balance < 0.0) {
        return("User " + personalNum + " \"" + username + "\" \n"
                + "Balance: ($" + Math.abs(balance) + ")");
        }
        else {
            return("User " + personalNum + " \"" + username + "\" \n"
                + "Balance: $" + balance);
        }
    }

}
