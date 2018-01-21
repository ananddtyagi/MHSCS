/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraypractice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class ArrayPractice {

    /**
     * @param args 
     */
    
    public static void main(String[] args) {
       Random rand = new Random();
       Scanner input = new Scanner(System.in);
       int []lettersAsc = new int[20];
       boolean sort = false;
       boolean []charPresent = new boolean [26];
       int temp = 0, i;
       boolean done = false;
       String ans = "";
       
       for(i = 0; i < 20; i++){
            lettersAsc[i] = (int)(Math.random() * 25 + 1) + 96;
            charPresent[lettersAsc[i] - 97] = true;            
       }
       for(i = 0; i < 20; i++){
           System.out.println(Character.toString((char)lettersAsc[i]));        
       }
       
    while(done == false){
        temp = 0;
        ans = "";
        sort = false;
        
       Arrays.sort(lettersAsc);
       
       
       
       System.out.println("Which letter would you like to check?");
       String check = input.next();
       char c = check.charAt(0);
       int asc = (int)c;
       
       if(charPresent[asc - 97] == true){
           System.out.println("The character is present");
       }else{
       System.out.println("The character is not present");
       }
       
       System.out.println("Do you want to search for another letter?");
       ans = input.next();
       if(ans.equals("no")){
           done = true;
       } else {
           done = false;
       }
              
    }  
      
    }
    
}
