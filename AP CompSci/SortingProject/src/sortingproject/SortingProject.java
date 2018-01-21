/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class SortingProject {

     static public int c = 0;
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        /*
            make string of arrays
            in the sort all, sort it
            scan in strings from file
            use implements comparable
            
        */
        
        
        File a = new File("Strings.txt");
        Scanner b = new Scanner(a);

        while(b.hasNextLine()){
            c++;
            b.nextLine();
        }
        
       
        Comparable [] obs = new Comparable[c];
        b.close();
        
        Scanner b1 = new Scanner(a);
        
        for(int i = 0; i < c; i++){                  
            obs[i] = b1.nextLine();
        }
        
        SortAll.bubbleSort(obs);
       

    }
    
}
