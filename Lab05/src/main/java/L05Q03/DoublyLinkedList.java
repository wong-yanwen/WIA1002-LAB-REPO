/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05Q03;

import java.util.NoSuchElementException;

/**
 *
 * @author Wong Yan Wen
 */
public class DoublyLinkedList<E> {
    private Node<E> head;
    private Node<E> tail;
    private int size;
    
    public DoublyLinkedList(){
        size=0;
        this.head=null;
        this.tail=null;
    }
    
    public void addFirst(E element){
        Node <E> temp = new Node <> (element,head,null);
        if (head!=null){head.prev=temp;}
        head =temp;
        if (tail==null){tail=temp;}
        size++;
        System.out.println("adding: "+element);
    }
    
    public void addLast(E element){
        Node<E> temp= new Node <> (element,null,tail);
        if (tail!=null){tail.next=temp;}
        tail=temp;
        if (head==null){head=temp;}
        size++;
        System.out.println("adding: "+element);
    }
    
    public void add(int index, E element){
       
        if (index<0 || index>=size)
            throw new IndexOutOfBoundsException("Index out of Bounds");
        else if (index==0)
            addFirst(element);
        else if (index==size-1)
            addLast(element);
        else{
            Node<E> current = head;
            for (int i=0;i<index;i++){
                current =current.next;
            }
            Node <E> temp =new Node <> (element,current,current.prev);
            (current.prev).next = temp;
            current.prev=temp;
            size++;
        }
        
    }
    
    public void iterateForward(){
        System.out.println("Iterating forward..");
        Node<E> temp=head;
        while(temp!=null){
            System.out.print(temp.element+" ");
            temp=temp.next;
        }
            
    }
    
    public void iterateBackward(){
        System.out.println("Iterating backward..");
        Node<E> temp=tail;
        while(temp!=null){
            System.out.print(temp.element+" ");
            temp=temp.prev;
        }
            
    }
    
    public E removeFirst(){
        if (size==0){
            throw new NoSuchElementException("No such element");
        }else if(size==1){
                Node <E> temp = head;
                head=tail=null;
                size=0;
                return temp.element;
        }else{
            Node <E> temp = head;
            head = head.next;
            head.prev=null;
            size--;
            return temp.element;
        }
    }
    
    public E removeLast(){
        if (size==0)
            throw new NoSuchElementException("No Such Element");
        else if (size==1){
            Node<E> temp=head;
            head=tail=null;
            size=0;
            return temp.element; 
        }else{
            Node <E> temp= tail;
            tail=tail.prev;
            tail.next=null;
            size--;
            return temp.element;      
        }
    }
    
    public E remove(int index){
        if (index<0 || index>=size)
            throw new IndexOutOfBoundsException("Index Out Of Bounds");
        else if (index==0){return removeFirst();}
        else if (index==size-1){return removeLast();}
        else{
            Node<E> temp = head;
            for (int i=0;i<index;i++){
                temp=temp.next;
            }
            Node <E> removed = temp;
            (temp.next).prev=temp.prev;
            (temp.prev).next=temp.next;
            temp.next=null;
            temp.prev=null;
            size--;
            return removed.element;
        }
        
    }   
    
    //FIXED
    public void clear(){
        head=tail=null;
        size=0;
       /*OLD cODE 
        Node<E> temp= head;
        int i=0;
        while(head!=null){
            removeFirst();
            i++;
        }

        */
        System.out.println("Successfully cleared nodes.");
    }
    
    public int getSize(){
        return size;
    }
 
}
