/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05Q02;

/**
 *
 * @author Wong Yan Wen
 */

public class MyLinkedList <E> {
    Node <E> head;
    Node <E> tail;
    int size=0;
    
    public MyLinkedList(){
        this.head=null;
        this.tail=null;
    }
    
    //i 
    public void add(E e){
        if (tail==null)
            head =tail=new Node<> (e);
        else{
            tail.next = new Node <> (e);
            tail=tail.next;
        }   
        size++;
    }
    
    
    //ii
    public E removeElement(E e){
       if (size==0) return null;
        else{
           Node <E> previous = head;
            while(previous!=null){
               if ((previous.next).element.equals(e)){
                   Node <E> current= previous.next;
                   previous.next=current.next;
                   size--;
                   return current.element;
               }
               previous =previous.next;
           }
           return null;
        }
    }
    
    //iii
    public void printList(){
        Node <E> current = head;
        while(current!=null){
            if (current!=tail)
                System.out.print(current.element+", ");
            else
                System.out.println(current.element+".");
            current=current.next;
        }
    }
    //iv
    public int getSize(){
        return this.size;
    }
    
    //v
    public boolean contains(E e){
        Node <E> current = head;
        for (int i=0;i<size;i++){
            if (current.element.equals(e)){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    
    
    //vi
    public E replace(E e,E newE){
        Node <E> current = head;
        for (int i=0;i<size;i++){
            if (current.element.equals(e)){
                E oldE = e;
                current.element = newE;
                return oldE;
            }
            current=current.next;
        }
        return null;      
    }
    
    
}
