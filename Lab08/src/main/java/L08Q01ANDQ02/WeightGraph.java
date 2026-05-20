/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package L08Q01ANDQ02;

/**
 *
 * @author Wong Yan Wen
 */
public class WeightGraph <T extends Comparable <T>, N extends Comparable <N>>{
    Vertex <T,N> head;
    int size;
    
    public WeightGraph (){
        this.head= null;
        this.size=0;
    }
    
    public boolean hasVertex(T v){
        if(head == null){
            return false;
        }
        
        Vertex <T,N> temp = head;
        while(temp!=null){
            if (temp.vertexInfo.compareTo(v)==0)
                return true;
            temp = temp.nextVertex;
        }
        
        return false;
    }
    
    public boolean addEdge(T source, T destination, N w){
        if (head==null)
            return false;
        if (!hasVertex(source)|| !hasVertex(destination))
            return false;
        Vertex <T,N> sourceVertex =head;
        while(sourceVertex!=null){
            if (sourceVertex.vertexInfo.compareTo(source)==0){
                Vertex <T,N> destinationVertex = head;
                while(destinationVertex!=null){
                    if (destinationVertex.vertexInfo.compareTo(destination)==0){
                        //reached destination vertex, add here
                        Edge <T,N> currentEdge = sourceVertex.firstEdge;
                        Edge <T,N> newEdge = new Edge <>(destinationVertex, w, currentEdge);
                        sourceVertex.firstEdge=newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                                  
                    }
                    destinationVertex=destinationVertex.nextVertex;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }   
    
    //Question 1 
    public boolean addUndirectedEdge(Vertex<T,N> source, Vertex <T,N> destination, N w){
        
        /*Another method:
        addDirectedEdge(source.vertexInfo, destinationVertex.vertexInfo, w);
        addDirectedEdge(destinationVertex.vertexInfo, source.vertexInfo, w);
        */
        
        if (head==null)
            return false;
        if (!hasVertex(source.vertexInfo)|| !hasVertex(destination.vertexInfo))
            return false;
        Vertex <T,N> sourceVertex =head;
        while(sourceVertex!=null){
            if (sourceVertex.vertexInfo.compareTo(source.vertexInfo)==0){
                Vertex <T,N> destinationVertex = head;
                while(destinationVertex!=null){
                    if (destinationVertex.vertexInfo.compareTo(destination.vertexInfo)==0){
                        //reached destination vertex, add here
                       //add to the first node first
                       //source --> destination
                        Edge <T,N> currentEdge = sourceVertex.firstEdge;
                        Edge <T,N> newEdge = new Edge <>(destinationVertex, w, currentEdge);
                        sourceVertex.firstEdge=newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        
                        //then add to the second node
                        //source <-----destination
                        currentEdge = destinationVertex.firstEdge;
                        newEdge = new Edge <>(sourceVertex, w, currentEdge);
                        destinationVertex.firstEdge=newEdge;
                        sourceVertex.indeg++;
                        destinationVertex.outdeg++;
                        return true;
                                  
                    }
                    destinationVertex=destinationVertex.nextVertex;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    
    //Question 2
    public Edge<T,N> removeEdge(T sourceInfo, T destinationInfo){
        if (head==null)
            return null;
        if (!hasVertex(sourceInfo) || !hasVertex(destinationInfo)){
            return null;
        }
        //find source
        Vertex <T,N> sourceVertex = head;
        while(sourceVertex!=null)
        {
            //if source is found
            if(sourceVertex.vertexInfo.compareTo(sourceInfo)==0){
                //check the prev edge with the specific destination
                Edge <T,N> prevEdge = sourceVertex.firstEdge;
                while (prevEdge!=null){
                    //if prevEdge has nextEdge content matching with destination
                    if (prevEdge.nextEdge.toVertex.vertexInfo.compareTo(destinationInfo)==0){
                        Edge <T,N> removedEdge = prevEdge.nextEdge;
                        //skip over the removed edge
                        prevEdge.nextEdge=removedEdge.nextEdge;
                        //break old link between removed edge
                        removedEdge.nextEdge=null;
                        //reduce indeg and outdeg
                        sourceVertex.outdeg--;
                        removedEdge.toVertex.indeg--;
                        return removedEdge;
                    }
                    prevEdge=prevEdge.nextEdge;
                }
            }
            sourceVertex=sourceVertex.nextVertex;
        }       
        return null;         
    }
    
    
}
