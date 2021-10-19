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
import java.util.Random;
import java.util.Scanner;
public class VoteCount {
    
    public static void main(String[] args) {
       
        Scanner scan1 = new Scanner(System.in);
        
        String voteList;
        int votes = 0;
        int votesA = 0;
        int votesB = 0;
        
        System.out.println("Please type a string of \"A\" and \"B\"");
        
        voteList = scan1.next();
        
         for(int i = 0; i < voteList.length(); i++) {    
            if(voteList.charAt(i) != ' ')    
                votes ++;   
            
            char A = 'A';
            char B = 'B';
            
         }
            
            
        for (int v = 0; v < voteList.length(); v++) {
        if (voteList.charAt(v) == 'A') {
        votesA ++;
        }
        }
        for (int c = 0; c < voteList.length(); c++) {
        if (voteList.charAt(c) == 'B') {
        votesB ++;
        }
        
       
        }
        if (votesA > votesB) {
            System.out.println("A wins: (" + votesA + " A to " + votesB + " B of " + votes + " votes)");
        }
        else if( votesB >votesA) {
           System.out.println("B wins: (" + votesA + " A to " + votesB + " B of " + votes + " votes)");
        }
        else {
            System.out.println("Tie: (" + votesA + " A to " + votesB + " B of " + votes + " votes)");
        }
        }   
        
    }
    


