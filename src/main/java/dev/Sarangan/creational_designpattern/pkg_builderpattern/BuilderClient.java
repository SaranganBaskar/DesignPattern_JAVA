package dev.Sarangan.creational_designpattern.pkg_builderpattern;

import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgBuilder.HouseBuilder;
import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgConcreteBuilder.IglooHouseBuilder;
import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgDirector.CivilEngineer;
import dev.Sarangan.creational_designpattern.pkg_builderpattern.PkgProducts.House;

public class BuilderClient {
    public static void main(String[] args) {
        HouseBuilder builder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(builder);

        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Your sweet Home is = " + house);
    }
}
