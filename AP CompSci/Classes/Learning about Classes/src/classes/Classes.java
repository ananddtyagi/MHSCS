/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author AnandTyagi
 */
public class Classes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Building b = new Apartment(15.5); 

        b.calcCost(12.5);

        System.out.println(b); 
        
        Building os = new OfficeSpace(15.5, 10); 

        os.calcCost(12.5);

        System.out.println(os);
        
        Building [] A = new Building[2];
        
        A[0] = new Apartment(20);
        A[1] = new Apartment(15);
        
        A[0].calcCost(16);
        A[1].calcCost(12);
        
        System.out.println((A[0]) + " one");
        System.out.println((A[1]) + " one");
        
        SortAll.bubbleSort(A);

        System.out.println((A[0]) + " two");
        System.out.println((A[1])+ " two");
        
        
    }
}
