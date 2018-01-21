/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication50;

/**
 *
 * @author AnandTyagi
 */
public class JavaApplication50 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int si = 11;
        int [] a = {1,2,3,4,4,5,6,6,6,7,10}; //11
    
        int bot = 0; int top = a.length;
        boolean found = false;
        int x = 0;
        int k = 0;
        while(!found && k < a.length){
            x = (bot + top) / 2;
            if(si == a[x]){
                found = true;
                System.out.println("found" + " " + k);
            } else if(si > a[x]){
                bot = x;
                k++;
                System.out.println(x + "higher" + bot + " " + top);
            } else if(si < a[x]){
                top = x;
                k++;
                System.out.println(x + "lower" + top + " " + bot);
            }
            
            }
        }
    }
    

