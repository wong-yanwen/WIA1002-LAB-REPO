/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SList;

/**
 *
 * @author Wong Yan Wen
 */
public class SList <E> {
    //QUESTION 2
    SNode <E> head;
    SNode <E> tail;
    int size=0;
    
    public SList(){
        this.head=null;
        this.tail=null;
    }
    
    //QUESTION 3
    //i Append a new element at the end of the list.
    public void appendEnd(E e){
        if (tail==null)
            head =tail=new SNode<> (e);
        else{
            tail.next = new SNode <> (e);
            tail=tail.next;
        }   
        size++;
    }
    
    //ii Eliminate the first element in the list
    public E removeInitial(){
        if (size==0)return null;
        else {
            SNode <E> temp = head;
            head = head.next;
            size--;
            if (head==null) tail=null;
            return temp.element;     
        }
    }
    
    //iii Search for an element and returns true if this list contains the searched element 
    public boolean contains(E e){
        SNode <E> current = head;
        for (int i=0;i<size;i++){
            if (current.element.equals(e)){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    
    //iv Empty all elements in the list and return a statement that reports that the list is empty.
    public void clear(){
        //Answer from demo:
        size=0;
        head=tail=null;
        System.out.println("List is now empty");
        
        /*Old Code:
        do{
            removeInitial();
        }while(head!=null);
        System.out.println("List is cleared.");
        */
    }
    
    //v Display all values from the list in a successive order.
    public void display(){
        SNode <E> current = head;
        while(current!=null){
            System.out.print(current.element+" ");
            current=current.next;
        }
    }
}
