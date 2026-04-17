/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L03Q01_TO_Q05;

import java.util.Random;

/**
 *
 * @author Wong Yan Wen
 */
public class ArrayBag <T> implements BagInterface <T> {
    
    private int DEFAULT_CAPACITY;
    private T[]bag;
    private int numberOfEntries=0;
    
    public ArrayBag(){
        DEFAULT_CAPACITY=25;
        // may cause unchecked compile warning  
        bag= (T[]) new Object [DEFAULT_CAPACITY];
    }
    
    public void setCapacity(int i){
        this.DEFAULT_CAPACITY=i;
    }
    
    @Override
    public int getCurrentSize() {
        return this.numberOfEntries;
    }

    @Override
    public boolean isFull() {
        return this.numberOfEntries==this.DEFAULT_CAPACITY;
    }

    @Override
    public boolean isEmpty() {
        return this.getCurrentSize()==0;
    }

    @Override
    public boolean add(T newEntry) {
        boolean success=false;
        try{
        //may cause ClassCatException
            this.bag[this.numberOfEntries]=(T)newEntry;
            this.numberOfEntries++;
            success=true;
        }catch(ClassCastException e){
            System.out.println(e.getMessage());
            success=false;
        }
        finally{
            return success;
        }
    }

    @Override
    public T remove() {
       
       Random r = new Random();
       int index=r.nextInt(numberOfEntries);
       T removedItem = this.bag[index];
       this.bag[index]=this.bag[numberOfEntries-1];
       this.bag[numberOfEntries-1]=null;
       numberOfEntries--;
       //fill in the gap
       return removedItem;
    }

    @Override
    public boolean remove(T anEntry) {
        for (int i=0;i<this.numberOfEntries;i++){
            if(anEntry.equals(this.bag[i])){
                //fill in the gap
                this.bag[i]=this.bag[numberOfEntries-1];
                this.bag[numberOfEntries-1]=null;
                numberOfEntries--;
                
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i=0;i<DEFAULT_CAPACITY;i++){
            this.bag[i]=null;
        }
    }

    @Override
    public int getFrequencyOf(T anEntry) {
        int frequency=0;
        for (int i=0;i<this.numberOfEntries;i++){
            if (anEntry.equals(this.bag[i])){
                frequency++;
            }
        }
        
        return frequency;
    }

    @Override
    public boolean contains(Object anEntry) {
        for (int i=0;i<this.numberOfEntries;i++){
            if (this.bag[i].equals(anEntry))
                return true;
        }
        
        return false;
    }

    @Override
    public T[] toArray() {
        T[] returningArray = this.bag;
        return returningArray;
    }
//QUESTION 2
    @Override
    public BagInterface<T> union(BagInterface<T> newBag) {
        if (newBag==null){
            throw new IllegalArgumentException("Cannot combine null bags.");
        }
        
        ArrayBag<T> combinedBag= new ArrayBag<>();
        combinedBag.setCapacity(this.numberOfEntries+newBag.getCurrentSize());
        
        T[] thisArray = this.toArray();
        for (int i = 0; i < this.numberOfEntries; i++) {
            if (!(thisArray[i]==null))
                combinedBag.add(thisArray[i]);
        }
        
        T[] otherArray = newBag.toArray();
        for (int i = 0; i < newBag.getCurrentSize(); i++) {
            if (!(otherArray[i]==null))
                combinedBag.add(otherArray[i]);
        }
        
        return combinedBag;
    }
    
    //QUESTION 3
    @Override
    public BagInterface<T> intersection (BagInterface<T> newBag){
         //check size of bag1 and bag2
         BagInterface<T> smallerBag = this.getCurrentSize()<newBag.getCurrentSize()? this:newBag;
         BagInterface<T> biggerBag = this.getCurrentSize()>newBag.getCurrentSize()?this:newBag;
         ArrayBag <T> resultBag = new ArrayBag<>();
         
         T[] smallerBagArr = smallerBag.toArray();
         T[] biggerBagArr = biggerBag.toArray();
         int sizeOuter= smallerBagArr.length;
         int sizeInner= biggerBagArr.length;
         //for each Value in smaller bag
         for (int i=0;i<sizeOuter;i++){
            //compare with eachValue in biggerBag
            for (int j=0;j<sizeInner;j++){
                //if equal add to returningBag
                if(smallerBagArr[i]!=null && smallerBagArr[i].equals(biggerBagArr[j])){
                    resultBag.add(smallerBagArr[i]);
                    //remove values that has pairing to avoid duplicates
                    smallerBagArr[i]=biggerBagArr[j]=null; 
                    break;
                }
            }
         }
        
         return resultBag;
    }
    //QUESTION 4
    public BagInterface<T> difference (BagInterface<T> newBag){
        ArrayBag<T> resultBag = new ArrayBag<>();
        T[] bag1Arr = this.bag;
        T[] bag2Arr = newBag.toArray();
        
        //for each value in 1st
        for (T eachEntry1: bag1Arr){
            //for each calue in 2nd
            for (T eachEntry2:bag2Arr){
            //check if they are equal to 2nd
                if (eachEntry1!=null && eachEntry1.equals(eachEntry2)){
                    //if equal then null out the 1st
                    eachEntry1=null;
                    //break inner loop
                    break;
                }
            }
        }
        
        //add results to resultBag
        for (T eachEntry1: bag1Arr){
            if (eachEntry1!=null){
                resultBag.add(eachEntry1);
            }
        }
        
        return resultBag;
    }
    
    
}
