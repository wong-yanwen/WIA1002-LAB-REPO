/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02Q01;

/**
 *
 * @author Wong Yan Wen
 */
public class L02Q01Tester {
    public static void main(String[] args){
        MyGeneric<String> strObj = new MyGeneric ("Hello world");
        MyGeneric<Integer> intObj = new MyGeneric<>();
        intObj.setValue(12);
        System.out.println("strObj: "+strObj.getValue());
        System.out.println("intObj: "+intObj.getValue());
    }
}
