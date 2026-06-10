/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BST;

/**
 *
 * @author Wong Yan Wen
 */
public class TreeNode<E extends Comparable<E>>{
    protected E element;
    protected TreeNode<E> left;
    protected TreeNode<E> right;
    
    public TreeNode (E element){
        this.element=element;
        this.left=null;
        this.right=null;
    }
    
    @Override
    public String toString(){
        return this.element.toString();
    }
/*
    public int compareTo(TreeNode<E> anotherNode ) {
        return this.element.compareTo(anotherNode.element);
    }
*/
}
