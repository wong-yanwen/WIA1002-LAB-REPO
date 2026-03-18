/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01Q03;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Wong Yan Wen
 */
public class Account {
    private int id;
    private double balance ;
    //all account same interest rate > global 
    private static double annualInterestRate=0;
    private Date dateCreated;
    
    public Account (){
        id =0;
        balance=0;
        dateCreated= new Date();
        
    }
    
    public Account(int id , double balance){
        this.id=id;
        this.balance=balance;
        dateCreated = new Date();  
        dateCreated.setTime(200000000);//set to be in the past
        //calculate interest and new balance
        Date now = new Date();
        int months = now.getMonth()-dateCreated.getMonth();
        int years = now.getYear()- dateCreated.getYear();
        int totalMonths = months + (years*12);
        
        this.balance+=(totalMonths*getMonthlyInterest());

    }
    //accessor method
    public int getId(){
        return this.id;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    public String getDate(){
        return dateCreated.toString();
    }
    
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    
    //mutator method
    public void setId(int id){
        this.id=id;
    }
    
    public void setBalance(double balance){
        this.balance=balance;
    }
    
    public static void setAnnualInterestRate(double annualIR){
        annualInterestRate=annualIR;
    }
    
    
    public double getMonthlyInterestRate(){
        double monthlyInterestRate= (annualInterestRate/100)/12;
        return monthlyInterestRate;
    }
    
    public double getMonthlyInterest(){
        double monthlyInterest = this.balance*getMonthlyInterestRate();
        return monthlyInterest;
    }
    
    
    public void withdraw(double amount){
       if (amount<=this.balance){
           this.balance-=amount;
           System.out.printf("Withdrawn $ %.2f successfully.\n",amount);
       }else{
           System.out.println("Withdraw failed.Amount exceeds balance.");
       }
    
    }
    
    
    public void deposit (double amount){
        if (amount>=0){
            this.balance+=amount;
            System.out.printf("Deposit $ %.2f succesfully.\n",amount);
        }else{
            System.out.println("Invalid amount. Amount cannot be negative.");
        }
    }
}

