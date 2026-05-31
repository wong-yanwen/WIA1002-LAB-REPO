/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L09BQ02;

/**
 *
 * @author Wong Yan Wen
 */
public class BinomialExpansion {
    public static int B(int n, int k){
        if (k==0 || k==n){
            return 1;
        }else{
            return B(n-1,k-1)+B(n-1,k);
        }
    }
}
