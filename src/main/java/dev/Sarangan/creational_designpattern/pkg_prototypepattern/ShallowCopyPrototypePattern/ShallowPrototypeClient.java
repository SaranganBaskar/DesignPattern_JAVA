package dev.Sarangan.creational_designpattern.pkg_prototypepattern.ShallowCopyPrototypePattern;

import dev.Sarangan.creational_designpattern.pkg_prototypepattern.ShallowCopyPrototypePattern.PrototypeInterface.Isheep;
import dev.Sarangan.creational_designpattern.pkg_prototypepattern.ShallowCopyPrototypePattern.PrototypeRegistry.PrototypeRegistry;

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
