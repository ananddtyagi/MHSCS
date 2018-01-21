/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication49;

import java.util.ArrayList;

/**
 *
 * @author AnandTyagi
 */
public class JavaApplication49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(new String("j"));
        a.add(new Integer(100));
        a.add("100");
        
        ArrayList <Integer> L = new ArrayList<Integer>();
        L.add(233333);
        L.add(2);
        
        int sum = L.get(0) + L.get(1);
        System.out.println(sum);
       
        int temp = L.set(0, 344);
        System.out.println(temp);
    
    }
}
