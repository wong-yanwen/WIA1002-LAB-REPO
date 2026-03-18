/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01Q03;

/**
 *
 * @author Wong Yan Wen
 */
public class AccountTester {
    public static void main (String [] args){
        Account account = new Account (1122,20000);
        Account.setAnnualInterestRate(4.5);
        System.out.printf("Current balance\t: $%.2f\n",account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.printf("New Balance\t: $%.2f\n",account.getBalance());
        System.out.printf("Monthly Interest\t: $%.2f\n",account.getMonthlyInterest());
        System.out.printf("Date Created\t: %s",account.getDate());
        
    
    }
}
