/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.an.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class ReverseAnArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        List<Integer> e = new ArrayList<Integer>();
                
        System.out.println("please enter your numbers");
        String line = a.nextLine();
        
        String [] n = line.split("\\s+");
        int i = 0, temp = 0;
        for(String k : n){
            temp = Integer.parseInt(k);
            e.add(i, temp);
            i++;
            
        }
        
        Collections.reverse(e);
        
        System.out.println(e);
    
    }
    
}

/*

 Scanner a = new Scanner(System.in);
        
        int [] e = new int [100]; //100 is cap val, e = elements
        
        System.out.println("please enter your numbers");
        String line = a.nextLine();
        
        String [] n = line.split("\\s+");
        int i = 0;
        for(String k : n){
            e[i] = Integer.parseInt(k);
            i++;
        }
        
        int temp = 0;
        for(int h = 0; h < (i / 2); h++){
            temp = e[h];
            e[h] = e[i - 1 - h];
            e[i - 1 - h] = temp;
        }
        
        for(int r = 0; r < i; r++){
            System.out.print(e[r] + " ");
        }
        
        
    
*/