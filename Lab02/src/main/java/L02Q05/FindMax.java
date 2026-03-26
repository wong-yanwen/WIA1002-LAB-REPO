/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02Q05;

/**
 *
 * @author Wong Yan Wen
 */
public class FindMax {
    public class Circle implements Comparable <Circle> {
        
        Double radius;
        public Circle(Double r){this.radius=r;}
        @Override
        public int compareTo(Circle c2){
            return this.radius.compareTo(c2.radius);
        }
        
    }
    
    public static <E extends Comparable<E>> E max(E[] list){
        E max = list[0];
        for (E eachEntry: list ){
            //if max is less than the entry
            if(max.compareTo(eachEntry)<0)
                max=eachEntry;
        }
        
        return max;
    }
}
