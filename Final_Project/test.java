/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Project;

/**
 *
 * @author 105337005
 */
import java.awt.Desktop;  
import java.io.*;  
public class test {
    
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\105337005\\Documents\\NetBeansProjects\\G11_Java\\src\\main\\java\\Final_Project\\understandable.jpg");
        
        try {
            if(!Desktop.isDesktopSupported()) {
                System.out.println("not supported");  
                return;  
            }
            Desktop desktop = Desktop.getDesktop();  
            if(file.exists()) {
                desktop.open(file);
            }
        }
        catch(Exception e){  
            e.printStackTrace();  
        }  
    }
}
