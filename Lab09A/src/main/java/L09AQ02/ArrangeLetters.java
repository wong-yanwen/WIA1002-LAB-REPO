/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L09AQ02;

/**
 *
 * @author Wong Yan Wen
 */
public class ArrangeLetters {
    //ANSWER
    public static void permuteString(String beginningS, String endingS){
        
        System.out.println("Beginning S: "+beginningS);
        System.out.println("Ending S: "+endingS);
        if ((endingS.length()<=1)){
            System.out.println(beginningS+endingS);
        }else {
        
            for (int i=0;i<endingS.length();i++){
                String newString =
                        endingS.substring(0, i)+endingS.substring(i+1);
                //Testing
                System.out.println(i+" "+endingS.substring(0,i)+"+"+endingS.substring(i+1)+"="+newString);
                System.out.println("going to permute");
                
                permuteString (beginningS + endingS.charAt(i),newString);
            }
            System.out.println("");
            
            
        }
    }
}
