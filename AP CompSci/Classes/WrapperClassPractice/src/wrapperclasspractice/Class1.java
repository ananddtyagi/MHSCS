/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapperclasspractice;

/**
 *
 * @author AnandTyagi
 */
public class Class1 {
    static int x;
    int y;
    int z;
    
    public Class1(){
        x = 0;
        y = 3;
        z = 5;
    }
    
    public Class1(int a){
        x = a;
    }
    
    public int getX(){
        return x;
    }
    
    private int getY(){
        return y;
    }
    
    protected int getZ(){
        return z;
    }
}
