/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groceryclass;

/**
 *
 * @author AnandTyagi
 */
public class Item {
    double price, quant, storeCost;
    int reorder, order, stock;
    String name;
    
    public Item(){
            
    }
    
    public Item(String food, int ord, double p){
        name = food;
        price = p;
        quant = 10;   
        reorder = 3;
        order = ord;     
    }
    
    public double totalCost(){
        double tC = price * order;
        Amount();
        return tC;
    }
    
    public void Amount(){
        quant -= order;
        if(quant < reorder){
            quant = 10;
            System.out.println("restocking");
        }
    }
}
