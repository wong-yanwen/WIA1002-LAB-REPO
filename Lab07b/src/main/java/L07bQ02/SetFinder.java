/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L07bQ02;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author Wong Yan Wen
 */
public class SetFinder {
    public static <E extends Comparable <E>> PriorityQueue <E> findIntersection(PriorityQueue <E> q1, PriorityQueue <E> q2){
        PriorityQueue <E> smallQ;
        PriorityQueue <E> bigQ;
        PriorityQueue <E> resultQ= new PriorityQueue<>();
        
        if (q1.size()<=q2.size()){
            smallQ=q1;
            bigQ=q2;
        }else{
            smallQ=q2;
            bigQ=q1;
        }
        
        // for each entry in smaller pq
        for (E eachEntry: smallQ){
            //if the entry matches
            if (bigQ.contains(eachEntry)){
                //add the entry to the resulting pq
                resultQ.offer(eachEntry);
            }
        }
        
         return resultQ;       
    }
    
    //find difference
    // A-B = elements in A that are not in B
    // B-A = elements in B that are not in A
    public static <E extends Comparable<E>> PriorityQueue<E> findDifference(PriorityQueue<E> q1, PriorityQueue<E> q2){
        PriorityQueue <E> copyOfQ1= new PriorityQueue<E> ();      
        PriorityQueue <E> resultQ= new PriorityQueue<>();       
        //copy the first priorityQ (q1-q2)
        for (E eachEntry: q1){
            copyOfQ1.offer(eachEntry);
        }
        
        //get common elements
        PriorityQueue<E> intersectionQ = findIntersection(q1,q2);
        
        //for each entry with copy of q1
        outerLoop: for (E eachEntryQ1: copyOfQ1){
            //for each entry in intersection , check if its the same
            innerLoop: for (E eachEntryIntersect: intersectionQ){
                // if found matching for the current element in q1
                if ((eachEntryQ1.equals(eachEntryIntersect))){
                    //stop checking current element in q1
                    //skip to next element
                   continue outerLoop;
                }
            }
            //if the element in q1 is unique, add to resultQ
            resultQ.offer(eachEntryQ1);
        } 
        return resultQ;   
    }
    
    
    public static <E extends Comparable <E>> PriorityQueue<E> findUnion(PriorityQueue<E> q1, PriorityQueue<E> q2){
        PriorityQueue <E> resultQ = new PriorityQueue<> ();
        PriorityQueue <E> intersectionQ = findIntersection(q1,q2);
        PriorityQueue <E> diffQ1 = findDifference(q1,q2);
        PriorityQueue <E> diffQ2 = findDifference(q2,q1);
        
        //add common elements
        for (E eachEntry : intersectionQ ){
            resultQ.offer(eachEntry);
        }
        
        //add elements unique to q1
        for (E eachEntry : diffQ1){
            resultQ.offer(eachEntry);
        }
        
        //add elements unique to q2 
        for (E eachEntry : diffQ2){
            resultQ.offer(eachEntry);
        }
        
        return resultQ  ;       
    }
}
