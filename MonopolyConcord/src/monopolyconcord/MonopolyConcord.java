/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolyconcord;

/**
 *
 * @author Saugat
 */
public class MonopolyConcord {
    static public int numberOfPlayers;
    static Board board;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        board = new Board();
        board.setVisible(true);
    }
}
