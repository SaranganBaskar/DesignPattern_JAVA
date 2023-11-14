package dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgBuilder;

import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgProducts.House;

public interface HouseBuilder {
    public void buildBasement();
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();
    public House getHouse();
}
