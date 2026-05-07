package L07bQ03;

/**
 *
 * @author Wong Yan Wen
 */

//Write the code for ComparableBook class using Comparable.
public class ComparableBook implements Comparable <ComparableBook>{
    
    Integer bookId;
    String bookName;
    //new ComparableBook(1065, "Effective Java: Third Edition"
    public ComparableBook(Integer bookId, String bookName){
        this.bookId=bookId;
        this.bookName = bookName;
    }
    
    @Override
    public int compareTo(ComparableBook b2){
        if (this.bookId<b2.bookId){
            return -1;
        }else if(this.bookId>b2.bookId){
            return 1;
        }else {
            return this.bookName.compareTo(b2.bookName);
        }    
    }
    
    @Override 
    public String toString(){
        return "\nBook ID: "+this.bookId+ "\tBOOK NAME: "+this.bookName;
    }
    
}
