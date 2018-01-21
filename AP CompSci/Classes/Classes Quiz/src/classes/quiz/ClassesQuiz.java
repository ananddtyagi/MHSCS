/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes.quiz;

/**
 *
 * @author AnandTyagi
 */
public class ClassesQuiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Glass g1 = new Glass();
        Glass g2 = new Glass(5, "sprite", "Sprite");
        
        System.out.println(g1);
        System.out.println(g2);
    }
    
}
