package testinvestment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AnandTyagi
 */
public abstract class Investment implements Comparable<Investment>{
    private String name, phoneNum, SSN;
    private int age;
    private double total;
    private double val;
    
    Investment(){
        
    }
    
    Investment(String n, String p, String s, int a){
        setName(n);
        setPhone(p);
        setSSN(s);
        setAge(a);
    }
    
    //sets  
    public void setName(String n){
       name =  n;
    }
    public void setPhone(String p){
        phoneNum = p;
    }
    public void setSSN(String s){
        SSN = s;
    }
    public void setAge(int a){
        age = a;
    }
    public void setTotal(double t){
        total = t;
    }
    
    public void setVal(double v){
        val = v;
    }
    
    //gets  
    public String getName(){
       return name;
    }
    public String getPhone(){
        return phoneNum;
    }
    public String getSSN(){
        return SSN;
    }
    public int getAge(){
        return age;
    }
    public double getTotal(){
        return total;
    }
    public double getVal(){
        return val;
    }
    
    
    abstract void calcValue();
    
    public String toString(){
        return getName() + ", " + this.getVal() + ", " + "CD";
    }
    
    public int compareTo(Investment i){
        return (int)(this.val - i.val);
    }
}
