/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L07bQ02;

import java.util.PriorityQueue;

/**
 *
 * @author Wong Yan Wen
 */

//Find their union, intersection and difference
public class Tester {
    public static void main (String[] args){
        PriorityQueue <String> pq1 = new PriorityQueue<>();
        PriorityQueue <String> pq2 = new PriorityQueue <>();
        String[] s1 = {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
        String[] s2 = {"George", "Katie", "Kevin", "Michelle", "Ryan"};
        
        for (String s1Entry : s1){
            pq1.offer(s1Entry);
        }
        
        for(String s2Entry: s2){
            pq2.offer(s2Entry);
        }
        
        System.out.println("PQ11: "+pq1);
        System.out.println("PQ2: "+pq2);
        
        System.out.println("\nFind Union:\n"+SetFinder.findUnion(pq1,pq2));
        System.out.println("\nFind Difference of PQ1-PQ2:\n"+SetFinder.findDifference(pq1, pq2));
        System.out.println("\nFind Difference of PQ2-PQ1:\n"+SetFinder.findDifference(pq2, pq1));
        System.out.println("\nFind Intersection:\n"+SetFinder.findIntersection(pq1, pq2));
        
    }
}
