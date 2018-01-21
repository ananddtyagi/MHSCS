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
public abstract class Transportation implements Comparable{
    static private double speed, time, cost;
    static private int src, dest, dist;
    
    
    public Transportation(int de, int di, int s){
        dest = de;
        dist = di;
        src = s;
    }
   
    public abstract double calcTime(double s, int dist);
    
    public abstract double calcCost(double r);
    
    public abstract void setCost(double c);
    
    public abstract double getCost();
    
    public int compareTo(Rail o){
        int re = 0;
        if(this.getCost() < o.getCost()){
            re = 1;
        }
        return re;
    }
    public int compareTo(Ground o){
        int re = 0;
        if(this.getCost() < o.getCost()){
            re = 1;
        }
        return re;
    }
    
    public int compareTo(Sea o){
        int re = 0;
        if(this.getCost() < o.getCost()){
            re = 1;
        }
        return re; 
    }
    public int compareTo(Air o){
        int re = 0;
        if(this.getCost() < o.getCost()){
            re = 1;
        }
        return re;
    }
    
   
    
}
