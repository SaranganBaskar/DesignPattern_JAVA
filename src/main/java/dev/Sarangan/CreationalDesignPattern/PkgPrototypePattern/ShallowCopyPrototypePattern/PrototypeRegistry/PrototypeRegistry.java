package dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.ShallowCopyPrototypePattern.PrototypeRegistry;

import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.ShallowCopyPrototypePattern.ConcretePrototypes.BlackSheep;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.ShallowCopyPrototypePattern.ConcretePrototypes.WhiteSheep;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.ShallowCopyPrototypePattern.PrototypeInterface.Isheep;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.ShallowCopyPrototypePattern.SheepType;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PrototypeRegistry {
    private Map<SheepType, Isheep> sheepRegistry = new HashMap<>();

    public PrototypeRegistry() {
        this.Initializer();
    }

    public Isheep getSheeps(SheepType sheepType) {
        Isheep isheep = null;
        try {
            isheep = (Isheep) sheepRegistry.get(sheepType).clone();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return isheep;
    }

    private void Initializer() {
        // Creating base Prototypes
        Isheep whiteSheepPrototype = new WhiteSheep("Baa Baa");
        Isheep blackSheepPrototype = new BlackSheep("Fleecy");
        sheepRegistry.put(SheepType.BLACKSHEEP, blackSheepPrototype);
        sheepRegistry.put(SheepType.WHITESHEEP, whiteSheepPrototype);

        System.out.println("White Sheep prototype is = " + whiteSheepPrototype.getName());
        System.out.println("Black Sheep prototype 1 is = " + blackSheepPrototype.getName() + "\n");
    }
}
