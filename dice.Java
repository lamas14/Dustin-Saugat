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
* Asks for the number of sides of a    *
*     dice and how many of them to     *
*     roll.                            *
*                                      *
* Date of last revision: 18-Feb-2012   *
***************************************/


import java.util.*;

public class dice
{
    private int sides;
    private int number;
    private int total;

    //Default constructor
    public dice()
    {
        sides = 6;
        number = 1;
    }


    /*Constructor. Receives the number 
    of sides and the number of die. */
    public dice(int s, int n)
    {
        sides = s;
        number = n;
    }


    /*Rolls 'number' amount of 'sides'
    sided die and stores the total
    amount rolled in 'total'.*/
    public int rollDice()
    {
        while(number > 0)
        {
            total = (int)(Math.random() * sides) + 1;
            number--;
        }

        return total;
    }
  
}//class