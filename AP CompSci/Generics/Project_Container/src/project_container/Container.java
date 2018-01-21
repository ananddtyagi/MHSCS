/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_container;

import java.util.ArrayList;

/**
 *
 * @author AnandTyagi
 */
public class Container <T1>{
    
    private T1 t1;
    ArrayList<T1> obj = new ArrayList<T1>();
    
    public Container(){
        
    }
    
    public Container(T1 t1){
        this.t1 = t1;       
       
    }
    
    public T1 gett1(){
        return t1;
    }
    
    public void add(T1 t){
        obj.add(t);
    }
    
    public void remove(int i){
        obj.remove(i);
    }
    
    public ArrayList<T1> getArray(){
        return obj;
    }
    
    
    
}
