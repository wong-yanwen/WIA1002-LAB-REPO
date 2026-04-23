/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L04;

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
    
    //a
    public void addFirst(E e){
        Node <E> newNode = new Node <>(e);
        newNode.next=head;
        head = newNode;
        if (tail==null) {
            tail=head;
        }
        size++;
    }
    //b
    public void addLast(E e){
        if (tail==null)
            head =tail=new Node<E> (e);
        else{
            tail.next = new Node <E> (e);
            tail=tail.next;
        }   
        size++;
    }
    //c
    public void add (int index, E e){
        if (index==0)
            addFirst(e);
        else if (index>=size)
            addLast(e);
        else{
            Node <E> current = head;
            for (int i=1;i<index;i++){
                current = current.next;
            }
            Node <E> temp = current.next;
            current.next = new Node <>(e);
            current.next.next=temp;
            size++;
        }  
    }
    
    //d
    public E removeFirst(){
        if (size==0)return null;
        else {
            //change from   Node E temp to E temp
            E temp = head.element;
            head = head.next;
            size--;
            if (head==null) tail=null;
            //change from temp.element to temp
            return temp;     
        }
    }
    //e
    public E removeLast(){
        if (size==0)
            return null;
        else if (size==1){
            E temp= tail.element;
            head = tail =null;
            size=0;
            return temp; 
        }else{
            E temp=tail.element;
            Node<E> current=head;
            for (int i=0;i<size-2;i++){
                current=current.next;
            }
            tail=current;
            tail.next=null;
            size--;
            return temp;
        }
    }
    
    //f
    public E remove(int index){
        if (index<0 || index>=size) 
            return null;
        else if (index==0) 
            return removeFirst();
        else if (index==size-1) 
            return removeLast();
        else{
           Node <E> previous = head;
           for (int i=1;i<index;i++){
                previous =previous.next;
           }
           Node <E> current= previous.next;
           previous.next=current.next;
           size--;
           return current.element;
        }
    }
    //QUESTION 4
    
    public boolean contains(E e){
        Node <E> current = head;
        //or use while loop 
        // while(current!=null)
        for (int i=0;i<size;i++){
            if (current.element.equals(e)){
                return true;
            }
            current=current.next;
        }
        return false;
    }
    
    public E get(int index){
        Node <E> current = head;
        if (index<0 || index>=size)
            return null;
        else{
            for (int i=1;i<index;i++){
                current=current.next;
            }
            return current.element;
        }
    }
    
    public E getFirst(){
        return head.element;
    }
    
    public E getLast(){
        return tail.element;
    }
    
    
    public int indexOf(E e){
        Node <E> current = head;
        for (int i=0;i<size;i++){
            if (current.element.equals(e)){
                return i;
            }
            current=current.next;
        }
        return -1;
    }
    //Return the index of the last matching element in this list. Return -1 of no match
    public int lastIndexOf(E e){
        Node <E> current = head;
        int index=0;
        int lastIndex=-1;
        
        while(current!=null){
            if (current.element.equals(e)){
                lastIndex=index;   
            }
            current=current.next;
            index++;   
        }
        /* Old Code
        E[] tempArray = (E[])new Object [size];
        for (int i=0;i<size;i++){
            tempArray[i]=current.element;
            current=current.next;
        }
        
        for (int i=size-1;i>=0;i--){
            if (e.equals(tempArray[i])){
                return i;
            }
        }
        
        return -1;
        */
        
        return lastIndex;
    }
    
    public E set(int index,E e){
        add(index,e);
        E removedElement = remove(index+1);
        return removedElement;
        
        /*
        Answer from demo:
          
        if (index <0 || index>=size)return null;
        Node<E> current=head;
        for (int i=0;i<index;i++){
            current=current.next;
        }

        E old = current.element;
        current.element=e;

        return old;
         */
    }
    
    public void clear(){
        do{
            removeFirst();
        }while(head!=null);
        System.out.println("List is cleared.");
    }
    
    public void print(){
        Node <E> current = head;
        while(current!=null){
            System.out.print(current.element+" ");
            current=current.next;
        }
    }
    
    //didnt catch answer for reverse
    public void reverse(){
        Node<E> current= head;
        E[] tempArray = (E[])new Object [size];
        for (int i=0;i<size;i++){
            tempArray[i]=current.element;
            current=current.next;
        }
        
        for (int i=size-1;i>=0;i--){
            System.out.print(tempArray[i]+" ");
        }   
    }
    
    //QUESTION 2
    public E getMiddleValue(){
        int middleIndex = Math.ceilDiv(size, 2);
        return get(middleIndex);
    }
}
