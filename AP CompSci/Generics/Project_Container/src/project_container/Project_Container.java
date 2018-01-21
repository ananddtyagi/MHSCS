/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_container;

/**
 *
 * @author AnandTyagi
 */
public class Project_Container {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Container<String> c = new Container<String>();
        
        c.add("hello");
        c.add("hi");
        c.add("asdf");
        c.remove(0);
        
        
        for(String s: c.getArray()){
            System.out.println(s);
        }
              
    }
    
}
