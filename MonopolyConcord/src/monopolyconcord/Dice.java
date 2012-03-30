/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolyconcord;

/**
 *
 * @author Saugat
 */
public class Dice {
    private int total;
    
    public int rollDice(int sides, int numberOfDice){
        total = 0; 
        
        while (numberOfDice > 0)
        {
            total = total + (int)(Math.random() * sides) +1;
            numberOfDice--;
        }
        System.out.println("Total: " + total);
        
        return total;
    }
}
