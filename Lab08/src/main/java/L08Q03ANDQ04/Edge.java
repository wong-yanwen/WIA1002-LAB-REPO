package L08Q03ANDQ04;

/**
 *
 * @author Wong Yan Wen
 */
public class Edge <T extends Comparable<T>> {
    Vertex <T> toVertex;
    Edge <T> nextEdge;
    
    public Edge(){
        this.toVertex = null;
        this.nextEdge=null;
    }
    
    public Edge(Vertex <T> destination, Edge<T> a){
        this.toVertex = destination;
        nextEdge =a;
    }
}