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
public class Mastery1_Compress {
    
    public static void main(String[] args) {
        
        String path = "C:\\Users\\105337005\\Documents\\NetBeansProjects\\G11_Java\\src\\main\\java\\File_Streaming\\";
        File data = new File(path + "data.txt");
        File dataCompress = new File(path + "dataCompress.txt");
        String dataStore1 = "";
        String dataStore2 = "";
        Scanner scan1;
        
        if (data.exists()) {
            System.out.println("File \"data.txt\" found.");
        }
        else {
            System.out.println("File \"data.txt\" does not exist, stopping program.");
            System.exit(0);
        }
        
        try {
        
            if (dataCompress.createNewFile()) {
              System.out.println("File created: " + dataCompress.getName());
                } 
            else {
              System.out.println("File already exists.");
            }
        }
        catch(IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
            
        try {
            
            scan1 = new Scanner (data);
            
            dataStore1 = scan1.nextLine();
        }
        catch(FileNotFoundException f) {
            System.out.println("An error occurred.");
            f.printStackTrace();
        }
        
        int dataLen = dataStore1.length();
        int compVar = -1;
        int compHold = 1;
        
        for(int x = 0; x < dataLen; x++) {
            
            if(compVar == -1) {
                
                if(dataStore1.charAt(x) == '1') {
                    compVar = 1;
                    x++;
                }
                else if(dataStore1.charAt(x) == '0') {
                    compVar = 0;
                    x++;
                }
            }
            else if (compVar == 1) {
               if(dataStore1.charAt(x) == '1') {
                   compHold++;
                   x++;
               }
               else {
                   dataStore2 = (dataStore2 + compHold + " 1 ");
                   compHold = 1;
                   compVar = 0;
                   x++;
               }
            }
            else if (compVar == 0) {
               if(dataStore1.charAt(x) == '0') {
                   compHold++;
                   x++;
               }
               else {
                   dataStore2 = (dataStore2 + compHold + " 0 ");
                   compHold = 1;
                   compVar = 1;
                   x++;
               }
            }
            else {
                System.out.println("An error occurred.");
            }
        }
        
        if(compHold > 0) {
            dataStore2 = dataStore2 = (dataStore2 + compHold + " " + compVar + " ");
        }
        
        try {   
        FileWriter myWriter = new FileWriter("C:\\Users\\105337005\\Documents\\NetBeansProjects\\G11_Java\\src\\main\\java\\File_Streaming\\dataCompress.txt");
        myWriter.write(dataStore2);
        myWriter.close();
            System.out.println("Successfully wrote to file.");
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
