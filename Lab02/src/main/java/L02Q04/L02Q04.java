/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02Q04;

/**
 *
 * @author Wong Yan Wen
 */
public class L02Q04 {
    
    public static <T extends Comparable<T>>String minmax(T[] array){
        T min=array[0];
        T max=array[0];
        
        for (T eachEntry: array){
            //if min is greater than the entry
            if (min.compareTo(eachEntry)>0)
                min=eachEntry;
            //if max is less than the entry
            if (max.compareTo(eachEntry)<0)
                max=eachEntry;
        }
        
        return "Min= "+min +" Max = "+max;
    }
}
