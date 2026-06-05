/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q04;

/**
 *
 * @author Wong Yan Wen
 */
public class InsertionSortTester {
    public static void main (String[] args){
        int [] arr = {10,34,56,7,88,42};
        for (int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        InsertionSort.InsertionSortAscending(arr);
        for (int num: arr){
            System.out.print(num+" ");
        }
        
    }
}
