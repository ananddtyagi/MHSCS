/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tic.tac.toe;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author AnandTyagi
 */
class ButtonPressed extends TicTacToe{

    Graphics g;
    BufferedImage img;
    boolean x;
    public boolean BP(JButton S, Graphics g) {
        this.g = g;
         x = false;
            S.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x = true;
                            
            }

        });
        
return x;
    }
}
