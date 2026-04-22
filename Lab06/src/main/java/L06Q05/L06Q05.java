package L06Q05;

/**
 *
 * @author Wong Yan Wen
 */

/*
The Tower of Hanoi is a mathematical game or puzzle. It consists of three rods, and
a number of disks of different sizes which can slide onto any rod. The puzzle starts
with the disks in a neat stack in ascending order of size on one rod, the smallest at
the top, thus making a conical shape. The objective of the puzzle is to move the
entire stack to another rod, obeying the following rules:

i) Only one disk may be moved at a time.

ii) Each move consists of taking the upper disk from one of the rods and sliding it
onto another rod, on top of the other disks that may already be present on that rod.

iii) No disk may be placed on top of a smaller disk.
You are required to write the source code using Java syntax to solve Tower of Hanoi
Problem using stacks data structure
*/

public class L06Q05 {
    
    public static void towerOfHanoi(int n, String from_rod, String to_rod, String helper_rod)
    {
        if (n == 1)
        {
            System.out.println("Take disk 1 from rod " +  from_rod + " to rod " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, helper_rod, to_rod);
        System.out.println("Take disk " + n + " from rod " +  from_rod + " to rod " + to_rod);
        towerOfHanoi(n-1, helper_rod, to_rod, from_rod);
    }
    
    public static void main (String[] args){
        int n=4;
        towerOfHanoi(n,"A","B","C");
    
    }
}
