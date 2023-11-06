package dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgBuilder;

import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgProducts.House;

public interface HouseBuilder {
    public void buildBasement();
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();
    public House getHouse();
}
