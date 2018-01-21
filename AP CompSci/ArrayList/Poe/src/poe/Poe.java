/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poe;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class Poe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("poe.txt");
        Scanner s = new Scanner(f);
        s = s.useDelimiter(" ");
        
        ArrayList <String> words = new <String> ArrayList();
        
        String word;
        
        while(s.hasNext()){
                word = s.next();
                if(word.equals(" ")){} else {                 
                    words.add(Clean(word.toLowerCase()).trim());
                    }
        } 
        
        
        String x = "", y = "";
        for(int i = 0; i < words.size(); i++){
            if(words.get(i).contains(" ")){ 
                x = (words.get(i)).substring((words.get(i)).indexOf(" "), words.get(i).length() - 1);           
                words.add(x);
                y = words.get(i).substring(0, words.get(i).indexOf(" "));        
                words.set(i, y);
            }
        }
                

        ArrayList <String> unique = new <String> ArrayList();
        boolean there = false;
        for(int i = 0; i < words.size(); i++){
            there = isUnique(unique, words.get(i));
            if(!there){
                unique.add(words.get(i));
            }
            
        }
        
        
        unique.sort(null);
        for(int i = 0; i < unique.size() - 1; i++){
            System.out.println(unique.get(i));
        }
        
        
        System.out.println("uni " + unique.size());
        System.out.println("words" + words.size());
       
    }
    
    public static String Clean(String x){
       char [] c = x.toCharArray();
       for(int i = 0; i < c.length; i++){
           if(!(c[i] >= 97 && c[i] <= 122) && !(c[i] == 39)){
               c[i] = ' ';
           }
       }
       return String.valueOf(c);
    }
    
    public static boolean isUnique(ArrayList <String> words, String uni){
        for(String x: words){
            if(uni.equals(x)){
                return true;
            }
        }
        return false;
    }
}
    

