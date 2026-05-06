/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L07Q01;

/**
 *
 * @author Wong Yan Wen
 */
//QUESTION 1B
public class MyQueueTester {
    
    public static void main (String[] args){
        //a. Have an initialize queue items consists of Durian and Blueberry in a fruitQ
        
        String[] fruitArr1 = {"Durian", "Blueberry"};
        MyQueue <String> fruitQ = new MyQueue <> (fruitArr1);
        
        //b. Then add new items in the following order: Apple, Orange, Grapes, Cherry. 
        String[] fruitArr2 = {"Apple", "Orange", "Grapes","Cherry"};
        for (String eachEntry : fruitArr2){
            fruitQ.enqueue(eachEntry);
        }
        
        // c. Display the queue.  
        System.out.println(fruitQ);
        
        //d. Show the top item.
        System.out.println("Top item: "+fruitQ.peek());
        
        //e. Get the queue size.
        System.out.println("Queue size: "+fruitQ.getSize());
        
        //f. Delete Durian.
        System.out.println("Delete: "+fruitQ.dequeue());
        
        //g. Get item in index position of 2
        System.out.println("Item in index position of 2: "+fruitQ.getElement(2));
        
        //h. Check whether the queue consists of Cherry
        System.out.println("Queue contains Cherry: "+fruitQ.contains("Cherry"));
        
        //i. Check whether the queue consists of Durian
        System.out.println("Queue contains Durian: "+fruitQ.contains("Durian"));
        
        //j. Display the queue using the isEmpty() condition
        if (!fruitQ.isEmpty()){
            System.out.println(fruitQ);
        }else{
            System.out.println("Queue is empty!");
        }

        
    }
    
}
