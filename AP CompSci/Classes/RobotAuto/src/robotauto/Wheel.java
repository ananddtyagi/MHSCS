/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package robotauto;

/**
 *
 * @author AnandTyagi
 */
public class Wheel extends Bot{
    double dist = 0;
    double rpm = 0;
    
    public Wheel(double r){
        dist = 0;
        rpm = r;
    }
    
    public void forward(double x){
        MoveForward(x);
        dist += x;
    }
    public void back(double x){
        MoveBack(x);
        dist -= x;
    }
    public void stay(){
        MoveForward(0);
        MoveBack(0);
    }
}
