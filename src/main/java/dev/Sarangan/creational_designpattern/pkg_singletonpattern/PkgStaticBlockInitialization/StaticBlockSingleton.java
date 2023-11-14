package dev.Sarangan.creational_designpattern.pkg_singletonpattern.PkgStaticBlockInitialization;

public class StaticBlockSingleton {
    private static StaticBlockSingleton theInstance = null;

    //Static Block
    static {
        try {
            theInstance = new StaticBlockSingleton();
        } catch (Exception exception) {
            System.out.println("Exception occurred while creating the instance " + exception);
        }
    }

    //Private Constructor
    private StaticBlockSingleton(){

    }

    //Public static method to get this instance as a singleton
    public static StaticBlockSingleton getInstance(){
        return theInstance;
    }

    /*public static void main(String[] args) {
        StaticBlockSingleton staticBlockSingleton = StaticBlockSingleton.getInstance();
    }*/

}
