/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L09AQ03;

/**
 *
 * @author Wong Yan Wen
 */
public class Exponent {
    //ANSWER
    //X ^ Y
    public static int exponent(int x, int y){
        if (y==0){
            return 1;
        }else if (y==1){
            return x;
        }else {
            return x* exponent(x,y-1);
        }
    }
}
