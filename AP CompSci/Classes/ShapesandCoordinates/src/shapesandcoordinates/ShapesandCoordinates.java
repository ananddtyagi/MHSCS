/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesandcoordinates;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AnandTyagi
 */
public class ShapesandCoordinates {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame("TSRF");
        frame.setVisible(true);
        frame.setSize(1050, 310);
        JButton b1 = new JButton();  
        b1.setBounds(20, 180, 300, 100);
        b1.setText("Calc");
        
        frame.add(b1);
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        draw object = new draw();
        
        int [][] graph = new int [105][17];
        
        frame.add(object);
        object.drawing(graph);
        
        ButtonPressed bp = new ButtonPressed();
  
        bp.BP(b1, object.getgraph(), object.getc());
        
        
        int [][] coors = new int [3][2];
        
        coors [0][0] = 1;
        coors [0][1] = 2;
        coors [1][0] = 3;
        coors [1][1] = 4;
        coors [2][0] = 5;
        coors [2][1] = 6;
        
        
    }
    
}
