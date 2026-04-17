/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L04;

/**
 *
 * @author Wong Yan Wen
 */
public class TestLinkedList {
    public static void main(String[] args){
        System.out.println("\na. Append the following : a, b, c, d, e");
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        MyLinkedList <Character> myList = new MyLinkedList <> ();
        for (Character eachChar: charArray){
            myList.addLast(eachChar);
        }
        
        System.out.println("\nb. Print all the elements in the list."); 
        System.out.print("Contents: ");
        myList.print();
        System.out.println("");
        
        System.out.println("\nQuestion 2: ");
        System.out.println("Middle Value: "+myList.getMiddleValue()+"\n");
        
        System.out.println("\nc. Reverse all the elements in the list."); 
        myList.reverse();
        System.out.println("");
        
        System.out.println("\nd. Retrieve the number of elements in the list.");
        System.out.println("Number of elements in the list: "+myList.size);
        
        System.out.println("\ne. Retrieve the first and last value.");
        System.out.println("First value: "+myList.getFirst());
        System.out.println("Last Value: "+myList.getLast());
        
        System.out.println("\nf. Delete the third value.");
        System.out.print("Before deletion: ");
        myList.print();
        System.out.println("");
        myList.remove(2);
        System.out.print("After deletion: ");
        myList.print();
        System.out.println("");
        
        System.out.println("\ng. Retrieve the index location for the second and third value."); 
        System.out.println("Second value index: "+myList.indexOf('b'));
        System.out.println("Third value index: "+myList.indexOf('d'));
        
        System.out.println("\nh. Checks if the list has the value 'c'.");
        System.out.println("Contains 'c': "+myList.contains('c'));
        
        System.out.println("\ni. Replace the items individually with the following: j,a,v,a.");
        Character[] newElements = {'j','a','v','a'};
        
        System.out.print("Before replacement: ");
        myList.print();
        System.out.println("");
        for (int i=0;i<newElements.length;i++){
            myList.set(i,newElements[i]);
        }
        System.out.print("After replacement: ");
        myList.print();
        System.out.println("");
         
        System.out.println("\nQuestion 2: ");
        System.out.println("Middle Value: "+myList.getMiddleValue()+"\n");
    }
       
}
