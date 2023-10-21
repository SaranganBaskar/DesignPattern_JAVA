package dev.Sarangan.PkgBuilderPattern.PkgDirector;

import dev.Sarangan.PkgBuilderPattern.PkgBuilder.HouseBuilder;
import dev.Sarangan.PkgBuilderPattern.PkgProducts.House;

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
