/***************************************
* Written by: Dustin Farley            *
*                                      * 
* CPU: Intel Atom N570                 *
*      dual core @ 1.66 Ghz            *
*                                      *
* OS: Windows 7 Home Premium 32 bit    * 
*                                      *
* Written in: Notepad                  *
*                                      *
* JUnit test class for dice class      *
*                                      *
* Date of last revision: 18-Feb-2012   *
***************************************/


import org.junit.* ;
import static org.junit.Assert.* ;

public class diceTest 
{

    @Test
    public void test_rollDiceSides() 
    {
        System.out.println("Test for valid number of sides... ");
        dice dTwenty = new dice(20,1);
        assertTrue( (dTwenty.rollDice() < 20) && (dTwenty.rollDice() > 0) );
    }

    @Test
    public void test_rollDiceNumber() 
    {
        System.out.println("Test for correct number of die being rolled... ");
        dice dSix = new dice(6,3);
        assertTrue( ((dSix.rollDice()/3) < 6) && ((dSix.rollDice()/3) > 0) );
    }

}//class