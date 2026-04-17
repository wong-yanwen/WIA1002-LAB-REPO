/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L05Q03;

/**
 *
 * @author Wong Yan Wen
 */
public class L05Q03Tester {
    public static void main(String[] args){
        DoublyLinkedList<Integer> list = new DoublyLinkedList <>();
        list.addFirst(10);
        list.addLast(100);
        try{
            list.add(2,2);
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("Deleted: "+list.remove(3));
        }catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        list.iterateForward();
        System.out.println("");
        list.iterateBackward();
        System.out.println("");
        System.out.println("Size of current Doubly Linked List: "+list.getSize());
        list.clear();
        System.out.println("Size of current Doubly Linked List: "+list.getSize());
    }
}
