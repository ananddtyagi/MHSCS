/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending.machine;

import java.util.ArrayList;

/**
 *
 * @author AnandTyagi
 */
public class Machine {
    public double moneyEntered;
    public ArrayList<Beverage> soda;
    
    public Machine(){
        moneyEntered = 0;
        
    }
    
    public Machine(Beverage [] soda){
        int i = 0;
        for(Beverage s: soda){
            this.soda.add(i, s);
            i++;
        }
       
    }
    
    
    public void addMoney(double m){
       moneyEntered = m; 
    }
    
    
    public void returnMoney(){
        moneyEntered = 0;
    }
    
    public void addSoda(String name, int q){
        soda.add(new Beverage(name, q));
        
    }
    
    public void DisplayInventory(){
        for(Beverage s: soda){
            System.out.println(s);
        }        
    }
    
    public void RestockSoda(int i){
        soda.add(i, new Beverage(soda.get(i)));
    }
    
    public void getType(int i){
        soda.get(i).toString();
    
    }
    
}
