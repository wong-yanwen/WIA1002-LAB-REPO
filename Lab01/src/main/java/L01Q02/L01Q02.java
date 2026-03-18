/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L01Q02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;


/**
 *
 * @author Wong Yan Wen
 */
public class L01Q02 {
    //method 1 using line.split
    public static void readFile(File file,String delimiter){
        try (Scanner sc = new Scanner (file)){
            String line;
            int numOfChars=0;
            
            System.out.println("Contents of "+file.getName()+":");
            while(sc.hasNext()){
                line=sc.nextLine();
                String[] word=line.split(delimiter);
                
                numOfChars+=word.length;

                for(int i=0;i<word.length;i++){
                    System.out.print(word[i]+" ");
                }
                System.out.println();
            }
            
            System.out.println("Total number of Characters in "+file.getName()+": "+numOfChars+"\n");
            
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } 
    
    }
    
    //method 2 using tokenizer approach
    // however , regex \\d+ does not work for tokenizer
    public static void tokenizerApproach(String s, String delimiter){
        StringTokenizer st2 = new StringTokenizer (s,delimiter);
        int numOfChar=0;
        while (st2.hasMoreElements()){
            System.out.println(st2.nextElement());
            numOfChar++;
        }
        
        System.out.println("Number of Characters: "+numOfChar+"\n");
    }
    
    public static void main (String [] args){
        readFile (new File("text1.txt"),",");
        readFile (new File("text2.txt"),", ");
        readFile(new File("text3.txt"),"; ");
        
        //seperate by numbers: abc123def456ghi789jkl
        //\d means any digit
        //if \d will output 10
        //if \d+ will output 4
        readFile(new File("text4.txt"),"\\d+");
       
    }
}
