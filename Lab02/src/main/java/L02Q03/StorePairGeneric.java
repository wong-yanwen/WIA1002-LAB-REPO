/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L02Q03;

/**
 *
 * @author Wong Yan Wen
 */
/**Note:
 * <T extends Comparable<T> > means T is an object that will implement comparable 
 * implements Comparable <StorePairGeneric<T> > means it can only carry out comparable operations with StorePairGeneric that has the same type
 
 */
public class StorePairGeneric <T extends Comparable<T> > implements Comparable < StorePairGeneric<T> > {
    private T first , second;
    
    public StorePairGeneric(T first,T second){
        this.first=first;
        this.second=second;
    }
    
    public T getFirst(){ 
        return this.first;
    }
    
    public T getSecond(){
        return this.second;
    }
    
    public void setPair(T first, T second){
        this.first=first;
        this.second=second;
    }
    
    @Override
    public String toString(){
        return "first = "+this.first+" second = "+this.second;
    }
    
    //3b
    //Note public boolean equals(StorePairGeneric<T> otherobj){} is overloading 
    @Override 
    public boolean equals(Object otherObj){
        //check memory address
        if (this==otherObj)
            return true;
        
        //if  the other object is not an instance of this class , return false
        if (!(otherObj instanceof StorePairGeneric<?>))
            return false;
        
        //downcast
        StorePairGeneric<?> other=(StorePairGeneric<?>) otherObj;
       
        return this.first.equals(other.first);

    }
    
    //3c
    //NOTE: not using wildcard here as you can only compare between object of same type
    @Override 
    public int compareTo(StorePairGeneric<T> other){
        return this.first.compareTo(other.first);
    }
    
}
