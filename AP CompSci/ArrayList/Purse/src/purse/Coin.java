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
public class Coin extends SuperObject implements Top
{
	private static int numCoins = 0;
	
	public Coin(double value, String name) 
	{  
		setMyValue(value);	
		setMyName(name);
		numCoins++;
	}
	
	public Coin( )
	{
		this(1, "dollar");  // calls Coins constructor that takes 2 arguments
	} 
	
	public double getTop( )  
	{  
	return getMyValue(); 
	}
	
	public int getNum()
	{
		return numCoins;
	}
} 
