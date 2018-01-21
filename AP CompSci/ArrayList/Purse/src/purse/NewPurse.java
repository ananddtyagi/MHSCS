/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purse;

/**
 *
 * @author AnandTyagi
 */
import java.util.ArrayList;

public class NewPurse 
{

	// Main entry point
	static public void main(String[] args) 
	{
					
	Purse myPurse = new Purse();

	Top [ ]  myStuff = new Top[3];

	myStuff [0] = new Coin(.25, "Quarter");
	myStuff [1] = new Coin(.10, "Quarter");
	// assume TravelerCheck is another child ofSuperObject
	myStuff [2] = new TravelerCheck(100.0, "TC", "American Express"); 
							


	myPurse.add( myStuff[0] ); // adds .25 to purse and sets THIS Coin object as max
	myPurse.add( myStuff[1] ); // adds .10 to purse 
	myPurse.add( myStuff[2] ); // adds 100.0 to purse and sets THIS TravelerCheck object as max

	System.out.println("the total in the purse is " +  myPurse.getTotal()); // prints out 100.35

	
	SuperObject to = ((SuperObject)myPurse.getTop());
	
	// ArrayList Test 
	Object o = myPurse.getElement(1);
	
	if (o instanceof Coin)
		{
			System.out.println("the 2nd element in the Purse is a Coin");
		}
	
	o = myPurse.getElement(2);
		
	if (o instanceof TravelerCheck)
		{
			System.out.println("the 3rd element in the Purse is a TC");
		}
	
	
	
	// remove an element
	o = myPurse.RemoveElement(1);
	if (o instanceof Coin)
		{
			System.out.println("the 2nd element Coin is removed");
		}
	System.out.println("There are " + myPurse.getCount() + " Objects in the Purse");
	
	//o = myPurse.getElement(2); 
	// the result is an IndexOutOfBoundsException
	// as there are now only 2 elements in the ArrayList
	
	
	// modify an element -- replace a Coin with a TC
	o = myPurse.setElement(0, myStuff[2]);
	if (o instanceof Coin)
		{
			System.out.println("the 1st element was a Coin");
		}
	// display the types of objects in the purse
	String ss = myPurse.toString();
	System.out.println("the elements in the purse are now " + ss);
	
            System.out.println(myPurse.max());
        
        myPurse.find(myStuff[0], 1);
        myPurse.find(myStuff[2], 3);
        
        myPurse.howMany(myStuff);
	} // end of SPVM
	
	
}   // END OF Wrapper Class
