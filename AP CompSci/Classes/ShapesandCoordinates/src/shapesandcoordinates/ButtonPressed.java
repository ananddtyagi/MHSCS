/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesandcoordinates;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author AnandTyagi
 */
public class ButtonPressed{
    public int [][] coors;
   
    
    public ButtonPressed(){
      
    }
    
    public void BP(JButton b1, int [][] coors, int c){
    
        b1.addActionListener( new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                
                System.out.println(c);
                          
            }
        });
       
    }

}
