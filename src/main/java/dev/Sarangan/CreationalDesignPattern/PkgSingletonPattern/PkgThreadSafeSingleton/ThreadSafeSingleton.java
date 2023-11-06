package dev.Sarangan.CreationalDesignPattern.PkgSingletonPattern.PkgThreadSafeSingleton;

public class ThreadSafeSingleton {

    //Static variable of type this class
    private static ThreadSafeSingleton theInstance = null;

    //Private constructor to prevent instantiation
    private ThreadSafeSingleton() {

    }

    //Static method to create instance for this class.
    synchronized public static ThreadSafeSingleton getInstance() {
        if (theInstance == null) {
            theInstance = new ThreadSafeSingleton();
        }
        return theInstance;
    }
}
