/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package BST;

/**
 *
 * @author Wong Yan Wen
 */
public class TestBST {

    public static void main(String[] args) {
        Integer[] numArray ={45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};
        BST <Integer> bst = new BST <>(numArray);
        System.out.println("Input Data: ");
        for (Integer eachEntry: numArray){
            System.out.print(eachEntry+" ");         
        }
        
        System.out.print("\nInorder(sorted): ");
        bst.inorder();
        System.out.print("\nPostorder: ");
        bst.postorder();
        System.out.print("\nPreorder: ");
        bst.preorder();
        
        System.out.println("\nHeight of BST: "+bst.height());
        System.out.println("Root for BST is: "+bst.getRoot());
        System.out.println("Check whether 10 is in the tree? "+bst.search(10));
        System.out.println("Delete 53: "+bst.delete(53));
        System.out.print("Updated Inorder data(sorted): ");
        bst.inorder();
        System.out.println("\nMin value: "+bst.minValue());
        System.out.println("Max value: "+bst.maxValue());
        System.out.println("A path from the root to 6 is: "+bst.path(6) );
    }
}
