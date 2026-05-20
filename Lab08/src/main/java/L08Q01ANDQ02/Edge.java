/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L08Q01ANDQ02;

/**
 *
 * @author Wong Yan Wen
 */
public class Edge <T extends Comparable<T>, N extends Comparable <N>> {
    Vertex <T,N> toVertex;
    N weight;
    Edge <T,N> nextEdge;
    
    public Edge(){
        this.toVertex = null;
        this.weight=null;
        this.nextEdge=null;
    }
    
    public Edge(Vertex <T,N> destination,N w, Edge<T,N> a){
        this.toVertex = destination;
        weight=w;
        nextEdge =a;
    }
}
