/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L10Q02;

/**
 *
 * @author Wong Yan Wen
 */
//select biggest then swap
public class SelectionSort {
    public void selectionSortLargest(int[] arr){
        
        for (int i=0;i<arr.length-1;i++){
            int currentMax= arr[i];
            int currentMaxIndex = i;
            
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]>currentMax){
                    currentMax=arr[j];
                    currentMaxIndex=j;
                }
            }
            
            if (currentMaxIndex!=i){
                arr[currentMaxIndex]=arr[i];
                arr[i]=currentMax;
            }
        }
    }
}
