/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L09BQ03;

/**
 *
 * @author Wong Yan Wen
 */

/*steps 
n = num of disk
T(n) = number of steps required
n = 3 , T(3)=7

T(3) = 2*T(2)       +1
T(3) = 2*[2*T(1)+1] +1
T(3) = 2*[2*1   +1] +1    
T(3) = 7

move n-1 disk out of the way    -> T(n-1) steps
then move the biggest disk      -> 1 disk
finally move n-1 disk , back on top -> T(n-1) steps

Total =2 T(n-1)+1


*/
public class TowerOfHanoi {
    //part b
    public static int T(int n){
        if (n==1){
            return 1;
        }else {
            return 2*T(n-1)+1;
        }
    }
}
