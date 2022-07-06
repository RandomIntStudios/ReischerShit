package com.ristudios.objectoriented;

import java.util.Optional;

public class Rectangle {

    private final double width, height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(double length){
        this.width = length;
        this.height = length;
    }

    public Rectangle copy(){
        return new Rectangle(this.width, this.height);
    }

    public Rectangle reverse() {
        return new Rectangle(this.height, this.width);
    }

    public double area(){
        return height*width;
    }

    public double diagonal(){
        return Math.sqrt((width*width) + (height*height));
    }
}
