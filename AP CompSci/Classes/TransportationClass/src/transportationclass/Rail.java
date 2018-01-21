/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportationclass;

/**
 *
 * @author AnandTyagi
 */
public class Rail extends Transportation {
    public double speed, rate, time, cost;
    
    public Rail(int de, int di, int s){
        super(de, di, s);
        speed = 100;
        rate = 2.30;
        
        time = calcTime(speed, di);
        cost = calcCost(rate);
        
    }

     public double calcTime(double s, int dist){
        time = dist * s;
        return time;
    }
    
    public double calcCost(double r){
        cost = r * time;
        return cost;
    }
    
    public void setCost(double c){
       cost = c;
    }
    
    public double getCost(){
        return cost;
    }
    
    @Override
    public String toString(){
        return "hello";
    }

    @Override
    public int compareTo(Object o) {
           
    }

    
}

