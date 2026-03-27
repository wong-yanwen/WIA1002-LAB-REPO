/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L03Q01_TO_Q05;

/**
 *
 * @author Wong Yan Wen
 */
public class ArrayBagDemo {
    
    private static void testAdd(BagInterface<String> aBag, String[] content){
        System.out.print("Adding ");
        for (String eachContent: content){
           if(aBag.add(eachContent))
                System.out.print(eachContent+"    ");
        }
        System.out.println("");
    }
    
    private static void displayBag(BagInterface<String> aBag){
        //cannot use String[] 
        Object[] bagArr = aBag.toArray();
        System.out.println("Bag is Empty: "+aBag.isEmpty());
        System.out.println("Bag is Full: "+aBag.isFull());
        System.out.println("The bag contains "+aBag.getCurrentSize()+" string(s), as follows: ");
        for (int i=0;i<aBag.getCurrentSize();i++){
            System.out.print(bagArr[i]+"    ");
        }
        System.out.println("\n");
    }
    public static void main (String[] args){
        
        String[] contentsOfBag1 = {"A", "A", "B", "A", "C", "A"};
        String[] contentsOfBag2 = {"A", "B", "A", "C", "B", "C", "D", "another string"};
        ArrayBag<String> bag1= new ArrayBag<>();
        System.out.println("BAG 1: ");
        testAdd(bag1,contentsOfBag1);
        displayBag(bag1);
        
        ArrayBag<String> bag2= new ArrayBag<>();
        System.out.println("BAG 2: ");
        testAdd(bag2,contentsOfBag2);
        displayBag(bag2);
        
        BagInterface<String> bag3 = bag1.union(bag2);
        System.out.print("BAG 3, test the method union of Bag 1 and Bag 2: ");
        displayBag(bag3);
        
        System.out.println("Bag 3 contains \"another string\": "+bag3.contains("another string"));
        System.out.println("\nGet Frequency of B: "+bag3.getFrequencyOf("B"));
        System.out.println("Remove an entry: "+bag3.remove());
        displayBag(bag3);     
        System.out.println("Remove a selected entry (k): "+bag3.remove("k"));
        displayBag(bag3);
        System.out.println("Remove a selected entry (A): "+bag3.remove("A"));
        displayBag(bag3);
        
        BagInterface<String> bag4 = bag1.intersection(bag2);
        System.out.println("BAG 4 , test method intersection between Bag 1 and Bag 2: ");
        displayBag(bag4);
        
        BagInterface<String> bag5 = bag1.difference(bag2);
        System.out.println("BAG 5 , test method difference of Bag 1 and Bag 2: ");
        displayBag(bag5);
        
       
     
    }
}
