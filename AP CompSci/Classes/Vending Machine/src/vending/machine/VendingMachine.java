/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending.machine;

import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        Beverage [] sodas = new Beverage[3];
        Beverage m = new Beverage(sodas);
        sodas[0].addSoda("coke", 12);
        sodas[1].addSoda("sprite", 12);
        sodas[2].addSoda("ginger ale", 12);
        
        
    }
    
}
