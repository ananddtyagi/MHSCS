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
public class RobotAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Wheel w1 = new Wheel(10);
        Wheel w2 = new Wheel(10);
        Wheel w3 = new Wheel(10);
        Wheel w4 = new Wheel(10);
        
        Bot b = new Bot(w1, w2, w3, w4);
        
        b.Instructions("left 2 right 3 forward 4");
        
        
    }
    
}
