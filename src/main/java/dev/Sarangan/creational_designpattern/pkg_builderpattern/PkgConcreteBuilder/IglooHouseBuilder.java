package dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgConcreteBuilder;

import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgBuilder.HouseBuilder;
import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgProducts.House;

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
