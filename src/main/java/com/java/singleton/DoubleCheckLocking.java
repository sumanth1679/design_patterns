package com.java.singleton;

public class DoubleCheckLocking {

    private static volatile DoubleCheckLocking doubleCheckLocking;

    private DoubleCheckLocking(){

    }

    //eager loading
    private static final DoubleCheckLocking eagerDoubleCheckLocking = new DoubleCheckLocking();
    public static DoubleCheckLocking getEagerLoadedInstance(){
        return eagerDoubleCheckLocking;
    }

    //lazy loading
    public static DoubleCheckLocking getInstance(){
        if (doubleCheckLocking == null) {
            synchronized (DoubleCheckLocking.class){//when i put "this" & static(@ method), it's showing error
                if (doubleCheckLocking == null) {
                    doubleCheckLocking = new DoubleCheckLocking();
                }
            }
        }
        return doubleCheckLocking;
    }
}
