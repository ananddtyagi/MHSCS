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
public class Glass {
    double size; String type; static String company;
    
    public Glass(){
        this(4, "water", "CocaCola");
    }
    
    public Glass(int s, String t, String c){
        size = s;
        type = t;
        company = c;
    }
    
    
    public String toString(){
        return this.size + " " + this.type + " " + this.company;
    }
    
}
