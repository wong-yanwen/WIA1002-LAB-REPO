/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L06Q02;

import L06Q01.MyStack;
import java.util.Scanner;

/**
 *
 * @author Wong Yan Wen
 */
//FIRST IN LAST OUT
public class TestIntMyStack {
    public static void main (String [] args){
        //a)Prompt user to enter an integer value.
        Scanner sc = new Scanner (System.in);
        Integer input;
        MyStack<Integer> stack1 = new MyStack <>();
        
        do {
            System.out.println("Enter an integer: ");
            input = sc.nextInt();
            
            if (input<=0){
                System.out.println("Invalid Input.");
            }
        }while(input<=0);
        
        //b) Push the values 1 through the user entered value onto the stack
        for (int i=1;i<=input;i++){
            stack1.push(i);
        }
                
        System.out.println(stack1);
        
        //c) Print the size of the stack.
        System.out.println("Size of Stack : "+stack1.getSize());
        
        //Display the contents of the stack by repeatedly calling pop() until the stack is empty.
        System.out.println("Popping process: ");
        for(int i=stack1.getSize();i>0;i--){
            System.out.print(stack1.pop()+" ");
        }
        
        
    }
}
