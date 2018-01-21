/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transportationclass;

import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class TransportationClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner b = new Scanner(System.in);
        
        Transportation [] t = new Transportation[2];
        
        System.out.println("Please enter your source, destination, and distance");
        
        int src = b.nextInt();
        int dest = b.nextInt();
        int dist = b.nextInt();

        System.out.println("What type do you want? (1.Rail, 2. Ground (CAR), 3. Ground (BUS) 4. Sea, 5. Air). Enter Number");
        
        int resp = b.nextInt();
        
        switch(resp){
            case 1: Rail r = new Rail(dest, dist, src);
                t[0] = r;
                break;
            case 2: Ground g2 = new Ground(dest, dist, src, 2);
                t[0] = g2;
                break;
            case 3: Ground g3 = new Ground(dest, dist, src, 3);
                t[0] = g3;
                break;             
            case 4: Sea s = new Sea(dest, dist, src);
                t[0] = s;
                break;
            case 5: Air a = new Air(dest, dist, src);
                t[0] = a;
                break;
        }
        
        System.out.println("Please enter your source, destination, and distance for the other destination");
        
        src = b.nextInt();
        dest = b.nextInt();
        dist = b.nextInt();
        
        System.out.println("What do you want to compare it to? (1.Rail, 2. Ground (CAR), 3. Ground (BUS) 4. Sea, 5. Air). Enter Number");
        
        resp = b.nextInt();
        
        switch(resp){
            case 1: Rail r = new Rail(dest, dist, src);
                t[1] = r;
                SortAll.bubbleSort(r, 1);
                break;
            case 2: Ground g2 = new Ground(dest, dist, src, 2);
                t[1] = g2;
                SortAll.bubbleSort(g2, 2);
                break;
            case 3: Ground g3 = new Ground(dest, dist, src, 3);
                t[1] = g3;
                SortAll.bubbleSort(g3, 3);
                break;             
            case 4: Sea s = new Sea(dest, dist, src);
                t[1] = s;
                SortAll.bubbleSort(s, 4);
                break;
            case 5: Air a = new Air(dest, dist, src);
                t[1] = a;
                SortAll.bubbleSort(a, 5);
                break;
        }
        
        
                  
        
        
    }
    
}
