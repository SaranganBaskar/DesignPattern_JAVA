package dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgConcreteBuilder;

import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgBuilder.HouseBuilder;
import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgProducts.House;

public class MadrasRoofHouseBuilder implements HouseBuilder {

    private final House house;

    public MadrasRoofHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Lay foundation for Madras roof basement");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Set structure for Madras roof");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Build Madras Roof ");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Build Interior design as Tamilnadu Karaikudi");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
