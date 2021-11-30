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
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Random;
public class Mastery2_Anthem {
    public static void main(String[] args) {
        
        String path = "C:\\Users\\105337005\\Documents\\NetBeansProjects\\G11_Java\\src\\main\\java\\File_Streaming\\";
        File anthem = new File(path + "Anthem.txt");
        File abomination = new File(path + "Abomination.txt");
        String [] arrayAnthem = new String [11];
        String [] arrayAbom = new String [11];
        String [] highscoreArray = new String [11];
        String alpha = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz.,! ";
        Scanner scan1;
        Random rand;
        
        if (anthem.exists()) {
            System.out.println("File \"Anthem.txt\" found.");
        } 
        else {
            System.out.println("\"Anthem.txt\" does not exist, stopping program.");
            System.exit(0);
        }
        
        try { // checks if abomination.txt exists
            if (abomination.createNewFile()) {
              System.out.println("File created: " + abomination.getName() + "\n");
                } 
            else {
              System.out.println("File \"" + abomination.getName() + "\" already exists." + "\n");
            }
        }
        catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        try { //fills anthem array
            for(int x = 0; x < arrayAnthem.length;) {
                scan1 = new Scanner(anthem);
                while(scan1.hasNextLine()) {
                arrayAnthem[x] = scan1.nextLine();
                x++;
                }
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        int highscore = 0;
        String lineHold = "";
        char charHold;
        for(int w = 0; w < 1000; w++) {
            int score = 0;
            for(int z = 0; z < arrayAbom.length; z++) {
                arrayAbom[z] = "";
            }
            for(int x = 0; x < arrayAnthem.length; x++) {
                for(int y = 0; y < arrayAnthem[x].length(); y++) {
                    rand = new Random();
                    int rando = rand.nextInt(alpha.length());
                    charHold = alpha.charAt(rando);
                    lineHold = lineHold + charHold;
                }
                arrayAbom[x] = lineHold;
                lineHold = "";
            }
            for(int x = 0; x < arrayAbom.length; x++) {
                for(int y = 0; y < arrayAbom[x].length(); y++) {
                    if(arrayAbom[x].charAt(y) == arrayAnthem[x].charAt(y)) {
                        score++;
                    }
                }
            }
            if(score > highscore) {
                highscore = score;
                for(int x = 0; x < arrayAbom.length; x++) {
                highscoreArray[x] = arrayAbom[x];
                } 
            }
            if(highscore == 306) {
                System.out.println("Perfect match boi");
                break;
            }
        }
        System.out.println("Highest accuracy score: " + highscore + "\n");
        for(int x = 0; x < highscoreArray.length; x++) {
            System.out.println(highscoreArray[x]); 
        }
        
        String egg = "";
        try {   
        FileWriter myWriter = new FileWriter(path + "Abomination.txt");
        for(int x = 0; x < highscoreArray.length; x++) {
            egg = (highscoreArray[x] + "\n");
            myWriter.write(egg);
        }
            myWriter.close();
            System.out.println("\n" + "Successfully wrote to file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }    
}
