package dev.Sarangan.CreationalDesignPattern.PkgSingletonPattern.PkgLazyInitDoubleCheckLock;

public class LazyDoubleCheckLockClient {
    public static void main(String[] args) throws InterruptedException {
        //Thread.sleep(1000);
        Thread threadA = new Thread(DoubleCheckedSingleton.getInstance(), "Thread A");
        threadA.start();

        Thread threadB = new Thread(DoubleCheckedSingleton.getInstance(), "Thread B");
        threadB.start();

        System.out.println("args = ");

    }
}
