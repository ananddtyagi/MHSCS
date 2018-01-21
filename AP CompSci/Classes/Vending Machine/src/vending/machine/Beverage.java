/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending.machine;

/**
 *
 * @author AnandTyagi
 */
public class Beverage extends Machine{
    String name;
    int quantity;
    final int initQuant;
    
    public Beverage(){
        name = "";
        quantity = 0;
        initQuant = 0;
    }
    
    public Beverage(String n, int q){
        name = n;
        quantity = q;
        initQuant = q;
    }
    
    public Beverage(Beverage s){
        name = s.name;
        quantity = s.initQuant;
        initQuant = s.initQuant;
    }
    
    public Beverage(Beverage [] soda){
        int i = 0;
        for(Beverage s: soda){
            this.soda.add(i, s);
            i++;
        }
        initQuant = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void remove(){
        quantity = quantity - 1;
    }
    
    public void restrock(){
        quantity = initQuant;
    }
    public String toString() {
        return this.getName() + this.getQuantity();
    }
}
