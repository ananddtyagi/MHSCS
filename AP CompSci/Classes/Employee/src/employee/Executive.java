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
public class Executive extends Employees{
    String name, jobType, dateOfHire;
    int age, weeksVacation;
    double annualSalary, yearEndBonus, weeklyBonus, pay;

    public Executive(){   
        super("Ben", "PR", "December 23", 34, 5);
        annualSalary = 320;
        yearEndBonus = 100;
        weeklyBonus = 2;
    }
    
    public Executive(String n, String j, String d, int a, int w, double an, double yB, double wB ){     
        super(n, j, d, a, w);
        annualSalary = an;
        yearEndBonus = yB;
        weeklyBonus = wB;
        
    }
    
    public double calcPay(){
        pay =  annualSalary / 52 + weeklyBonus;
        return pay;
    }
    
    public double getYearEndBonus(){
        return yearEndBonus;
    }
    
    public int compareTo(Object e){
        return (int)(((Executive)e).getYearEndBonus() - this.getYearEndBonus());    
    }
    
    public String toString(){
        return this.getName();
    }
}
