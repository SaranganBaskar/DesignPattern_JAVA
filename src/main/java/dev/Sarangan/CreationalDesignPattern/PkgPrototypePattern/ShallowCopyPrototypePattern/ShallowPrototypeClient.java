package dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.ShallowCopyPrototypePattern;

import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.ShallowCopyPrototypePattern.ConcretePrototypes.WhiteSheep;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.ShallowCopyPrototypePattern.PrototypeInterface.Isheep;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.ShallowCopyPrototypePattern.PrototypeRegistry.PrototypeRegistry;

public class ShallowPrototypeClient {
    public static void main(String[] args) {

        PrototypeRegistry prototypeRegistry = new PrototypeRegistry();
        Isheep ClonedWhiteSheepPrototype = prototypeRegistry.getSheeps(SheepType.WHITESHEEP);
        Isheep ClonedBlackSheepPrototype = prototypeRegistry.getSheeps(SheepType.BLACKSHEEP);


        ClonedWhiteSheepPrototype.setName("Baa Baa WS C1");
        ClonedBlackSheepPrototype.setName("Fleecy BS C1");

        System.out.println("White Sheep from Clone 1 is = " + ClonedWhiteSheepPrototype.getName());
        System.out.println("Black Sheep from Clone 1 is = " + ClonedBlackSheepPrototype.getName());

    }
}
