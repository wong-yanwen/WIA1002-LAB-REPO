/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q04;

/**
 *
 * @author Wong Yan Wen
 */
public class InsertionSort {
    public static void InsertionSortAscending(int[] list){
        
        //for each iteration
        for (int i=0;i<list.length;i++){
            int currentElement =list[i];
            int k;
            //for each number before the currentElement
            //if list[k] is greater than the currentElement
            for (k=i-1;k>=0 && list[k] > currentElement ;k--){
                //shift to right
                list[k+1]=list[k];
            }
            // insert the current element into the correct position
            list[k+1]=currentElement;
                
        }
    }
}
