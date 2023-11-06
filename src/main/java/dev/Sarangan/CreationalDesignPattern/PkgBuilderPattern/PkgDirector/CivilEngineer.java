package dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgDirector;

import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgBuilder.HouseBuilder;
import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgProducts.House;

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
