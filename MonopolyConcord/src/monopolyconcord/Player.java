/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolyconcord;

/**
 *
 * @author Saugat
 */
public class Player {
    
    int bankAccount = 1500;
    String name = new String();
    boolean inJail = false;
    public int position = 0;
    public int prevPosition = 0;
    
    public Player(){
        name = "Untitled";
    }
    
    public Player(String playerName){
        name = playerName;
    }
    
    public void roomAndBoard()
    {
        System.out.println("Room and Board paid: $200");
        bankAccount-= 200;
    }
    
    public void lostKey(){
        System.out.println("Lost key Fine: $75");
        bankAccount -= 75;
        System.out.println(name + " now has $" + bankAccount + 
                " in his/her bank account");
    }
}
