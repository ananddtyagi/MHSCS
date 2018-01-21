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
public abstract class Building implements Comparable{
    private int floors = 5;
    
    public void setFloors(int f){
        floors = f;
    }
    
    public int getFloors(){
        return floors;
    }
    
    public abstract void calcCost(double x);
    
    
    
}
