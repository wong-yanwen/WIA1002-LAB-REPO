/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02Q02;

/**
 *
 * @author Wong Yan Wen
 */
public class CompareMax {
    
    //uses local T , not class T , so applying static method here is possible
    public static <T extends Comparable <T>> T maximum(T a, T b,T c ){
        T max = a;
        if (a.compareTo(max)>0)
            max=a;
        if(b.compareTo(max)>0)
            max=b;
        if(c.compareTo(max)>0)
            max=c;
        
        return max;
    }
    
    public static void main (String[] args){
        System.out.println(maximum(2,-10000,4));
        System.out.println(maximum("HELLO","JAVA","A"));
        System.out.println(maximum('s','5',' '));
        //causes compile error
        //System.put.println(maximum(5,"Java",'f'));
    }
}
