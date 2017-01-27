package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by ddexster on 22.12.16.
 */
public class Plane implements Flyable
{
    private int passengers;

    public Plane(int passengers)
    {
        this.passengers = passengers;
    }

    @Override
    public void fly()
    {

    }
}
