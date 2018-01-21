/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingclass;


import java.util.Arrays;

/**
 *
 * @author AnandTyagi
 */
public class SortAll{
    static int numE;
//    public SortAll(){
//        
//    }
//    
//    public SortAll(Comparable [] a, int c){
//        super();
//        numE = c;
//        bubbleSort(a);
//        
//    }

    public static void bubbleSort(Comparable [] s) {
        
        
        Comparable temp = null;
        boolean stillSorting = true;
        
        while (stillSorting){      
            stillSorting = false;
            
            for(int i = 0; i < (s.length - 1); i++){
                if(s[i].compareTo(s[i + 1]) > 0){ //not sure of the error. Do not understand how comparable works
                    temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                    stillSorting = true;
                } 
                
            }
        }   
      
    }
}


