/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01Q04;

import java.util.Date;

/**
 *
 * @author Wong Yan Wen
 */
public class Transaction {
    private Date date;
    private char type;
    private double amount;
    private  double balance;
    private String description;
    
    public Transaction (char type , double amount , double balance , String description){
        this.date = new Date();
        this.type=type;
        this.amount = amount;
        this.balance= balance;
        this.description = description;
    }
    
    //getter
    public Date getDate(){ return this.date;}
    public char getType(){ return this.type;}
    public double getAmount(){return this.amount;}
    public double getBalance(){return this.balance;}
    public String getDescription(){ return this.description;}
    
    //setter
    public void setType(char type){this.type=type;}
    public void setAmount(double amount){this.amount=amount;}
    public void setBalance(double balance){this.balance = balance; }
    public void setDescription(String description){this.description = description; }
}
