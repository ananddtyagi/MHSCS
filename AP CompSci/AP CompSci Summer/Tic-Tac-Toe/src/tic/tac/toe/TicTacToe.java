/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author AnandTyagi
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public JFrame frame;
    public static void main(String[] args) {
        JFrame frame = new JFrame("TTT");
        frame.setVisible(true);
        frame.setSize(210, 430);
        JButton S = new JButton();
        S.setBounds(0, 270, 210, 50); //sometimes occupies the whole box, don't know why
        S.setText("Start");
        
        JButton E = new JButton();
        E.setBounds(0, 350, 210, 50);
        E.setText("End");
        
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(S);
        frame.add(E);
             
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("X.png"));
            
        } catch (IOException e) {
        }
        
        
        ButtonPressed bp = new ButtonPressed();
        Graphics g = null;
       
       
        
        
        draw object = new draw();
        frame.add(object);
        object.drawing(frame, img, 0); 
        
        int k = 0;
        boolean x = false;
        
        while(x == false){
             x = bp.BP(S, g);           
             if(x){
                 k = 1;
             }
             System.out.println(k);
        } 
        
                 
            object.drawing(frame,img, k);

        
            }
    
}
