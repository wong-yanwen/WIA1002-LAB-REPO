/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package L07bQ01;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author Wong Yan Wen
 */
public class IntegerPriorityQ {

    public static void main(String[] args) {
        PriorityQueue <Integer> pq1 = new PriorityQueue <>(); 

        Integer[] intArray =  {4, 8, 1, 2, 9, 6, 3, 7};
        for (Integer eachInt : intArray){
            pq1.offer(eachInt);
        }
        
        
        // toString() - Display all the elements inside this priority queue.
        // the "head" is always minimum , even though the end is not sorted bny natural order
        System.out.println(pq1.toString());//outputs : [1, 2, 3, 7, 9, 6, 4, 8]
        
        // poll() – retrieve and remove the first element in this priority queue.
        System.out.println("Poll: "+pq1.poll());
        
        // add() – add new element 5 into the priority queue
        System.out.println("Add new element 5: "+pq1.offer(5));
        
        // toArray() – convert the priority queue into an array and display.
        //required to use Object[] because toArray returns Object[]
        Object[] newIntArray = pq1.toArray();
        System.out.print("Using toArray(): ");
        for (Object eachEntry: newIntArray){
            System.out.print(eachEntry+" ");
        }
        // peek() – retrieve the first element in the priority queue.
        System.out.println("\nPeek: "+pq1.peek());
        
        // contains() – check if the priority queue consists of element “1”.
        System.out.println("Priority Queue contains \"1\": "+pq1.contains(1));
        
        // size() – get the current size of the priority queue.
        System.out.println("Size of priority Queue: "+pq1.size());
        
        // isEmpty() – display while removing the elements in the queue until it is empty.
        System.out.println("Removing each element one by one....");
        Iterator i = pq1.iterator();
        while (i.hasNext()){
            //everytime a head is removed, the priority queue will find the minimum and make it as head.
            System.out.println("Removed : "+ pq1.poll());
            System.out.println(pq1.toString());
        }
        
        // Sort the priority queue in reversing order.  
        ReverseIntComparator reverseComparator = new ReverseIntComparator();
        PriorityQueue <Integer> pq2 = new PriorityQueue <>(reverseComparator);
        for (Integer eachInt : intArray){
            pq2.offer(eachInt);
        }
        //alternative way: PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println("Reversed priority Queue: "+pq2);//outputs: Reversed priority Queue: [9, 8, 6, 7, 4, 1, 3, 2]
        

        
    }
    
    
}
