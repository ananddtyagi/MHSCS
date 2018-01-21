 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryclass;

import java.util.Scanner;

/**
 *
 * @author AnandTyagi
 */
public class GroceryClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean done = false;
       double cost = 0;
       Scanner s = new Scanner(System.in);
       
       while(!done){
           System.out.println("Would you like to buy 1.Milk 2.Cereal or 3.Grapes (enter a number)");     
           int which = s.nextInt();
           
           System.out.println("How many would you like?");
           int am = s.nextInt();
           
           switch(which){
               case 1: Item m = new Item("Milk", am, 2);
                    cost += m.totalCost();
                   break;
               case 2: Item c = new Item("Cereal", am, 3);
                    cost += c.totalCost();
                   break;
               case 3: Item g = new Item("Grapes", am, 4);
                    cost += g.totalCost();
                   break;
           }
           
           System.out.println("The current total cost is " + cost);
           
           
           System.out.println("Do you want to continue shopping? (Y/N)");
           if(s.next().equals("N")){
               done = true;
           }
       }
       
        
        
    }
    
}
