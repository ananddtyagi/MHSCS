/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesandcoordinates;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
/**
 *
 * @author AnandTyagi
 */

public class draw extends JPanel{
    int c = 0;
    Graphics gd;
    int [][] graph;
    
    public void drawing(int [][] coor){
        repaint(0, 0, 1050, 170);
        this.graph = graph;

    }
    
    //making the boxes
 
    @Override
    public void paintComponent(Graphics g){
        
        gd = g;
      
        
    }
    
    
    public void setgraph(int[][] graph){
        this.graph = graph;
    }
    public int[][] getgraph(){
        return graph;
    }
        
    public void setc(){
        c++;
    }
    public int getc(){
        return c;
    }
    
    
    
}
