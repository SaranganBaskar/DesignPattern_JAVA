package dev.Sarangan.PkgBuilderPattern;

import dev.Sarangan.PkgBuilderPattern.PkgBuilder.HouseBuilder;
import dev.Sarangan.PkgBuilderPattern.PkgConcreteBuilder.IglooHouseBuilder;
import dev.Sarangan.PkgBuilderPattern.PkgDirector.CivilEngineer;
import dev.Sarangan.PkgBuilderPattern.PkgProducts.House;

import java.util.Arrays;

public class BuilderClient {
    public static void main(String[] args) {
        HouseBuilder builder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(builder);

        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Your sweet Home is = " + house);
    }
}
