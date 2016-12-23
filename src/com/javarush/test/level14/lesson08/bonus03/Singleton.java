package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by ddexster on 20.12.16.
 */
public class Singleton
{
    public static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance==null) {
            instance = new Singleton();
        }

        return instance;
    }
}
