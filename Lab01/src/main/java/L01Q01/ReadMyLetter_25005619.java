/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package L01Q01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Wong Yan Wen
 */
public class ReadMyLetter_25005619 {
    
    public static void readFile(File file){
        try(Scanner sc = new Scanner (file)){
            String line;
            while(sc.hasNext()){
                line =sc.nextLine();
                System.out.println(line);
            }
            
            System.out.println("\nSuccessfully read from "+file.getName());
            
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File file = new File ("WongYanWen_25005619.txt");
        //reading
        readFile(file);
        
        //Getting input from user
        System.out.println("Input a new Entry : ");
        Scanner sc = new Scanner (System.in);
        String newInputDate ;
        String newInputText;
        System.out.println("New Date: ");
        newInputDate=sc.nextLine();
        System.out.println("New Entry: ");
        newInputText=sc.nextLine();
        
        //appending to the file
        try(FileWriter fw = new FileWriter(file,true)){
            
            fw.write("\n"+newInputDate+"\n");
            fw.write("\n"+newInputText);
            System.out.println("Successfully written to "+file.getName());
            
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        
        readFile(file);
    }
}
