/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list.of.numbers;

import java.util.ArrayList;

/**
 *
 * @author AnandTyagi
 */
public class ListOfNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>(10);
        
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(10);
        list.add(7);
        list.add(14);
        list.add(14);
        list.add(14);
        
        LON ln = new LON(list);
        
        ln.sortList();
        
        System.out.println("Lowest is " + ln.Lowest());
        System.out.println("Highest is " + ln.Highest());
        System.out.println(ln.Frequecy());
        
    }
    
}
