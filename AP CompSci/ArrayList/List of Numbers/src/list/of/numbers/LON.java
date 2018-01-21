package list.of.numbers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnandTyagi
 */

import java.util.*;

public class LON {
    ArrayList <Integer> list;
    public LON(){
        
    }
    
    public LON(ArrayList l){
        list = l;
    }
    
    public void sortList(){
       int i = list.size() - 1;
       int temp;
       
      
       for(int k = 0; k < i; k++){
           for(int c = 0; c < i; c++){
             if(list.get(c) > list.get(c+1)){
                         temp = list.get(c);
                         list.set(c, list.get(c+1));
                         list.set(c + 1, temp);
                }    
           }
       }
    }
         
    
    
    
    
    public int Lowest(){
        return list.get(0);
    }
    
    public int Highest(){
        return list.get(list.size() - 1);
    }
    
    public String Frequecy(){
        
        int freq [] = new int[20];
        
        for(int i = 0; i < list.size(); i++){
                freq[list.get(i) - 1]++;               
        }
        
        for(int s: freq){
            System.out.println(s);
        }
        
        
        int mostFreq = 0;
        for(int i = 0; i < freq.length - 1; i++){
            if(freq[mostFreq] < freq[i]){
                mostFreq = i ;
            }
        }
        
        return "The most frequent number that occurs is " + (mostFreq + 1) + " and it occurs " + freq[mostFreq] + " times";
          
    }  
}
    

