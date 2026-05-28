package L09AQ01;

/**
 *
 * @author Wong Yan Wen
 */
public class ReplaceA {
    public String replaceAMethod1(String s1){
        if (!s1.contains("a")){
            return s1;
        }else{
            return s1.replace('a','i');
        }
    }
   //ANSWER 
    public String replaceAMethod2 (String s1){
        
        if (s1.length()==0){
            return "";
        }
        if (s1.charAt(0)=='a'){
            return 'i'+replaceAMethod2(s1.substring(1));
        }else{
            return s1.charAt(0)+replaceAMethod2(s1.substring(1));
        }
    }
}
