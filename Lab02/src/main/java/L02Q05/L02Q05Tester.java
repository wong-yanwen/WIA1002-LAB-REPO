/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02Q05;

import L02Q05.FindMax.Circle;

/**
 *
 * @author Wong Yan Wen
 */
public class L02Q05Tester {
    public static void main(String[] args){
        
        Integer[] a ={1,2,3};
        String[] b={"red","green","blue"};
        FindMax outer = new FindMax();
        FindMax.Circle[] c= {
            outer.new Circle(3D),
            outer.new Circle(2.9),
            outer.new Circle(5.9)
        };
        
        System.out.println(FindMax.max(a));
        System.out.println(FindMax.max(b));
        System.out.println(FindMax.max(c).radius);
    }
}
