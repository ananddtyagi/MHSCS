/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort.comparison;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author AnandTyagi
 */
public class SortComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File i1 = new File("int.txt");
        File d1 = new File("double.txt");
        File s1 = new File("string.txt");
        Scanner i2 = new Scanner(i1);
        Scanner d2 = new Scanner(d1);
        Scanner s2 = new Scanner(s1);
        
        i2.useDelimiter("\n");
        d2.useDelimiter("\n");
        s2.useDelimiter("\n");
        
        int [] ints = new int[10000]; //ints = integers
        double [] dbs = new double[10000]; // dbs = doubles
        String [] sts = new String[10000]; // sts = strings
        
        for(int c = 0; c < 10000; c++){
            ints[c] = i2.nextInt();
            dbs[c] = d2.nextDouble();
            sts[c] = s2.next();

        }
        
        int n = 3; //1 = int, 2 = double, 3 = string

        long start = 0, end = 0, diff = 0;
        
        start = System.currentTimeMillis();
        switch(n){
            case 1: sortBSI(ints); System.out.println("Integers:");
            case 2: sortBSD(dbs);  System.out.println("Doubles:");
            case 3: sortBSS(sts);  System.out.println("Strings:");
        }   
        end = System.currentTimeMillis();
        diff = end - start;
        System.out.println("My sort: " + diff + " milliseconds");
        
        start = System.currentTimeMillis();
        switch(n){
            case 1: sortSMI(ints);
            case 2: sortSMD(dbs);
            case 3: sortSMS(sts);
        }
        end = System.currentTimeMillis();
        diff = end - start;
        System.out.println("Computer sort: " + diff  + " milliseconds");
        
        
    }
    
     
    public static void sortBSI(int [] ints){
        int temp;
        int i = 10000;
        i--;
            for(int c = 0; c < i ; c++){
                for(int d = 0; d < i - c; d++){
                    if(ints[d] > ints[d+1]){
                     temp = ints[d];
                     ints[d] = ints[d+1];
                     ints[d+1] = temp;                    
                }
            }
        }
    }
    
    public static void sortBSD(double [] dbs){
        double temp;
        int i = 10000;
        i--;
            for(int c = 0; c < i ; c++){
                for(int d = 0; d < i - c; d++){
                    if(dbs[d] > dbs[d+1]){
                     temp = dbs[d];
                     dbs[d] = dbs[d+1];
                     dbs[d+1] = temp;                    

                }
            }
        }
    }
    
    public static void sortBSS(String [] sts){
        String temp;
        int i = 10000;
        i--;
            for(int c = 0; c < i ; c++){
                for(int d = 0; d < i - c; d++){
                    if(sts[d].compareTo(sts[d+1]) > 0){
                     temp = sts[d];
                     sts[d] = sts[d+1];
                     sts[d+1] = temp;                    

                }
            }         
        }
    }
    
    public static void sortSMI(int [] ints){ //SM = sort method, java.util.Sort
        Arrays.sort(ints);
    }
    
    public static void sortSMD(double [] dbs){ //SM = sort method, java.util.Sort
        Arrays.sort(dbs);
    }
    
    public static void sortSMS(String [] sts){ //SM = sort method, java.util.Sort
        Arrays.sort(sts);
    }
               
}

