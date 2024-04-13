package Collections.array;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        // Using arrays and objects together
        Rectangle[] rectangles = new Rectangle[3];

        //Way 1
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(3);
        rectangle.setWidth(2);
        rectangles[0] = rectangle;

        //Way 2
        rectangles[1] = new Rectangle();
        rectangles[1].setWidth(23);
        rectangles[1].setHeight(25);

        //Way3
        rectangles[2] = new Rectangle(12,13);




    }
}
