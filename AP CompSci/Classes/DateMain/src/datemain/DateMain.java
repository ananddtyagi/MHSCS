/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datemain;



/**
 *
 * @author AnandTyagi
 */
public class DateMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        Date d2 = new Date(30, 11, 2015);
        System.out.println();
        System.out.println(d1.getDOW(d1));
        System.out.println(d2.getDOW(d2));
        
        System.out.println("days between = " + d1.daysBetween(d2));
        
        if(d1.compareTo(d2) > 1){
            System.out.println("d1 is in the future");
        }
        if(d1.compareTo(d2) < 1){
            System.out.println("d2 is in the future");
        }
        if(d1.compareTo(d2) == 0){
            System.out.println("d1 and d2 are the same date");
        }
        
    
    }
    
}
