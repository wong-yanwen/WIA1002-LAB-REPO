/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02Q04;

/**
 *
 * @author Wong Yan Wen
 */
public class L02Q04Tester {
    public static void main(String[] args){
        Integer[] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        //static method : class.methodName();
        System.out.println(L02Q04.minmax(intArray));
        System.out.println(L02Q04.minmax(strArray));
    }
}
