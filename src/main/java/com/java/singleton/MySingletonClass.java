package com.java.singleton;

public final class MySingletonClass {

    private MySingletonClass(){

    }

    private static MySingletonClass mySingletonClassObject = new MySingletonClass();//should i make it final

    static MySingletonClass getInstance(){
        return mySingletonClassObject;
    }

}
