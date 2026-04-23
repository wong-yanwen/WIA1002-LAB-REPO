package L06Q03;
/**
 *
 * @author Wong Yan Wen
 */

/*Assuming that an unknown number of positive integers are stored in a stack, S.
Using only stack ADT operations write an algorithm/function to find the sum of
every element in S.*/

/**
 * Pseudocode:
 * 1. Assuming that stack ,s already has some values.
 * 2. Access stack,s by using while loop until stack is empty
 *      a. while stack is not empty, pop all values
 *      b. declare integer variable
 *      c. sum all values in (b)
 * 3. Display the final sum value
 * 
 */
import L06Q01.MyStack;

public class TestSumStack {
    public static void main (String[] args){
        MyStack<Integer> s = new MyStack<>();
        
        //Assume stack already has values
        s.push(9);
        s.push(5);
        s.push(4);
        
        int sum=0;//Step 2b
        while(!s.isEmpty()){//step 2
            int value = s.pop();    //step 2a
            sum+=value; //step 2c
        }
        System.out.println("Sum = "+sum);   //step 3
    }
}
        