/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01Q04;

import java.util.ArrayList;

/**
 *
 * @author Wong Yan Wen
 */
public class Account1Tester {
    public static void main (String[] args){
        Account1.setAnnualInterestRate(1.5);
        Account1 acc1 = new Account1 (1122,"George",1000,2016,2,1);
        
        acc1.deposit(30);
        acc1.deposit(40);
        acc1.deposit(50);
        
        acc1.withdraw(5);
        acc1.withdraw(4);
        acc1.withdraw(2);
        
        System.out.println("\n==============Account summary=============");
        System.out.println("Account id\t\t: "+acc1.getId());
        System.out.println("Account Holder Name\t: "+acc1.getName());
        System.out.println("Date created\t\t: "+acc1.getDate());
        System.out.printf("Interest Rate\t\t: %.2f%%\n",acc1.getAnnualInterestRate());
        System.out.printf("Current Balance\t\t: $ %.2f\n",acc1.getBalance());
        System.out.println("\n===============Transaction history=============== ");
        
        ArrayList<Transaction> history = acc1.getList();
        for ( Transaction eachT : history){
            System.out.println("Date\t\t: "+eachT.getDate());
            System.out.println("Type\t\t: "+eachT.getType());
            System.out.printf("Amount\t\t: $ %.2f\n",eachT.getAmount());
            System.out.printf("Balance\t\t: $ %.2f\n",eachT.getBalance());
            System.out.println("Description\t: "+eachT.getDescription());
            System.out.println();
        }
    }
}
