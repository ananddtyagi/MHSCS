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
public class Maintenance extends Employees{
    String name, jobType, dateOfHire;
    int age, weeksVacation, hoursWorked;
    double hourlyPay, pay;
    
    public Maintenance(){  
        super("Bob", "Electrician", "July 20", 23, 2);
        hourlyPay = 10;
        hoursWorked = 5;
    }
    
    public Maintenance(String n, String j, String d, int a, int w, double h, int wh){     
        super(n, j, d, a, w);
        hourlyPay = h;
        hoursWorked = wh;
    }
    
    public double calcPay(){
      pay =  hoursWorked * hourlyPay;
      return pay;
    }
    
    public double getHourlyPayRate(){
        return hourlyPay;
    }
    
    
    public int compareTo(Object m){
        return (int)(((Maintenance)m).getHourlyPayRate() - this.getHourlyPayRate());
    }
    
    public String toString(){
        return this.getName();
    }

}
