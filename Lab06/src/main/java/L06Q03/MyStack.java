/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L06Q03;

/**
 *
 * @author Wong Yan Wen
 */

public interface MyStack <E>{
  
    public void push (E o);
    public E pop();
    public E peek();
    public int getSize();
    public boolean isEmpty();
    
    @Override
    public String toString ();
    
    public boolean search (E o);
}
    

