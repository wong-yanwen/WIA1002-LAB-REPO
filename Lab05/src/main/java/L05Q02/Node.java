package L05Q02;

/**
 *
 * @author Wong Yan Wen
 */
public class Node <E> {
    E element ;
    Node <E> next ;
    
    public Node(){
        element = null;
        next = null;
    }
    
    public Node (E element){
        this.element = element;
    }
}
