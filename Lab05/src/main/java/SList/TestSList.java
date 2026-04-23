/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

/**
 *
 * @author Wong Yan Wen
 */
public class TestSList {
    //QUESTION 4
    public static void main(String[] args){
        //1) Append the following values individually: “Linked list, is, easy.”
       String[] stringArr = {"Linked list", "is","easy"};
       SList<String> myList = new SList<>();
       for (String eachString : stringArr){
           myList.appendEnd(eachString);
       }
       // 2) Display these values. 
       myList.display();
        System.out.println("");
       //3) Remove the word “Linked list” and display the removed value. 
       myList.removeInitial();
        System.out.print("After removal: ");
       myList.display();
       System.out.println("");
       //4) Check if ‘difficult’ is in the list. 
        System.out.println("Contains \"difficult\": "+myList.contains("difficult"));
        //5) Clear the list
        myList.clear();
        System.out.print("After clearing list: ");
        myList.display();
    }
}
