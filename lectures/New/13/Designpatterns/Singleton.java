package com.company;

//Creational
class singletonobject {
    //private static object from class.
    private static singletonobject instance = new singletonobject();

    private singletonobject() {
        //Private constructor where users cannot create object from the Class
    }

    public static singletonobject getInstance() {
        return instance;
    }

    public void showText() {
        System.out.println("Hello Singleton");
    }
}

public class Singleton {
    public static void main(String[] args) {
        //singletonobject obj=new singletonobject();
        singletonobject obj = singletonobject.getInstance();
        obj.showText();
        singletonobject obj2 = singletonobject.getInstance();
        obj2.showText();

    }
}
