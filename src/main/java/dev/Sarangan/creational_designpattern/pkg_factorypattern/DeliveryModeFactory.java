package dev.Sarangan.creational_designpattern.pkg_factorypattern;

import dev.Sarangan.creational_designpattern.pkg_factorypattern.Factories.DeliveryByBicycle;
import dev.Sarangan.creational_designpattern.pkg_factorypattern.Factories.DeliveryByCar;
import dev.Sarangan.creational_designpattern.pkg_factorypattern.Factories.DeliveryByTruck;
import dev.Sarangan.creational_designpattern.pkg_factorypattern.Models.PackageInfo;

public class DeliveryModeFactory {
    public String generateDeliveryMode(PackageInfo packageInfo){
        switch (packageInfo.getPackageSize()){
            case SMALL -> {
                return new DeliveryByBicycle().deliveryWay(packageInfo);
            }
            case MEDIUM -> {
                return new DeliveryByCar().deliveryWay(packageInfo);
            }
            case LARGE -> {
                return new DeliveryByTruck().deliveryWay(packageInfo);
            }
            default -> {
                return  "FAILED TO DELIVERY";
            }
        }
    }
}
