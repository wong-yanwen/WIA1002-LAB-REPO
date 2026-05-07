/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L07bQ01;

import java.util.Comparator;

/**
 *
 * @author Wong Yan Wen
 */
public class ReverseIntComparator implements Comparator <Integer> {
    @Override
    public int compare(Integer int1, Integer int2){
        return int2.compareTo(int1);
    }   
}
