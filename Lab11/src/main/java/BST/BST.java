/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BST;

import java.util.ArrayList;

/**
 *
 * @author Wong Yan Wen
 */
public class BST <E extends Comparable <E>>{
    protected TreeNode<E> root;
    protected int size =0;
    
    public BST(){
        root = null;
    }
    public BST(E[] elements){
        for (E eachEntry : elements){
                this.insert(eachEntry);
        }
    }
    
    //question b
    // i. Returns true if the element is in the tree     
    public boolean search(E e){
        TreeNode<E> current = root;
        while(current!=null){
            if (e.compareTo(current.element)<0){
                current=current.left;
            }else if (e.compareTo(current.element)>0){
                current=current.right;
            }else{
                return true;
            }
        }
        
        return false;
    }
    
    //ii insert element o into the binary tree and return true if the element is inserted successfully
    public boolean insert(E e){
        TreeNode<E> parent =null;
        
        if (root==null){
            root = new TreeNode <E> (e);
            return true;
        }
        
        //locate parent node
        TreeNode<E> current = root;
        while(current!=null){
            if (e.compareTo(current.element)<0){
                parent = current;
                current=current.left;
            }else if (e.compareTo(current.element)>0){
                parent=current;
                current=current.right;
            }else {
                //duplicate node not inserted
                return false;
            }
        }
        
        //create the new node and attach it to parent node
        if (e.compareTo(parent.element)<0){
            parent.left= new TreeNode<E> (e);
        }else {
            parent.right=new TreeNode<E> (e);
        }
        
        size++;
        return true;
        
    }
    
    
    ///iii Get the number of nodes in the tree
    public int getSize(){
        return this.size;
    }
    
    //method overloading
    //iv. Returns the height of the BST
    public int height(){
        return height(this.root);
    }
            
    private int height(TreeNode<E> node){
        // if reached the end , return -1
        // 1+ -1 = 0 (for height=0)
        if (node==null){
            return -1;
        }else{
            //calculate height of nodes on left and right, pick the maximum
            return 1+Math.max(height(node.left),height(node.right));
        }
    }
    
    //v Returns the root of the BST
    public E getRoot(){
        return this.root.element ;
    }
    
    //vi Returns the minimum value of the BST
    public E minValue(){
        TreeNode<E> current = this.root;
        
        while( current!=null && current.left!=null ){
            current=current.left;
        }        
        return current.element;
    }
    
    //vii Returns the maximum value of the BST
    public E maxValue(){
        TreeNode <E> current = this.root;
        while( current!=null && current.right!=null ){
            current=current.right;
        }       
        return current.element;
    }
    
    
    //viii Returns a path from the root leading to the specified elemen
    public ArrayList<TreeNode<E>> path(E e){
        //stop immediately if the element does not exist
        if (this.search(e)==false){
            return null;
        }
        
        ArrayList < TreeNode<E> > list = new ArrayList <> ();
        TreeNode <E> current = this.root;
        list.add(current);
        
        while(current!=null){
            list.add(current);

            if (e.compareTo(current.element)<0){
                current=current.left;
            }else if(e.compareTo(current.element)>0){
                current=current.right;
            }else{
                break;
            }        
        }
        
        return list;
    
    }
    
    //ix Delete an element from the binary tree. Return true if the element is deleted 
    //successfully, and return false if the element is not in the tree
    public boolean delete(E e){
        //return false if element not in tree
        if (this.search(e)==false){
            return false;
        }
        ArrayList <TreeNode <E> > pathToE  = this.path(e);
        TreeNode<E> parent =null;
        if (pathToE.size()>1){
            parent = pathToE.get(pathToE.size()-2);
        }
        TreeNode<E> target = pathToE.getLast();
        //case 1 :current has no left child
        if (target.left==null ){
            //connect right child of current with parent;
            //now current is not referenced, so it is eliminated
            if (parent==null){
                root= target.right;
            }else if (e.compareTo(target.element)<0){
                parent.left=target.right;
            }else{
                parent.right=target.right;
            }
         //case 2: current node has left child  
        }else{
            
            TreeNode<E> parentOfRightMost =target;
            TreeNode<E> rightMost=target.left;
            //locate ther rightmost node in the left subtree of current
            while(rightMost.right!=null){
                parentOfRightMost=rightMost;
                //keep going to the right
                rightMost = rightMost.right;
            }
            //copy the element value in the rightmost node to current.
            target.element = rightMost.element;
            //connect the parent of the right most node to the left child of rightmost node
            if (parentOfRightMost.right==rightMost){
                parentOfRightMost.right=rightMost.left;
            }else{
                //special case: parentOfRightMost==target
                parentOfRightMost.left=rightMost.left;
            }
        
        }     
        size--;
        return true;
    }
    
    //x Remove all elements from the tree
    public boolean clear(){
        this.root=null;
       return true;
    }
    
    //xi Display inorder traversal from a subtree
    // inorder 1+2
    public void inorder(){
        inorder(this.root);
    }
    protected void inorder(TreeNode<E> root){
        if (root==null){
            return;
        }
        this.inorder(root.left);
        System.out.print(root.element+" ");
        this.inorder(root.right);
    }
    
    
    //xii Display postorder traversal from a subtree
    //post order 1 2 +
    
    public void postorder(){
        postorder(this.root);
    }
    protected void postorder(TreeNode<E> root){
        if (root==null){
            return;
        }
        this.postorder(root.left);
        this.postorder(root.right);
        System.out.print(root.element+" ");
    }
    
    //xiii Display preorder traversal from a subtree
    //preorder + 1 2
    public void preorder(){
        preorder(this.root);
    }
    protected void preorder(TreeNode<E> root){
        if (root==null){
            return;
        }
        System.out.print(root.element+" "); 
        this.preorder(root.left);
        this.preorder(root.right);
    }
}
