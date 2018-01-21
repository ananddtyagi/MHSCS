/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.practice.lab.pkg1;

/**
 *
 * @author AnandTyagi
 */
public class ArraysPracticeLab1 {

    /**
     * @param args the command line arguments
     */
    static int [] prim;  //primitive
    static String[] imm; //immutable
    static StringBuffer [] sB; //mutable
    
    public static void main(String[] args) {     
        
        prim = new int[2];
        prim[0] = 1;
        prim[1] = 2;
        System.out.println(prim[0]);
        ProcessPrimitive(prim);
        System.out.println(prim[0]);    
        
        imm = new String[2];
        imm[0] = "Joe";
        imm[1] = "sally";
        System.out.println(imm[0]);
        ProcessImmutable(imm);
        System.out.println(imm[0]);
        
        sB = new StringBuffer[2];
        sB[0] = new StringBuffer("pool");
        sB[1] = new StringBuffer("house");
        
        System.out.println(sB[0]);
        ProcessMutable(sB);
        System.out.println(sB[0]);     
        
    }
    
    public static void ProcessPrimitive(int [] x){
       ChangeElement(x[0]);
    }
    
    public static void ProcessImmutable(String [] x){
        ChangeElement(x[0]);
    }
    
    public static void ProcessMutable(StringBuffer [] x){   
        ChangeElement(x[0]);
    }
    
     
    public static void ChangeElement(int y){
        y = 1738;
    }
    
    public static void ChangeElement(String y){
        y = "name";
    }
    
    public static void ChangeElement(StringBuffer y){
        y.replace(0, y.length(), "asdf");
    }
    
}
