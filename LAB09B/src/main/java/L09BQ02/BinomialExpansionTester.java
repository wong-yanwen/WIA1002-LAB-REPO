/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L09BQ02;

import java.util.Scanner;

/**
 *
 * @author Wong Yan Wen
 */
//if n=3
// (x+y)^3
//(x+y)^3=1x^3y^0+3x^2y^1+3x^ly^2+1x^0y^3.
//           n  k    n  k    n  k    n  k
public class BinomialExpansionTester {
    public static void main (String [] args){
        int n, k;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter an interger: ");
        String input = sc.nextLine();
        n= Integer.parseInt(input);
        System.out.print("(x+y)^"+n+"= ");
        for (k =0;k<=n;k++){
            System.out.print(BinomialExpansion.B(n,k)+"x^"+(n-k)+"y^"+k);
            if (k!=n){
                System.out.print("+");
            }
        }
        
        System.out.println("");
    }
}
