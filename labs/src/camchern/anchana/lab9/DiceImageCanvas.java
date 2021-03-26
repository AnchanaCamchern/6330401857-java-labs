/**
 * This is a DiceImageCanvas program that was inherited from JPanel.
 * The program can also display dices representing number 1-6.
 * This program has a title called "DiceGameWindow Version 1"
 * The program will display a red circle that will be placed on a white rectangle.
 * If the dice equal 1, the program will display one red circle at the center on a rectangle.
 * If the dice equal 2, the program will display two red circles located at top on the right and bottom on the left on a rectangle.
 * If the dice equal 3, the program will display three red circles located at the center ,at top on the right and bottom on the left on a rectangle.
 * If the dice equal 4, the program will display four red circles located at the top on the left, at top on the right, at the bottom on the right and bottom on the left on a rectangle.
 * If the dice equal 5, the program will display five red circles located at the top on the left, at top on the right, at the bottom on the right, at bottom on the left and at the center on a rectangle.
 * If the dice equal 4, the program will display four red circles located at the top on the left, at top on the right, at the bottom on the right,at bottom on the left,at the center on top and at the center on bottom on a rectangle.
 * The program also have three button called "High" , "Low" and "Roll" button.
 *
 * Author : Anchana  Canchern
 * Student ID : 633040185-7
 * Section : 2
 * Date : 26th March 2021
 */
package camchern.anchana.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DiceImageCanvas extends JPanel {

    protected int diceNumber;
    protected Graphics2D g2d;
    protected Ellipse2D.Double circleCenter, circleTopRight, circleBottomLeft,
            circleTopLeft, circleBottomRight, circleTopCenter, circleBottomCenter;
    protected Rectangle2D.Double square;
    protected int width = 150, height = 150;
    protected int canvasWidth = 400, canvasHeight = 400;
    protected int circleWidth = 30, circleHeight = 30;
    protected int startSquareX = 125;
    protected int startSquareY = 40;
    protected int margin = 10;

    public DiceImageCanvas(int diceNumber) {
        this.diceNumber = diceNumber;
        this.setSize(new Dimension(canvasWidth,canvasHeight)); // set size
        square = new Rectangle2D.Double(startSquareX,startSquareY,width,height); // initialize a rectangle which is a background
        createCircles(); // call method createCircles to place dots on a rectangle
    }

    protected void createCircles() { // to fill red on all circles that will be placed on a rectangle
        circleCenter = new Ellipse2D.Double(startSquareX + width/2 -circleWidth/2,startSquareY + height/2 - circleHeight/2,circleWidth,circleHeight); // set location and size of circle
        circleTopRight = new Ellipse2D.Double(startSquareX + width - circleWidth -margin,startSquareY+margin,circleWidth,circleHeight);
        circleTopLeft = new Ellipse2D.Double(startSquareX+margin,startSquareY+margin,circleWidth,circleHeight);
        circleBottomLeft = new Ellipse2D.Double(startSquareX+margin,startSquareY+height - circleHeight - margin,circleWidth,circleHeight);
        circleBottomRight = new Ellipse2D.Double(startSquareX + width - circleWidth - margin,  startSquareY+height - circleHeight - margin,circleWidth,circleHeight);
        circleTopCenter = new Ellipse2D.Double(startSquareX + width/2 -circleWidth/2,  startSquareY+margin,circleWidth,circleHeight);
        circleBottomCenter = new Ellipse2D.Double(startSquareX + width/2 -circleWidth/2,  startSquareY+height - circleHeight - margin,circleWidth,circleHeight);
    }

    protected void drawDiceNumber() { // depending on a dice number, place red dots properly on a rectangle
        if (diceNumber == 1 ) { //
            g2d.setColor(Color.RED);
            g2d.fill(circleCenter);
        } else if (diceNumber == 2 ){
            g2d.setColor(Color.RED);
            g2d.fill(circleTopRight);
            g2d.setColor(Color.RED);
            g2d.fill(circleBottomLeft);
        }else if (diceNumber == 3){
            g2d.setColor(Color.RED);
            g2d.fill(circleCenter);
            g2d.setColor(Color.RED);
            g2d.fill(circleTopRight);
            g2d.setColor(Color.RED);
            g2d.fill(circleBottomLeft);
        }else if(diceNumber == 4) {
            g2d.setColor(Color.RED);
            g2d.fill(circleTopRight);
            g2d.setColor(Color.RED);
            g2d.fill(circleBottomLeft);
            g2d.setColor(Color.RED);
            g2d.fill(circleBottomRight);
            g2d.setColor(Color.RED);
            g2d.fill(circleTopLeft);
        }else if(diceNumber == 5) {
            g2d.setColor(Color.RED);
            g2d.fill(circleTopRight);
            g2d.setColor(Color.RED);
            g2d.fill(circleBottomLeft);
            g2d.setColor(Color.RED);
            g2d.fill(circleBottomRight);
            g2d.setColor(Color.RED);
            g2d.fill(circleTopLeft);
            g2d.setColor(Color.RED);
            g2d.fill(circleCenter);
        }else if (diceNumber == 6) {
            g2d.setColor(Color.RED);
            g2d.fill(circleTopRight);
            g2d.setColor(Color.RED);
            g2d.fill(circleBottomLeft);
            g2d.setColor(Color.RED);
            g2d.fill(circleBottomRight);
            g2d.setColor(Color.RED);
            g2d.fill(circleTopLeft);
            g2d.setColor(Color.RED);
            g2d.fill(circleTopCenter);
            g2d.setColor(Color.RED);
            g2d.fill(circleBottomCenter);
        }
    }

    public void paintComponent(Graphics graphics) {
        super.paintComponents(graphics); // call paintComponent of super class
        g2d = (Graphics2D) graphics;  // cast graphics object to graphics2D object
        g2d.setColor(Color.WHITE);
        g2d.fill(square);
        drawDiceNumber();  // call code to draw dice number
    }
}

