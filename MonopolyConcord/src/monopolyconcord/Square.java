/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package monopolyconcord;

/**
 *
 * @author Saugat
 */
public class Square {
    String name;
    String color;
    int position;
    int price;
    int numberOfHouses;
    boolean hotel;
    int xCoor;
    int yCoor;
    
    public Square(){
        name = "N/A";
        color = "clear";
        position = 0;
        price = 0;
        numberOfHouses = 0;
        hotel = false;
    }
    
    public Square (String squareName, String squareColor, int squarePosition, 
            int squarePrice, int squareXCoor, int squareYCoor){
        name = squareName;
        color = squareColor;
        position = squarePosition;
        numberOfHouses = 0;
        hotel = false;
        xCoor = squareXCoor;
        yCoor = squareYCoor;
    }
}
