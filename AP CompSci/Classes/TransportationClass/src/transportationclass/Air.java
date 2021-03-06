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
public class Air extends Transportation{
    public double speed, rate, time, cost;
    
    public Air(int de, int di, int s){
        super(de, di, s);
        speed = 700;
        rate = 223;
        
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
