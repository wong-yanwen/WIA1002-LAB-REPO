/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package L02Q01;

/**
 *
 * @author Wong Yan Wen
 */
public class MyGeneric <T>{
    T e;
    public MyGeneric(){}
    public MyGeneric(T e){this.e=e;}
    public void setValue(T e){this.e=e;}
    public T getValue(){return this.e;}
}
