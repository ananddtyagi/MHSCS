/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinvestment;

/**
 *
 * @author AnandTyagi
 */
public class CD extends Investment{
    
    public double start, rate, val;
    public int term;
    
    public CD(){
        
    }

    public CD(String n, String p, String s, int a, double st, double r, int t){
        super(n, p, s, a);
        start = st;
        rate = r;
        term = t;
    }

    void calcValue() {
        val =  start * (term * (rate / 360));
        super.setVal(val);
    }


    
}
