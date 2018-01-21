/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sum.array;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AnandTyagi
 */
public class SumArray {

    /**
     * @param args the command line arguments
     */
    static Scanner a;
    public static void main(String[] args) {
        a = new Scanner(System.in);
        
        System.out.println("Hello. Welcome to the matrix. " + "\n" 
                + "You can enter up to 4 numbers per row and 5 per column (a 4x5 matrix). " + "\n" 
                + "If you would like to enter a smaller matrix, enter the value 0 after your last value. " + "\n" 
                + "Please enter your numbers for your matrix (Ex. 4 5 6...) (NOTE: they must be integers): ");
        
        JFrame frame = new JFrame("Square"); //print out the matrix
        frame.setVisible(true);
        frame.setSize(300, 300);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //draw object = new draw();
        
        int r, c, nI = 0, NoN = 0; // NoN = number of numbers
        int [][] matrixI = new int [5][4];
        nI = a.nextInt();
        outerloop:
        for(r = 0; r < 5; r++){
            for(c = 0; c < 4; c++){         
                if(nI < 0){
                    break outerloop;
                }
                
                matrixI[r][c] = nI;             
                
                nI = a.nextInt();               
            }                 
        }
        if(r == 5){
            System.out.println("The array is full");
        } else {
            System.out.println("Thank you for entering your values");
        }
        valInt(matrixI);
        System.out.println("Please enter double values");
        double nD;
        
        double [][] matrixD = new double [5][4];
        nD = a.nextDouble();
        outerloop:
        for(r = 0; r < 5; r++){
            for(c = 0; c < 4; c++){         
                if(nI < 0){
                    break outerloop;
                }
                
                matrixD[r][c] = nD;             
                
                nD = a.nextDouble();               
            }                 
        }
        if(r == 5){
            System.out.println("The array is full");
        } else {
            System.out.println("Thank you for entering your values");
        }
        
        valDoub(matrixD);
        
        System.out.println("");
       
    }
    
    static public void valInt(int [][] matrixI){
        int r = 0, c = 0;
        int total, NoN = 0; //row 1, row 2...
        total = NoN;
        double avg = 0;
        int [] rA = new int[5]; //rA = rows array
        outerloop:
        for(r = 0;r < 5; r++){
            for(c = 0; c < 4; c++){         
                if(matrixI[r][c] < 0){
                    break outerloop;
                }
                
                
                rA[r]+= matrixI[r][c]; 
                
                System.out.println(rA[0] + " " + rA[1] + " " + rA[2] + " " + rA[3] +  " " + rA[4]);
             
                NoN++;
            }     
                  
        }
      
        for(int i : rA){
            total += i;
        }
        
        avg = (double)total / NoN;   
        avg = avg * 1000;  
        avg /= (double)1000;
        
        System.out.println("Results: Row 1: " + rA[0] + "\n" +
                           "         Row 2: " + rA[1] + "\n" +
                           "         Row 3: " + rA[2] + "\n" +
                           "         Row 4: " + rA[3] + "\n" +
                           "         Row 5: " + rA[4] + "\n" +
                           "           SUM: " + total);
        System.out.print("           AVG: ");
        System.out.printf("%.3f", avg);
        System.out.println();
        
       
    }
    
    static public void valDoub(double [][] matrixD){
        int r = 0, c = 0, NoN = 0; //NoN = Number of Numbers
        double total, avg= 0; //row 1, row 2...
        total = avg;
        double [] rA = new double[5];
        
        outerloop:
        for(r = 0;r < 5; r++){
            for(c = 0; c < 4; c++){         
                if(matrixD[r][c] < 0){
                    break outerloop;
                }
                
                rA[r] += matrixD[r][c];
                
                System.out.println(rA[0] + " " + rA[1] + " " + rA[2]+ " " + rA[3] + " " + rA[4]);
                
                NoN++;              
            }     
                  
        }
        if(r == 5){
            System.out.println("The array is full");
        } else {
            System.out.println("Thank you for entering your values");
        }
        
        
        for(double x: rA){ // how can I make x and int and still have it work?
            total += x;
        }
        
        avg = (double)total / NoN;    
        avg = avg * 1000;  
        avg /= (double)1000;
        
        System.out.println("Results: Row 1: " + rA[0] + "\n" +
                           "         Row 2: " + rA[1] + "\n" +
                           "         Row 3: " + rA[2] + "\n" +
                           "         Row 4: " + rA[3] + "\n" +
                           "         Row 5: " + rA[4] + "\n" +
                           "           SUM: " + total);
        System.out.print("           AVG: ");
        System.out.printf("%.3f", avg);
        System.out.println();
        
    }
    
}
