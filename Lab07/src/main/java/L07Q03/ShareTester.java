/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L07Q03;

import L07Q01.MyQueue;
import java.util.Scanner;

/**
 *
 * @author Wong Yan Wen
 */
public class ShareTester {
    static MyQueue <Share> Shares = new MyQueue <>();
    static int totalSharesOnHand=0;
    static int capitalGainOrLoss =0;
    public static void main (String[] args){
       
        Scanner sc = new Scanner(System.in);
        int input;
        int x;
        int y;
        
        do {
            System.out.println("Enter your query: 0 BUY , 1 SELL , -1 QUIT");
            input=sc.nextInt();
            if (input!=-1 && (input==1 || input==0) ){
                System.out.print("Enter number of shares: ");
                x =sc.nextInt();
                System.out.print("Enter price per share: ");
                y = sc.nextInt();
                
                if (input==0){
                    QbuyShares(x,y);
                }else if (input==1){
                    QsellShares(x,y);
                }
                
                System.out.println(Shares);
                
            }else{
                System.out.println("Invalid input");
            }
            
            
        }while(input!=-1);
        
        System.out.println("Final Capital Gain / Loss: RM "+capitalGainOrLoss);
        System.out.println("End program.");
        

    }
    
    public static void QbuyShares(int numShares,int pricePerShare){
        Scanner sc =new Scanner (System.in);
        System.out.println("Buying...");  
        Share newShare = new Share(numShares,pricePerShare);
        Shares.enqueue(newShare);
        totalSharesOnHand+=numShares;
        System.out.println("Buying "+newShare.getNumShares()+" shares at "+newShare.getPricePerShare());
    }
    
    public static void QsellShares(int numShares,int pricePerShare){
        int total = totalSharesOnHand;
        int numberSold = numShares;
        Share sold;
        int profit;
        Scanner sc =new Scanner (System.in);
        System.out.println("Selling...");
        if (totalSharesOnHand>=numShares){
            do{
                if (numShares>=Shares.peek().getNumShares()){
                    sold= Shares.dequeue();
                    profit = pricePerShare - sold.getPricePerShare();
                    capitalGainOrLoss += (sold.getNumShares()*profit);
                    numShares -= sold.getNumShares();
                }else{
                    //reduce number of shares
                    Shares.peek().sellShares(numShares);
                    sold=Shares.peek();
                    profit= pricePerShare - sold.getPricePerShare();
                    capitalGainOrLoss += (numShares*profit) ;
                    numShares=0;
                    
                }
            }while(numShares!=0);
            
            System.out.println("Selling "+numberSold+" shares at "+pricePerShare);
            System.out.println("Capital Gain / Loss: $ "+capitalGainOrLoss);
            
        }else{
            System.out.println("Not enough shares");
        }
        
        
    }
}
