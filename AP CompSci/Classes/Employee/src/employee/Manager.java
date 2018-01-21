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
public class Manager extends Employees{
    String name, jobType, dateOfHire;
    int age, weeksVacation;
    double annualSalary, pay;
    
    public Manager(){  
        super("Sally", "CTO", "May 12", 25, 4);
        annualSalary = 230;
    }
    public Manager(String n, String j, String d, int a, int w, double an){     
        super(n, j, d, a, w);
        annualSalary = an;
    }
    
    public double calcPay(){
        pay =  annualSalary / 52;
        return pay;
    }
    
    public double getAnnualSalary(){
        return annualSalary;
    }
    
    public int compareTo(Object m){
        return (int)(((Manager)m).getAnnualSalary() - this.getAnnualSalary());
    }

    public String toString(){
        return this.getName();
    }

    
}
