package L08Q03ANDQ04;

/**
 *
 * @author Wong Yan Wen
 */
public class Vertex <T extends Comparable <T>>{
    T vertexInfo;
    int indeg;
    int outdeg;
    Vertex <T> nextVertex;
    Edge <T> firstEdge;
    
    public Vertex (){
        this.vertexInfo=null;
        this.indeg=0;
        this.outdeg=0;
        nextVertex =null;
        firstEdge =null;
    }
    
    public Vertex (T vInfo, Vertex <T> next){
        vertexInfo =vInfo;
        indeg=0;
        outdeg=0;
        nextVertex =next;
        firstEdge =null;
    }
    
    
}

