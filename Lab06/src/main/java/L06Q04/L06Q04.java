package L06Q04;

/**
 *
 * @author Wong Yan Wen
 */

/*A string is a palindrome if it spells the same way forwards and backwards. Write a
Java program that uses a Stack to determine if a string is a palindrome or not. Let
your string be of maximum size 15 characters. Note however that the actual size
may be 15 or less.*/

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
public class L06Q04 {
    
    
    public static void main (String[] args){
        //get string from user
        Scanner sc= new Scanner (System.in);
        Stack <Character> s1 = new Stack<>();
        Stack <Character> s2 = new Stack <>();
        String input ;
        System.out.println("Palindrome checker: ");
        do {
            System.out.println("Enter a word: ");
            input=sc.next();
        }while(input.length()>15);
        //for each character , store in stack
        ArrayList <Character> originalArray = new ArrayList <>() ;
        int strLength = input.length();
        for (int i=0;i<strLength;i++){
            s1.push(input.charAt(i));
            s2.push(input.charAt(strLength-i-1));
        }
        
        //compare each character
        boolean isPalindrome = true ;
        for (int j=0;j<strLength;j++){
            if (!(s1.peek().equals(s2.peek()))){
                isPalindrome= false; 
                break;
            }
        }
        
        System.out.println(input+ " is Palindrome: "+isPalindrome);
        
        
    }
}
