package dev.Sarangan.creational_designpattern.pkg_prototypepattern.ShallowCopyPrototypePattern.ConcretePrototypes;

import dev.Sarangan.creational_designpattern.pkg_prototypepattern.ShallowCopyPrototypePattern.PrototypeInterface.Isheep;

public class BlackSheep implements Isheep {

    private String name;

    public BlackSheep(String name) {
        this.name = name;
    }

    @Override
    public Isheep clone() {
        return new BlackSheep(this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
