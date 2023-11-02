package dev.Sarangan.PkgSingletonPattern.PkgLazyInitDoubleCheckLock;

import dev.Sarangan.PkgSingletonPattern.PkgThreadSafeSingleton.ThreadSafeSingleton;

public class DoubleCheckedSingleton {
    //Static variable of type this class
    private static DoubleCheckedSingleton theInstance = null;

    //Private constructor to prevent instantiation
    private DoubleCheckedSingleton() {

    }

    //Static method to create instance for this class.
    public static DoubleCheckedSingleton getInstance(){
        if(theInstance == null){
            //Only one thread will be able to access this block.
            synchronized (DoubleCheckedSingleton.class){
                if(theInstance == null){
                    //Once the object is created by one thread, for other threads, This if condition is FALSE.
                    theInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return theInstance;
    }
}
