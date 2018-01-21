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
public class Employee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employees[] e = new Employees[6];
        
        e[0] = new Maintenance();
        e[1] = new Maintenance("Joe", "Plumber", "August 23", 40, 3, 15, 4);
        e[2] = new Manager();
        e[3] = new Manager("Molly", "CEO", "June 23", 26, 4, 250);
        e[4] = new Executive();
        e[5] = new Executive("Craig", "HR", "January 22", 45, 5, 400, 120, 4);

        if(e[0] instanceof Maintenance && e[1] instanceof Maintenance){
            if((e[0]).compareTo(e[1]) > 1){
                System.out.println(e[0]);        
            } else {
                System.out.println(e[1]);
            }
        }
        if(e[2] instanceof Manager && e[3] instanceof Manager){
            if((e[2]).compareTo((e[3])) > 1){
                System.out.println(e[2]);        
            } else {
                System.out.println(e[3]);
            }
        }
        if(e[4] instanceof Executive && e[5] instanceof Executive){
            if((e[4]).compareTo((e[5])) > 1){
                System.out.println(e[4]);        
            } else {
                System.out.println(e[5]);
            }
        }
        
    
    }
    
}
