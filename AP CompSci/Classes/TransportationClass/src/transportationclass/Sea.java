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
public class Sea extends Transportation{
    public double speed, rate, time, cost;
    
    public Sea(int de, int di, int s){
        super(de, di, s);
        speed = 23;
        rate = 23.23;
        
        time = calcTime(speed, di);
        cost = calcCost(rate);
    }
    
     public double calcTime(double s, int di){
        time = di * s;
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
}
