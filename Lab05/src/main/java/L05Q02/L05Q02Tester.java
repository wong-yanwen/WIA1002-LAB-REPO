/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05Q02;

import java.util.Scanner;

/**
 *
 * @author Wong Yan Wen
 */
public class L05Q02Tester {
    public static void main (String[] args){
        MyLinkedList<String> nameList = new MyLinkedList<>();
        String input ;
        Scanner sc = new Scanner(System.in);
        
                    
        System.out.println("Enter your student name list. Enter 'n' to end.....");
        do {
            input= sc.nextLine();
            if (!(input.equalsIgnoreCase("n"))){
                nameList.add(input);
            }
        }while(!(input.equalsIgnoreCase("n")));
        System.out.println("");
        System.out.println("You have entered the following students' name: ");
        nameList.printList();
        System.out.println("\n");
        
        System.out.println("The number of students entered is : "+nameList.getSize()+"\n");
        
        do {
        System.out.println("Are all the names entered correct? Enter 'r' to rename the student name, 'n' to proceed. ");
        input=sc.nextLine();
        }while(!(input.equalsIgnoreCase("r")) && !(input.equalsIgnoreCase("n")) );
        
        if (input.equalsIgnoreCase("r")){
            System.out.println("\nEnter the existing student name that you want to rename : ");
            input=sc.nextLine();
            if (nameList.contains(input)){
                System.out.println("\nEnter the new name : ");
                String newInput = sc.nextLine();
                nameList.replace(input, newInput);
            }else{
                System.out.println(input+" not found.");
            }
        }
       
            
        do{
            System.out.println("\nDo you want to remove any of your student name? Enter 'y' for yes , 'n' to proceed");
            input=sc.nextLine();
        }while(!(input.equalsIgnoreCase("y")) && !(input.equalsIgnoreCase("n")));
        
        if (input.equalsIgnoreCase("y")){
            System.out.println("\nEnter a student name to remove: ");
            input=sc.nextLine();
            if (nameList.contains(input)){
                nameList.removeElement(input);
                System.out.println("\nThe number of updated student is : "+nameList.getSize());
                System.out.println("The updated student list is : ");
                nameList.printList();
                System.out.println("\n");
            }else{
                System.out.println(input+" not found.");
            }   
        } 
        
        System.out.println("\nAll students data captured complete. Thank you!");    
    }
}
