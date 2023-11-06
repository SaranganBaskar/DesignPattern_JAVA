package dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgConcreteBuilder;

import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgBuilder.HouseBuilder;
import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgProducts.House;

public class IglooHouseBuilder implements HouseBuilder {

    private final House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ice Bars for Igloo basement");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice blocks as Igloo structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Dome for Igloo");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice Carvings for Igloo");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
