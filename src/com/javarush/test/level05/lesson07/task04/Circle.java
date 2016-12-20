package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    int centerX=0;
    int centerY=0;
    int rad=1;
    int width=1;
    String color="black";

    public void initialize(int centerX, int centerY, int rad){
        this.centerX=centerX;
        this.centerY=centerY;
        this.rad=rad;
    }
    public void initialize(int centerX, int centerY, int rad, int width){
        this.centerX=centerX;
        this.centerY=centerY;
        this.rad=rad;
        this.width=width;
    }
    public void initialize(int centerX, int centerY, int rad, int width, String color){
        this.centerX=centerX;
        this.centerY=centerY;
        this.rad=rad;
        this.width=width;
        this.color=color;
    }

}
