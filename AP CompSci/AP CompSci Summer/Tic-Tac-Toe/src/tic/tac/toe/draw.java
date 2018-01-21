/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author AnandTyagi
 */
public class draw extends JPanel {
    Scanner s;
    BufferedImage img;
    JFrame frame;

    int n, xR, yR, x, y, w;
    boolean turnC;
    int [][] coor = new int[3][3];
    Random rand;
     boolean done;
   
    public void drawing(JFrame frame, BufferedImage img, int n){
        rand = new Random();
        xR = rand.nextInt((2 - 1) + 1);
        yR = rand.nextInt((2 - 1) + 1);
        
        repaint();
        this.img = img;      
        this.n = n;
        
        this.frame = frame;
        for(int i = 0; i < 3; i++){ //initialization
            for(int j = 0; j < 3; j++){
                coor[i][j] = 0;
                
            }     
        }
        done = false;
    }
    
    @Override
    public void paintComponent(Graphics g){
        

        if(n == 0){           
                board(g);
        }   
        
        if (n == 1){             
                board(g);   
                drawX(g, xR, yR); 
                n++;
         
        }    
                
        if(n == 2){ 
            board(g); 
           
        
        addMouseListener(new MouseAdapter() {
                                      
                @Override
                public void mouseClicked(MouseEvent e){
                    x = e.getX() / 70;
                    y = e.getY() / 70;
                    
                  
                    if(coor[x][y] == 0){
                        coor[x][y] = 1;
                    }
                    repaint();
                    //repaint(0, 0, 210, 210);
                    
                }       
                
            });
        
      if(done != true){ 
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(coor[i][j] == 1){
                    drawO(g, i, j);      
                }
            }        
        }
        
         for(int i = 0; i < 3; i++){ // redraw everything
            for(int j = 0; j < 3; j++){
                if(coor[i][j] == 1){
                    reDrawO(g, i, j);      
                } else
                if(coor[i][j] == 2){
                    reDrawX(g, i, j); 
                }
            }        
        }
       }
     
        
        
        int c = 0;
        
        if(turnC == true){ //NEED TO MAKE THIS BE RANDOM SQUARE, NOT JUST THE NEXT ONE!!!
         
           c = 0;
           
            /*while(fc == false){
                if(coor[xR][yR] == 0){
                    drawX(g, xR, yR);
                    fc = true;
                } else if(c == 10){
                    */
                    outerloop:
                    for(int i = 0; i < 3; i++){ // redraw everything
                        for(int j = 0; j < 3; j++){
                            if(coor[i][j] == 0){
                                drawX(g, i, j); 
                                break outerloop;
                            }
                        }        
                    }
     /*
                }else {
                    
                       xR = rand.nextInt((2 - 1) + 1) + 1;
                       yR = rand.nextInt((2 - 1) + 1) + 1;
                       c ++;
                }
                  
            }
            */
            turnC = false;
        }
        
      
      if(!done){
            w = checkP();
            if(w == 1){
                System.out.println("You won!");
                done = true;
                w = 3;
            }
            if(w == 0){               
                w = checkC();
            }   
            if(w == 2){
                System.out.println("You lost");
                done = true;
            }
              w = 0;
       
         }
       
        
         
    }
    }
    
    public void board(Graphics g){
        g.drawLine(70, 0, 70, 210); //vertical left 
        g.drawLine(140, 0, 140, 210); //vertical right 
        g.drawLine(0, 70, 210, 70); //horizontal up 
        g.drawLine(0, 140, 210, 140); //horizontal down 
        
    }
    
    
    
    public void drawX(Graphics g, int x, int y){   
        int z = 70;
        
        g.drawImage(img, x * 70, y * 70, z, z, null);        
        coor[x][y] = 2;     
        turnC = false;
    }
    
    public void reDrawX(Graphics g, int x, int y){
        int z = 70;
   
            g.drawImage(img, x * 70, y * 70, z, z, null);
            

    }
    
    public void drawO(Graphics g, int x, int y){
              
        g.drawOval(x * 70, y * 70, 70, 70);
               coor[x][y] = 1;
               turnC = true;
              
       
    }
    public void reDrawO(Graphics g, int x, int y){
              
        g.drawOval(x * 70, y * 70, 70, 70);
              
               
    }
    
    public int checkP(){
       int r = 0, p = 0;
       outerloop:
     for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            System.out.println(i + " " + j);
         if(coor[i][j] == 1){
             r++;
         }
        }
        if(r != 3){
            r = 0;
        } else {
            p = 1;
            break outerloop;
        }
     }
       outerloop:
       for(int j = 0; j < 3; j++){
        for(int i = 0; i < 3; i++){
            System.out.println(i + " " + j);
         if(coor[i][j] == 1){
             r++;
         }
        }
        if(r != 3){
            r = 0;
        } else {
            p = 1;
            break outerloop;
        }
              
     }
    
     if(coor[0][0] == 1 && coor[1][1] == 1 && coor[2][2] == 1){
         p = 1;
     }   
     if(coor[0][2] == 1 && coor[1][1] == 1 && coor[2][0] == 1){
         p = 1;
     }   
     System.out.println(" P " + p);
        return p;
    }
    
    
    public int checkC(){
        int r = 0, p = 0;
       outerloop:
     for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            System.out.println(i + " " + j);
         if(coor[i][j] == 2){
             r++;
         }
        }
        if(r != 3){
            r = 0;
        } else {
            p = 2;
            break outerloop;
        }
     }
       outerloop:
     for(int j = 0; j < 3; j++){
        for(int i = 0; i < 3; i++){
            System.out.println(i + " " + j);
         if(coor[i][j] == 2){
             r++;
         }
        }
        if(r != 3){
            r = 0;
        } else {
            p = 2;
            break outerloop;
        }
     }
    
     if(coor[0][0] == 1 && coor[1][1] == 1 && coor[2][2] == 1){
         p = 2;
     }   
     if(coor[0][2] == 1 && coor[1][1] == 1 && coor[2][0] == 1){
         p = 2;
     }   
              
     System.out.println(" C" + p);
        return p;
    }
}
