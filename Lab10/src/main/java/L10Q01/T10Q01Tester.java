/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q01;

/**
 *
 * @author Wong Yan Wen
 */
public class T10Q01Tester {
    public static void main (String[] args){
        SelectionSort s = new SelectionSort ();
        int[] arr = {45,7,2,8,19,3};
        for (int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
        s.selectionSortSmallest(arr);
        for (int num : arr){
            System.out.print(num+" ");
        }
        
        
        
    }
}
