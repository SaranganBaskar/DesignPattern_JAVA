package dev.Sarangan.CreationalDesignPattern.PkgSingletonPattern.PkgLazyInitialization;

public class LazySingleton {
    //Static Variable of type this class
    private static LazySingleton theInstance = null;

    //Private constructor to prevent instantiation
    private LazySingleton() {

    }

    //Static method to create instance for this class.
    private static LazySingleton getInstance() {
        if (theInstance == null) {
            theInstance = new LazySingleton();
        }
        return theInstance;
    }

    /* public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
    }*/
}
