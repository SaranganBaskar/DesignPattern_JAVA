package dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern;

import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgBuilder.HouseBuilder;
import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgConcreteBuilder.IglooHouseBuilder;
import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgDirector.CivilEngineer;
import dev.Sarangan.CreationalDesignPattern.PkgBuilderPattern.PkgProducts.House;

public class BuilderClient {
    public static void main(String[] args) {
        HouseBuilder builder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(builder);

        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Your sweet Home is = " + house);
    }
}
