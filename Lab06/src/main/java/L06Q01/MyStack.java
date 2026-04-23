/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package L06Q01;

import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 *
 * @author Wong Yan Wen
 */
//first in last out
public class MyStack <E>{
    ArrayList <E> myStack = new ArrayList<>();
    
    public void push (E o){
        myStack.add(o);
    }
    
    public E pop(){
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        E removedItem=myStack.removeLast();
        return removedItem;
        
    }
    
    public E peek(){
        if (this.isEmpty()){
            throw new EmptyStackException();
        }
        return myStack.getLast();
    }
    
    public int getSize(){
        return myStack.size();
    }
    
    public boolean isEmpty(){
        return myStack.isEmpty();
    }
    
    @Override
    public String toString (){
        return "stack: "+ myStack.toString();
    }
    
    public boolean search (E o){
        return myStack.contains(o);
    }
}
    
