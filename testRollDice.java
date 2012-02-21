/************************************************
* Programmer: Saugat Lama			*
* JUnit RollDice Tester:			*
*   Tests if the RollDice program works		*
* Mr. Lonnie Bowe				*
* February 20, 2012				*
* Written in Notepad (Windows 7 64-bit)		*
************************************************/ 

import org.junit.*;
import static org.junit.Assert.*;

public class testRollDice
{
	@Test
	public void testNumDice()
	{
		System.out.println("Test if the right numDice is used...");
		int numDice = 3;
		int sides = 6;
		RollDice a = new RollDice(sides, numDice);
		assertTrue(a.totalRolled() <=18 && a.totalRolled() >=3);
	}
	@Test
	public void testsides()
	{
		System.out.println("Test if the right sides is used...");
		int numDice = 2;
		int sides = 10;
		RollDice a = new RollDice(sides, numDice);
		assertTrue(a.totalRolled() <=20 && a.totalRolled() >=2);
	}
}