package L09AQ01;

/**
 *
 * @author Wong Yan Wen
 */

//SUBSTITUt lower case 'a' with 'i' 
public class ReplaceAwithITester {

    public static void main(String[] args) {
        ReplaceA r = new ReplaceA();
        String s1 = "Astronaut";
        String s2 = "flabbergasted";
        System.out.println("Using Replace");
        System.out.println(s1+": "+r.replaceAMethod1(s1));
        System.out.println(s2+": "+r.replaceAMethod1(s2));
        
        System.out.println("Using recursion and substring");
        System.out.println(s1+": "+r.replaceAMethod2(s1));
        System.out.println(s2+": "+r.replaceAMethod2(s2));
        
    }
}
