/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Game_Breakout;

import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author LENOVO
 */

abstract class Sprite {

    int x;
    int y;
    int imageWidth;
    int imageHeight;
    Image image;
    
    protected void setX(int x) {

        this.x = x;
    }

    int getX() {

        return x;
    }

    protected void setY(int y) {

        this.y = y;
    }

    int getY() {

        return y;
    }

    int getImageWidth() {

        return imageWidth;
    }

    int getImageHeight() {

        return imageHeight;
    }

    Image getImage() {

        return image;
    }

    Rectangle getRect() {

        return new Rectangle(x, y,
                image.getWidth(null), image.getHeight(null));
    }

    void getImageDimensions() {

        imageWidth = image.getWidth(null);
        imageHeight = image.getHeight(null);
    }
}