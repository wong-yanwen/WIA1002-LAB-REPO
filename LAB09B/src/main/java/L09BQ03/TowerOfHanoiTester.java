package L09BQ03;

import java.util.Scanner;

/**
 *
 * @author Wong Yan Wen
 */
public class TowerOfHanoiTester {
    public static void main (String[] args){
        System.out.println("Part a : The recurrence relation is T(n) =2 T(n-1)+1");
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of disk: ");
        int n = sc.nextInt();
        System.out.println("Number of steps needed to move "+n+" disks: "+TowerOfHanoi.T(n));
        
    }
}
