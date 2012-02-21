/************************************************
* Programmer: Saugat Lama			*
* RollDice program:				*
*   Takes number of dice and sides in a die	*
*   Returns Total rolled			*
* Mr. Lonnie Bowe				*
* February 20, 2012				*
* Written in Notepad (Windows 7 64-bit)		*
************************************************/ 

import java.util.*;
import java.io.*;

public class RollDice
{
	private int sides;
	private int numDice;

	// Constructor with no param
	public RollDice()
	{
		sides = 6;
		numDice = 1;
	}

	// Constructor: 
	public RollDice(int s, int n)
	{
		sides = s;
		numDice = n;
	}

	/**
	 * Generates random numbers obtained from rolling the dice
	 * The range of the random numbers depends on the number of sides
	 * @param sides		number of sides in a die
	 * @param numDice	number of dice rolled
	 * @return sum		total number rolled
	 */
	public static int totalRolled()
	{
		Random generator = new Random();
		int sum = 0;
		for(int i=0; i<numDice; i++)
		{
			sum += generator.nextInt(sides) +1;
		}
		return sum;
	}
}