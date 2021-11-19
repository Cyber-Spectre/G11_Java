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
import java.util.Scanner;
public class Mastery1_Compress {
    
    public static void main(String[] args) {
        
        File data = new File("C:\\Users\\105337005\\Documents\\NetBeansProjects\\G11_Java\\src\\main\\java\\File_Streaming\\data.txt");
        File dataCompress = new File("C:\\Users\\105337005\\Documents\\NetBeansProjects\\G11_Java\\src\\main\\java\\File_Streaming\\dataCompress.txt");
        String dataStore1 = "";
        String dataStore2 = "";
        Scanner scan1;
        
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
    }
}
