/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05Q03;

/**
 *
 * @author Wong Yan Wen
 */
public class Node <E>{
    E element ;
    Node <E> next ;
    Node <E> prev;
    public Node(E element){
        this(element,null,null);
    }
    
    public Node (E element,Node next,Node previous){
        this.element = element;
        this.next = next ;
        this.prev =previous;
    }
}
