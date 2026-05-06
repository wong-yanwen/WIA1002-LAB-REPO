/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L07Q02;

import L07Q01.MyQueue;

/**
 *
 * @author Wong Yan Wen
 */
//QUESTION 2
public class PalindromeChecker {
    public static void main (String[] args){
        String s1 = "Dad";
        String s2 = "Hello";
        System.out.println(s1+ " is Palindrome? "+PalindromeTest(s1));
        System.out.println(s2+" is Palindrome? "+PalindromeTest(s2));
       
    }
    
    public static boolean PalindromeTest(String s){
        MyQueue <Character> q1 = new MyQueue <>();
        MyQueue <Character> q2 = new MyQueue <>();

        for(int i=0;i<s.length();i++){
            q1.enqueue(Character.toLowerCase(s.charAt(i)));
            q2.enqueue(Character.toLowerCase(s.charAt(s.length()-1-i)));
        }
        
        
        for (int i=0;i<q1.getSize();i++){
            if (!(q1.dequeue().equals(q2.dequeue()))){
                return false;
            }
        }
        
        return true;
    }
}


