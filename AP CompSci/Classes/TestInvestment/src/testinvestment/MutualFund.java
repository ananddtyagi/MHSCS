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
public class MutualFund extends Investment{
    
    public double unit, values, val;

    public MutualFund(){
        
    }
    
    public MutualFund(String n, String p, String s, int a, double sh, double val){
        super(n, p, s, a);
        unit = sh;
        values = val;
    }
    
    void calcValue() {
        val =  unit * values;
        super.setVal(val);
    }
   

}
