package dev.Sarangan.CreationalDesignPattern.PkgFactoryPattern;

import dev.Sarangan.CreationalDesignPattern.PkgFactoryPattern.Factories.DeliveryByBicycle;
import dev.Sarangan.CreationalDesignPattern.PkgFactoryPattern.Factories.DeliveryByCar;
import dev.Sarangan.CreationalDesignPattern.PkgFactoryPattern.Factories.DeliveryByTruck;
import dev.Sarangan.CreationalDesignPattern.PkgFactoryPattern.Models.PackageInfo;

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
