/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package the.big.e.z;

import java.util.Random;

/**
 *
 * @author AnandTyagi
 */
public class TheBigEZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double total = 0, temp = 0;
        int num = 0, i = 0;
        Random r = new Random();
        
        while(i < 1000){
            temp = 0;
            while(temp < 1){
                temp += (double)((r.nextInt(9 - 1) + 1)) / 10;           
                num++;
            }          
            
            i++;
        }
        
        System.out.println((double)num / i);
    }
    
}
