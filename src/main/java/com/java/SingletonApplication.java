package com.java;

import com.java.singleton.DoubleCheckLocking;
import com.java.singleton.MySingleton;

public class SingletonApplication {

    public static void main(String[] args) {

        System.out.println("ENUM CHECK:");
        System.out.println(MySingleton.INSTANCE.getMyInstance());
        System.out.println(MySingleton.INSTANCE);
        System.out.println(MySingleton.INSTANCE.name());

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("EAGER_LOADED: "+DoubleCheckLocking.getEagerLoadedInstance());
        System.out.println("LAZY_LOADED: "+DoubleCheckLocking.getInstance());
    }
}
