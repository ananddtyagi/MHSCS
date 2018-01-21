/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect.hiring;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class PerfectHiring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long N = input.nextLong();
        long P = input.nextLong();
        long X = input.nextLong();
        ArrayList<Long> Ai = new ArrayList<Long>();
        long greatest = 0, number = 0, index = 0;
        for(int i = 0; i < N && P > 0; i++){
            number = input.nextLong();
            if(number * P > greatest){
                greatest = number * P;
                index = i + 1;
            }
            P -= X;   
        }
        
        System.out.println(index);
        
        
        
        
    }
    
}
