package dev.Sarangan.PkgSingletonPattern.PkgEagerInitialization;

public class SingletonEagerInitialization {

    private static final SingletonEagerInitialization singletonEagerInitialization = new SingletonEagerInitialization();
    private SingletonEagerInitialization(){

    }

    public static SingletonEagerInitialization getInstance(){
        return singletonEagerInitialization;
    }

}
