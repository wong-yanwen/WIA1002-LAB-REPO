/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package L10Q01;

/**
 *
 * @author Wong Yan Wen
 */
//select smallest than swap
public class SelectionSort {

    public void selectionSortSmallest(int[] arr){
       
        
        for (int i=0;i<arr.length-1;i++){
            int currentMin=arr[i];
            int currentMinIndex=i;
            
            //scan list, find smallest value
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<currentMin){
                    currentMin=arr[j];
                    currentMinIndex =j;
                }
            }
            
            //swap list[i] with the list[currentMinIndex] if necessary;
            if (currentMinIndex!=i){
                arr[currentMinIndex]=arr[i];
                arr[i]=currentMin;
            }
        }
        
        
    }
}
