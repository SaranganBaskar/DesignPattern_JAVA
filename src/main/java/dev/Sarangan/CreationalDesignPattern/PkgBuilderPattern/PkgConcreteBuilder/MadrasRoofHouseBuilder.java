package dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgConcreteBuilder;

import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgBuilder.HouseBuilder;
import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgProducts.House;

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
