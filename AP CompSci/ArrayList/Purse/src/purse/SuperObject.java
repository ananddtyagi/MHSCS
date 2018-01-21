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
// abstract due to abstract method getNum
abstract public class SuperObject implements Comparable
{
	private String myName;
	private double myValue;
	
	public SuperObject() 
	{ 
		myName = "";
		myValue = 0; 
		
	}
	
	public double getMyValue()
	{
	 return myValue;
	}
	
	public String getMyName()
	{
	 return myName;
	}
	
	public void setMyName(String s)
	{
		myName = s;
	}
	
	// PRECONDITION:  value is > 0 and less than 100
	public void setMyValue(double d)
	{
		myValue = d;
	}
	
	// abstract method to have behavior coded in children
	abstract public int getNum();
	
	public int compareTo(Object o) throws ClassCastException
	{
		if (this.myValue < ((SuperObject)o).myValue)
			{
				return -1;
			}
		if (this.myValue > ((SuperObject)o).myValue)
			{
				return 1;
			}
			
		return 0;  // equal
	}
	
	public String toString()
	{
		return myName;
	}
}


