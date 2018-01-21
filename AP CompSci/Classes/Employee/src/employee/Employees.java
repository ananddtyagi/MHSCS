/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author AnandTyagi
 */
public abstract class Employees implements Comparable{
    String name, jobType, dateOfHire;
    int age, weeksVacation;
    
    public Employees(){
        
    }
    
    public Employees(String n, String j, String d, int a, int w){
        name = n;
        jobType = j;
        dateOfHire = d;
        age = a;
        weeksVacation = w;
    }
    
    public abstract double calcPay();
    
    public String getName(){
        return name;
    }
    
    public abstract int compareTo(Object o);
    
}
