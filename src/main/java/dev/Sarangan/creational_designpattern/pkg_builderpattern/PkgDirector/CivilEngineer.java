package dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgDirector;

import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgBuilder.HouseBuilder;
import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgProducts.House;

public class CivilEngineer {
    private final HouseBuilder houseBuilder;

     public CivilEngineer(HouseBuilder houseBuilder){
         this.houseBuilder = houseBuilder;
     }

     public House getHouse(){
         return this.houseBuilder.getHouse();
     }

     public void constructHouse(){
         houseBuilder.buildBasement();
         houseBuilder.buildStructure();
         houseBuilder.buildRoof();
         houseBuilder.buildInterior();
     }
}
