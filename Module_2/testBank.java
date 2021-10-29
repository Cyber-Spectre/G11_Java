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
public class testBank {
    
    public static void main(String[] args) {
        bankAccount account1 = new bankAccount();
        System.out.println(account1.toString());
        account1.setName("Billy Bogor");
        account1.deposit(256.63);
        account1.withdraw(500.00);
        account1.addInterest();
        System.out.println(account1.toString());
        
        System.out.println("\n==============================\n");
        
        bankAccount account2 = new bankAccount("Rick Astley");
        System.out.println(account2.toString());
        account2.deposit(2000.0);
        account2.deposit(500.0);
        account2.withdraw(1325.5);
        account2.addInterest();
        System.out.println(account2.toString());
        
        System.out.println("\n==============================\n");
        
        bankAccount account3 = new bankAccount("Johnathan Fernando VIII");
        System.out.println(account3.toString());
        account3.setName("Johnathan \"VIII\" Fernando");
        account3.setName("John Fernando the Eighth");
        account3.setName("Johnathan Fernando");
        account3.deposit(5.0);
        account3.addInterest();
        System.out.println(account3.toString());
        
        System.out.println("\n==============================\n");
        
        bankAccount account4 = new bankAccount("Jeff Bezos", 8163952.69);
        System.out.println(account4.toString());
        account4.withdraw(500000.0);
        account4.withdraw(1600500.0);
        account4.deposit(100000.0);
        account4.withdraw(5000000.0);
        account4.withdraw(2000000.0);
        System.out.println(account4.toString());
        
    }
    
}
