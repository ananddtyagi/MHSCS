/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingclass;


/**
 *
 * @author AnandTyagi
 */

public class Apartment extends Building implements Comparable{
    public double costPerFloor, costTotal;
    
    public Apartment(){
        costPerFloor = 3.2;
        
    }
    public Apartment(double cPF){
        costPerFloor = cPF;
        
    }
    
    public void calcCost(double x){
        costTotal = (costPerFloor * getFloors()) + x;
    } 
    
    public double getcPF(){
        return costPerFloor;       
    }
    
    public double getcT(){
        return costTotal;
    }
    
    
    public String toString() {
         return String.format("The total cost is " + costTotal);
    }

    @Override
    public int compareTo(Object o) {    
        o = (Building)(o);
        if(((Apartment)this).getcT() > ((Apartment)o).getcT()){
           return 1;
       } else {
           return -1;
       }
        
    }

   


    
}
