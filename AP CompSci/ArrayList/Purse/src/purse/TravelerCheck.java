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
public class TravelerCheck extends SuperObject  implements Top
{
	private static int numTC = 0;
	private String checkType;
	
	public TravelerCheck(double value, String name, String t) 
	{  
		checkType = t;
		numTC++;
		setMyValue(value);	
		setMyName(name);
	}
	
	public TravelerCheck()
	{
		this(100.0, "TC", "American Express");
	} 
	
	public double getTop()  
	{  
	return getMyValue(); 
	}
	
	public String getCheckType()
	{
		return checkType;
	}
	
	public int getNum()
	{
		return numTC;
	}
} 