package dev.Sarangan.creational_designpattern.pkg_singletonpattern.PkgLazyInitDoubleCheckLock;

public class DoubleCheckedSingleton implements Runnable {
    //Static variable of type this class
    private static DoubleCheckedSingleton theInstance = null;

    //Private constructor to prevent instantiation
    private DoubleCheckedSingleton() {

    }

    //Static method to create instance for this class.
    public static DoubleCheckedSingleton getInstance() throws InterruptedException {
        if(theInstance == null){
            //Only one thread will be able to access this block.

            System.out.println(Thread.currentThread().getName()
                    + ", executing getInstance() method!");
            if(theInstance == null){
                //Once the object is created by one thread, for other threads, This if condition is FALSE.
                theInstance = new DoubleCheckedSingleton();
            }

            /*synchronized (DoubleCheckedSingleton.class){
                //Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName()
                        + ", executing getInstance() method!");
                if(theInstance == null){
                    //Once the object is created by one thread, for other threads, This if condition is FALSE.
                    theInstance = new DoubleCheckedSingleton();
                }
            }*/
        }
        return theInstance;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()
                + ", executing run() method!");
    }
}
