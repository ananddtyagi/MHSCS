/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buildingclass;

import buildingclass.Building;

/**
 *
 * @author AnandTyagi
 */
public class OfficeSpace extends Building implements Comparable{
    double costTotal, costPerFloor, sqaureFeetPerFloor;
    
    public OfficeSpace(){
        
    }
    
    public OfficeSpace(double cPF, double sFPF){
        costPerFloor = cPF;
        sqaureFeetPerFloor = sFPF;
    }
    
    public void calcCost(double x){
        costTotal = ((getFloors() * costPerFloor) + x) + (sqaureFeetPerFloor * 2.75);
    }
    
    public double getcT(){
        return costTotal;
    }
    

    public String toString() {
         return String.format("The total cost is " + costTotal);
    }
    
    @Override
    public int compareTo(Object o) {
       o = (Building)o;
        if(((OfficeSpace)this).getcT() > ((OfficeSpace)o).getcT()){
           return 1;
       } else {
           return -1;
       }
    }
}
