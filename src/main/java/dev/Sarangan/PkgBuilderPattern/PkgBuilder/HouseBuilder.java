package dev.Sarangan.PkgBuilderPattern.PkgBuilder;

import dev.Sarangan.PkgBuilderPattern.PkgProducts.House;

public interface HouseBuilder {
    public void buildBasement();
    public void buildStructure();
    public void buildRoof();
    public void buildInterior();
    public House getHouse();
}
