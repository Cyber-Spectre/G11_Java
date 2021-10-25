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
public class Hooman {
    //Data variables with default parameters
    private String name = "Bob";
    private int age = 21;
    private String city = "Örebro";
    
    public Hooman() {
        
    }
    
    public Hooman(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Hooman(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }
    
    public String getName() { 
        //makes name accessible
        return name;
    }
    
    public int getAge() { 
        //makes age accessible
        return age;
    }
    
    public String getCity() { 
        //makes city accessible
        return city;
    }
    
    public void setName() { 
        //changes name parameters
        this.name = name;
    }
    
    public void setAge() { 
        //changes age parameters
        this.age = age;
    }
    
    public void setCity() { 
        //changes city parameters
        this.city = city;
    }
    
    public int add(int num1, int num2) { 
        /*
        Takes two integers as inputs, adds them together, and prints it out with
        the name of the human
        */
        int sum = (num1 + num2);
        System.out.println("Numbers: " + num1 + " " + num2 + "\n" + name + " says the sum is " + sum + "\n");
        return sum;
    }
    
    public int add(String num1, String num2) {
        /*
        Takes two strings as inputs, converts the strings to their matching 
        integers, adds up the integers, and prints the sum with the name of the 
        human. If there is an error with the inputs, it will print an error
        */
        int n1 = 0;
        int n2 = 0;
        boolean error = false;
        
        if (num1 == "one") {
            n1 = 1;
        }
        else if (num1 == "two") {
            n1 = 2;
        }
        else if (num1 == "three") {
            n1 = 3;
        }
        else if (num1 == "four") {
            n1 = 4;
        }
        else if (num1 == "five") {
            n1 = 5;
        }
        else if (num1 == "six") {
            n1 = 6;
        }
        else if (num1 == "seven") {
            n1 = 7;
        }
        else if (num1 == "eight") {
            n1 = 8;
        }
        else if (num1 == "nine") {
            n1 = 9;
        }
        else if (num1 == "zero") {
            n1 = 0;
        }
        else {
            error = true;
        }
        
        if (num2 == "one") {
            n2 = 1;
        }
        else if (num2 == "two") {
            n2 = 2;
        }
        else if (num2 == "three") {
            n2 = 3;
        }
        else if (num2 == "four") {
            n2 = 4;
        }
        else if (num2 == "five") {
            n2 = 5;
        }
        else if (num2 == "six") {
            n2 = 6;
        }
        else if (num2 == "seven") {
            n2 = 7;
        }
        else if (num2 == "eight") {
            n2 = 8;
        }
        else if (num2 == "nine") {
            n2 = 9;
        }
        else if (num2 == "zero") {
            n2 = 0;
        }
        else {
            error = true;
        }
        int sum = n1 + n2;
        
        if (error) {
            System.out.println("Invalid input");
            sum = -1;
        }
        else{
        System.out.println("Numbers: " + num1 + " " + num2 + "\n" + name + " says the sum is " + sum + "\n");
        }
        return sum;
    }
    
    public static String checkName(Hooman hooman) {
        //checks the name of the human and prints is out
        return hooman.getName();
    }
    
    public static void birthday(Hooman hooman) {
        //increases the age of the human by 1 and prints is out
        hooman.age++;
        System.out.println("Happy birthday " + hooman.getName() + ", you are now " + hooman.getAge());
    }
    
    public String toString() { 
        //Prints out the output for the test program
        return("This human's name is " + name + ", they are " + age + " years old, and they live in " + city);
    }
    
    
}
