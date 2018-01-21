/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotauto;

import java.util.StringTokenizer;

/**
 *
 * @author AnandTyagi
 */
public class Bot {
    Wheel w1;
    Wheel w2;
    Wheel w3;
    Wheel w4;
    int dist = 0;
    
    public Bot(){
        
    }
    
    public Bot(Wheel w1, Wheel w2, Wheel w3, Wheel w4){
        this.w1 = w1; //front left
        this.w2 = w2; //front right
        this.w3 = w3; //back left
        this.w4 = w4; //back right
    }
    
    public void Instructions(String inst){
        StringTokenizer st = new StringTokenizer(inst);
        while(st.hasMoreTokens()){
            if(st.nextToken().equals("left")){
                w1.forward((double)Double.parseDouble(st.nextToken()));
                w2.back((double)Double.parseDouble(st.nextToken()));
                w3.back((double)Double.parseDouble(st.nextToken()));
                w4.forward((double)Double.parseDouble(st.nextToken()));
            }
            if(st.nextToken().equals("right")){
                w1.back((double)Double.parseDouble(st.nextToken()));
                w2.forward((double)Double.parseDouble(st.nextToken()));
                w3.forward((double)Double.parseDouble(st.nextToken()));
                w4.back((double)Double.parseDouble(st.nextToken()));
            }
            if(st.nextToken().equals("forward")){
                w1.forward((double)Double.parseDouble(st.nextToken()));
                w2.forward((double)Double.parseDouble(st.nextToken()));
                w3.forward((double)Double.parseDouble(st.nextToken()));
                w4.forward((double)Double.parseDouble(st.nextToken()));
            }
            if(st.nextToken().equals("back")){
                w1.back((double)Double.parseDouble(st.nextToken()));
                w2.back((double)Double.parseDouble(st.nextToken()));
                w3.back((double)Double.parseDouble(st.nextToken()));
                w4.back((double)Double.parseDouble(st.nextToken()));
            }
        }       
        
    }
    
    protected void MoveForward(double x){
        //moves motor forward
    }
    
    protected void MoveBack(double x){
        //moves motor backwards
    }
    
    protected double Reset(){
        return 0;
    }
   
    
    protected double calcDist(int r, int s){
        dist = r * s;
        return dist;
    }
}

