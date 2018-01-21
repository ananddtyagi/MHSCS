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
public class Ground extends Transportation{
    public double speedB, speedC, rateB, rateC, timeB, timeC, costB, costC, time, cost;
    
    public Ground(int de, int di, int s, int type){
        super(de, di, s);
        
        if(type == 2){
            speedC = 10;
        rateC = 25;
        
        timeC = calcTime(speedC, di);
        costC = calcCost(rateC);
        } else {
        speedB = 10;
        rateB = 30;
        
        timeB = calcTime(speedB, di);
        costB = calcCost(rateB);
        }
        
    }

     public double calcTime(double s, int dist){
        double t = dist * s;
        setTime(t);
        return t;
    }
    
     public void setTime(double t){
         time = t;
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
