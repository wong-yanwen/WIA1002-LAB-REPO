package L09BQ01;

/**
 *
 * @author Wong Yan Wen
 */

// F(s,t)= F(s-1,t)+F(s,t-1)
//Base case 1: If t=1, return s
//Base case 2: If s=1 , return 1


/*
                    F(3,3)
            /                   \
        F(2,3)          +       F(3,2)
        /   \                   /   \
F(1,3) +    F(2,2)          F(2,2) +F(3,1)
   |        /   \          /  \         |
   1     F(1,2)+F(2,1)  F(1,2)+F(2,1)   3
            |      |        |   |
            1      2        1   2
*/
public class RecursionRelation {
    public static long F(int s, int t){
        if (t==1){
            return s;
        }else if (s==1){
            return 1;
        }else {
            return F(s-1,t)+F(s,t-1);
        }
        
        
    }
}
