/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spell.checker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class SpellChecker {

    /**
     * @param args the command line arguments
     */
    static String [] words;
    
    public static void main(String[] args) throws FileNotFoundException {
        //creating the base vars
        File f = new File("Words.txt"); //File
        Scanner w = new Scanner(f); //Read file
        Scanner in = new Scanner(System.in); //general input
        words = new String[20]; //stores words from file
        int c = 0;        
        while(w.hasNextLine()){ //puts in all the words into the words[] array
            words[c] = w.nextLine();
            c++; //counting how many wordst there are to set the limit for the other arrays
        }
            
       
        
           
        boolean done = false; //are they done using the program

       
        while(!done){    
                  
            String [] poss = new String[c]; //possible matches string
            String [] narrowed = new String[c]; //narrowed set of possible matches
            boolean add = false; //should you add it to narrow
            boolean doesMatch = false; //to check if it is a match to exit that loop
            String yn = ""; //yes no
            int k = 0; //index for narrowed incrementation         
            
            System.out.println("Please enter a word");
            String resp = in.next();     
            
            boolean match = checkFull(resp, c); //checks if the word is in the file at the start         
            
            if(!match){ //if not matched directly
                poss = checkFL(resp, c); //finds possible vals                                  
                    for(int i = 0; i < c; i++){
                        if(poss[i] != null){ //only takes the filled in ones
                            add = narrow(poss[i], resp, c); //checks if it is worth it to add it
                            if(add){
                                narrowed[k] = poss[i]; //adds it to a narrowed group
                                k++;                               
                            }   
                        }
                    }                              
            }
            
            int i = 0;
            
            while(!doesMatch){ //while you don't find the match
                if(i < k){
                    System.out.println("Do you mean " + poss[i] + "? (y/n)");
                       yn = in.next();
                       if(yn.equals("y")){
                           doesMatch = true;
                           done = true;
                       } else {
                           i++;                      
                       }
                }
                if(i == k){
                    System.out.println("Sorry there was no match found");
                    doesMatch = true;
                }                
            }
            
            System.out.println("Would you like to try for a different word? (y/n)");
            if(in.next().equals("n")){
                done = true;
            } else {
                done = false;
            }
        }
    } //END OF MAIN-------------------------------------------
    
    
    
    
    public static boolean checkFull(String r, int c){
        boolean checked = false;
        for(int i = 0; i < c; i++){
            if(words[i].equals(r)){
                System.out.println("The word matches");
                checked = true;
            }
        }
        
        return checked;
    }
    
    public static String [] checkFL(String r, int c){ //checks first letter and the length
        String [] poss = new String [c]; 
        String f = r.substring(0, 1);
        String l = r.substring(r.length() - 1, r.length());
        String sl = r.substring(r.length() - 2, r.length() - 1); //second to last
        boolean possmatch = false;
        int k = 0;
        for(int i = 0; i < c; i++){
            possmatch = false;
            if(words[i].substring(0,1).equals(f)){
                if((words[i].substring(words[i].length() - 1, words[i].length())).equals(l) || 
                        (words[i].substring(words[i].length() - 1, words[i].length())).equals(sl)){
                        //words[i].substring(words[i].length() - 2, words[i].length() - 1).equals(l)){                        
                        for(int e = -2; e < 3; e++){
                            if(words[i].length() == (r.length() + e)){
                                possmatch = true;
                            }
                        } 
                }
            }
            if(possmatch == true){
                poss[k] = words[i];
                k++;
            }    
        }
        
        return poss;
    }
    
    public static boolean narrow(String poss, String r, int c){
        boolean add = false;
        int a = 1;
        
            if(poss.length() > r.length()){ //possible one has greater length than response
                int i = 0;
                for(i = 0; i < r.length(); i++){                 
                        if(poss.substring(i, i+1).equals(r.substring(i, i+1))){ //counts the number of similar characters
                            a++;
                        }
                    }               
                if(a > (r.length() / 2)){ //must be at least half the numbers matching 
                    add = true;
                }
            }
            if(poss.length() <= r.length()){ //same thing but change which one is longer
                int i = 0;
                for(i = 0; i < poss.length(); i++){                    
                        if(poss.substring(i, i+1).equals(r.substring(i, i+1))){
                            a++;
                        }                
                }
                if(a > (r.length() / 2)){
                    add = true;
                }
             
            }
    
    return add;
}
    
}
