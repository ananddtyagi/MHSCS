/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.and.loops.and.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author AnandTyagi
 */
public class ArrayListAndLoopsAndGenerics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List a = new ArrayList(10);
        
        a.add("sally");
        a.add("joe");
        a.add("bob");
        
        for(Object O: a){
            System.out.println(O.toString());
    }
   
    ArrayList<Integer> i = new ArrayList<Integer>(10);
    
    i.add(43);
    i.add(45);
    i.add(new Integer(234));
    
    for(Integer o: i){
        System.out.println(i);
    }
    
    for(Object o: i){
        System.out.println(i);
    }
    
    ArrayList<Object> j = new ArrayList<>();
    
    j.add(20);
    j.add("hello");
    
    for(Object o: j){
        System.out.println(j);
    }

    /*
        sally
        joe
        bob
        [43, 45, 234] <-- Why is this the output?
        [43, 45, 234]
        [43, 45, 234]
        [43, 45, 234]
        [43, 45, 234]
        [43, 45, 234]
        [20, hello]
        [20, hello]
    
    */
    
    
    ListIterator<Integer> a1 = i.listIterator(); //why does the name need to be a letter and number?
    
        System.out.println("Element in forward direction");
        while(a1.hasNext()){
            System.out.println(a1.next());
        }
        
        System.out.println("Elements in the backward direction");
        while(a1.hasPrevious()){ //it's cool that hasPrevious is a thing
            System.out.println(a1.previous());
        }
    
    
    }
    
}
