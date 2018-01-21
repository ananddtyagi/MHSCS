/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purse;

import java.util.ArrayList;

/**
 *
 * @author AnandTyagi
 */
public class Purse 
{
	private double sum;
	private int count = 0;
	private Top max;
	private ArrayList myArray;
	
	public Purse ()
	{
		myArray = new ArrayList(100); 
		// initial capacity of 100 objects
								
	}
	
	public void add(Top ci)  
	{ 
		 // code here 
		if (count == 0 ||  max.getTop() < ci.getTop() )
		{
			max = ci;
		}
		count++;
		sum += ci.getTop();
		// added for arraylist
		// add new "coin" or "TC" superobject to list
		myArray.add(ci);
		
	}
	
	public double getTotal()  
	{  
		return sum; 
	}
	
	public Top getTop()
	{
		return max;
	}
	
	public int getCount()
	{
		// return count;
		return myArray.size();
	}
	
	public Object getElement(int i)
	{
		return myArray.get(i);
	} 
	
	public Object RemoveElement(int i)
	{
		return myArray.remove(i);
	} 
	
	public Object setElement(int e, Object o)
	{
		return myArray.set(e, o);
	}
        
        public String max(){
          
            return "The maximum valued item is a " + max;
        }
        
        public void find(Top o, int n){
            boolean found = false;
            
            for(int i = 0; i < myArray.size(); i++){
                if(o.equals(myArray.get(i))){
                    found = true;
                }
            }
            
            if(found){
                System.out.println("Element " + n + " was found");
            } else {
                System.out.println("Element " + n + " was not found");
            }
        }
        
        public void howMany(Top [] t){ //how are you supposed to make this general for as many objects as possible?
            
            int c = 0, tc = 0;
            for(int i = 0; i < t.length; i++){
                if(t[i] instanceof Coin){
                    c++;
                } else {
                    tc++;
                }
                    
            }
            
            System.out.println("Number of Coins: " + c);
            System.out.println("Number of Traveler Checks: " + tc);
        }
	
	public String toString()
	{
		String s = " ";
		
		for(int x = 0; x < myArray.size(); x++)
		{
			
			s += ((SuperObject)myArray.get(x)).toString();
			s += " ";
		} 
		return s;
	}
	
}

