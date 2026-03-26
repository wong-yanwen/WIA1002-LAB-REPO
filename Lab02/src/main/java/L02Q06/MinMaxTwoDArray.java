/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02Q06;

/**
 *
 * @author Wong Yan Wen
 */
public class MinMaxTwoDArray {
    //6a
    public static <E extends Comparable<E>> E min(E[][] list){
        E min=list[0][0];
        for (E[] eachRow: list){
            for (E eachEntry:eachRow){
                //if min is greater than the entry
               if(min.compareTo(eachEntry)>0) 
                   min=eachEntry;
            }
        }
        return min;
    }
    //6b
    public static <E extends Comparable<E>> E max(E[][] list){
        E max=list[0][0];
        for (E[] eachRow: list){
            for (E eachEntry:eachRow){
                //if max is less than the entry
               if(max.compareTo(eachEntry)<0) 
                   max=eachEntry;
            }
        }
        return max;
    }
}

