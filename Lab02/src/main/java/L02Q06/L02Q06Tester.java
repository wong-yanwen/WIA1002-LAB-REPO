/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02Q06;

/**
 *
 * @author Wong Yan Wen
 */
public class L02Q06Tester {
    //6c
    public static void main(String[] args){
        GenericClass <Integer> c = new GenericClass (new Integer[][] {{4,5,6},{1,2,3}});
        System.out.println(MinMaxTwoDArray.min(c.array));
        System.out.println(MinMaxTwoDArray.max(c.array));
    }
}
