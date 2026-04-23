/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package L04;

/**
 *
 * @author Wong Yan Wen
 */
public class Node <E> {
    E element ;
    Node <E> next ;
    
    public Node(){
        element = null;
        next = null;
    }
    
    public Node (E element){
        this.element = element;
        //THIS LINE WAS MISSING INITIALLY 
        this.next=null;
    }
}
