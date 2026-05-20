package L08Q03ANDQ04;

import java.util.ArrayList;

/**
 *
 * @author Wong Yan Wen
 */
public class Graph<T extends Comparable <T>> {
    Vertex <T> head;
    int size;
    
    public Graph (){
        this.head= null;
        this.size=0;
    }
    
    public boolean addVertex(T v){
        if (hasVertex(v)==false){
            Vertex <T> temp=head;
            Vertex <T> newVertex = new Vertex <>(v,null);
            if (head==null){
                head = newVertex;
            }else{
                Vertex <T> previous= head;
                //stop at last vertex
                while(temp.nextVertex!=null){
                    previous=temp;
                    temp=temp.nextVertex;
                }
                temp.nextVertex = newVertex;
            }
            size++;
            return true;
        }
        
        return false;
    }
    
    
    public int getIndex(T v){
        Vertex <T> temp=head;
        int pos =0;
        while (temp!=null){
            if (temp.vertexInfo.compareTo(v)==0){
                return pos;
            }
            
            temp= temp.nextVertex;
            pos++;
        }
        
        return -1;
    }
    
    public T getVertex(int pos){
        if (pos>size-1|| pos<0){
            return null;
        }
        Vertex <T> temp= head;
        for (int i=0;i<pos;i++){
            temp=temp.nextVertex;
        }
        return temp.vertexInfo;
    }
    
    
    public boolean hasEdge(T source, T destination){
        if (head==null){
           return false;
        }
        
        if (!(hasVertex(source))|| !hasVertex(destination)){
            return false;
        }
        
        Vertex<T> sourceVertex = head;
        while (sourceVertex!=null){
            if (sourceVertex.vertexInfo.compareTo(source)==0){
                Vertex <T> destinationVertex = head;
                while(destinationVertex!=null){
                    if (destinationVertex.vertexInfo.compareTo(destination)==0){
                        return true;
                    }
                    destinationVertex= destinationVertex.nextVertex;
                }
            }
            sourceVertex=sourceVertex.nextVertex;
        }
        return false;
    }
    
    public boolean hasVertex(T v){
        if(head == null){
            return false;
        }
        
        Vertex <T> temp = head;
        while(temp!=null){
            if (temp.vertexInfo.compareTo(v)==0)
                return true;
            temp = temp.nextVertex;
        }
        
        return false;
    }
    
    public boolean addEdge(T source, T destination){
        if (head==null)
            return false;
        if (!hasVertex(source)|| !hasVertex(destination))
            return false;
        Vertex <T> sourceVertex =head;
        while(sourceVertex!=null){
            if (sourceVertex.vertexInfo.compareTo(source)==0){
                Vertex <T> destinationVertex = head;
                while(destinationVertex!=null){
                    if (destinationVertex.vertexInfo.compareTo(destination)==0){
                        //reached destination vertex, add here
                        Edge <T> currentEdge = sourceVertex.firstEdge;
                        Edge <T> newEdge = new Edge <>(destinationVertex, currentEdge);
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
    public boolean addUndirectedEdge(Vertex<T> source, Vertex <T> destination){
        
        /*Another method:
        addDirectedEdge(source.vertexInfo, destinationVertex.vertexInfo, w);
        addDirectedEdge(destinationVertex.vertexInfo, source.vertexInfo, w);
        */
        
        if (head==null)
            return false;
        if (!hasVertex(source.vertexInfo)|| !hasVertex(destination.vertexInfo))
            return false;
        Vertex <T> sourceVertex =head;
        while(sourceVertex!=null){
            if (sourceVertex.vertexInfo.compareTo(source.vertexInfo)==0){
                Vertex <T> destinationVertex = head;
                while(destinationVertex!=null){
                    if (destinationVertex.vertexInfo.compareTo(destination.vertexInfo)==0){
                        //reached destination vertex, add here
                       //add to the first node first
                       //source --> destination
                        Edge <T> currentEdge = sourceVertex.firstEdge;
                        Edge <T> newEdge = new Edge <>(destinationVertex,currentEdge);
                        sourceVertex.firstEdge=newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        
                        //then add to the second node
                        //source <-----destination
                        currentEdge = destinationVertex.firstEdge;
                        newEdge = new Edge <>(sourceVertex, currentEdge);
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
    public Edge<T> removeEdge(T sourceInfo, T destinationInfo){
        if (head==null)
            return null;
        if (!hasVertex(sourceInfo) || !hasVertex(destinationInfo)){
            return null;
        }
        //find source
        Vertex <T> sourceVertex = head;
        while(sourceVertex!=null)
        {
            //if source is found
            if(sourceVertex.vertexInfo.compareTo(sourceInfo)==0){
                //check the prev edge with the specific destination
                Edge <T> prevEdge = sourceVertex.firstEdge;
                while (prevEdge!=null){
                    //if prevEdge has nextEdge content matching with destination
                    if (prevEdge.nextEdge.toVertex.vertexInfo.compareTo(destinationInfo)==0){
                        Edge <T> removedEdge = prevEdge.nextEdge;
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
    
    public void printGraph(){
        Vertex <T> temp=head;
        while (temp!=null){
            System.out.println("# "+temp.vertexInfo+" : ");
            Edge <T> currentEdge = temp.firstEdge;
            while(currentEdge!=null){
                System.out.println("["+temp.vertexInfo+", "+currentEdge.toVertex.vertexInfo+"]" );
                currentEdge= currentEdge.nextEdge;
            }
            System.out.println();
            temp=temp.nextVertex;
        }
    }
    
    public int getSize(){
        return this.size;
    }
    
    
    public int getIndeg(T v){
       if (head==null){
           return -1;
       }
       
        if(!hasVertex(v)){
            return -1;
        } 
        
        Vertex <T> temp = head;
        while(temp!=null){
            if (temp.vertexInfo.compareTo(v)==0){
                return temp.indeg;
            }
            temp=temp.nextVertex;
        }
        return -1;
    }
    
    public int getOutdeg(T v){
        if (head==null){
           return -1;
       }
       
        if(!hasVertex(v)){
            return -1;
        } 
        
        Vertex <T> temp = head;
        while(temp!=null){
            if (temp.vertexInfo.compareTo(v)==0){
                return temp.outdeg;
            }
            temp=temp.nextVertex;
        }
        return -1;
    }
    
    public ArrayList<T> getNeighbours(T v){
        if (!hasVertex(v))
            return null;
        
        ArrayList<T> list = new ArrayList<>();
        Vertex<T> temp=head;
        while(temp!=null){
            if (temp.vertexInfo.compareTo(v)==0){
                Edge <T> currentEdge = temp.firstEdge;
                while(currentEdge!=null){
                    list.add(currentEdge.toVertex.vertexInfo);
                    currentEdge = currentEdge.nextEdge;
                }
                
            }
            temp =temp.nextVertex;
        }
        
        return list;
    }
}
