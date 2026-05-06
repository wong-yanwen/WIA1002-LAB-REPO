/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L07Q03;

/**
 *
 * @author Wong Yan Wen
 */
public class Share {
    private int numShares;
    private int pricePerShare;
    
    public Share (int x, int y){
        this.numShares=x;
        this.pricePerShare =y;
    }
 
    public int getNumShares(){
        return this.numShares;
    }
    
    public int getPricePerShare(){
        return this.pricePerShare;
    }
    
    public void buyShares(int i){
        this.numShares+=i;
    }
    
    public void sellShares(int i){
        this.numShares-=i;
    }
    
    @Override
    public String toString(){
        return "QTY: "+this.getNumShares()+"||PRICE: "+this.getPricePerShare()+"\t";
    }
    //capital gain 
    //
}
