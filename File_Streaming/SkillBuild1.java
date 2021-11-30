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
import java.util.Scanner;
public class SkillBuild1 {
    
    public static void main(String[] args) {
        
        File myFile = new File("C:\\Users\\105337005\\Documents\\NetBeansProjects\\G11_Java\\src\\main\\java\\File_Streaming\\data.txt");
        String data = "";
        
        if (myFile.exists()) {
            System.out.println("File \"data.txt\" found.");
        }
        else {
            System.out.println("File \"data.txt\" does not exist, stopping program.");
            System.exit(0);
        }
        
        try {
            Scanner myReader = new Scanner(myFile);
            
            while (myReader.hasNextLine()) {
                
                data = myReader.nextLine();
                System.out.println(data);
                
            }
            myReader.close();
        } 
        catch (FileNotFoundException e) {
            
        System.out.println("An error occurred.");
        e.printStackTrace();
        }
        
        int strLen = data.length();
        double sum = 0.0;
        
        for(int x = 0; x < strLen; x++) {
            
            if(data.charAt(x) == '1') {
                sum++;
            }
            x++;
        }
        double sum2 = (sum / (strLen / 2));
        System.out.println(sum2);
    }
    
}
