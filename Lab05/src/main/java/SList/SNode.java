/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package SList;

/**
 *
 * @author Wong Yan Wen
 */
public class SNode <E>{
    //QUESTION 1
    E element ;
    SNode<E> next ;
    
    public SNode(){
        this.element =null;
        this.next=null;
    }
    
    public SNode(E element){
        this.element =element;
        this.next=null;
    }
    
}
