package L07Q01;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Wong Yan Wen
 */

//QUESTION 1A
public class MyQueue <E> {

    LinkedList <E> list = new LinkedList <>();
    //a
    public MyQueue (E[] e){
        for (int i =0;i<e.length;i++){
            this.enqueue(e[i]);
        }
    }
    
    //b
    public MyQueue(){
        
    }
    
    //c
    public  void enqueue(E e){
        list.add(e);
    }
    
    //d
    public E dequeue(){
        return list.removeFirst();
    }
    
    //e
    public E getElement(int i){
        return list.get(i);
    }

    //f
    public E peek(){
        return list.getFirst();
    }

    //g
    public int getSize(){
        return list.size();
    }
    
    //h
    public boolean contains(E e){
        return list.contains(e);
    }

    //i
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    //j
    @Override
    public String toString(){
        return "Queue: "+list.toString();
    }
    
}
