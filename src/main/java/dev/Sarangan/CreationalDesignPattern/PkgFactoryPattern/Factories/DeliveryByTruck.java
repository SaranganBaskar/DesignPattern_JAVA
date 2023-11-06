package dev.Sarangan.CreationalDesignPattern.PkgFactoryPattern.Factories;

import dev.Sarangan.CreationalDesignPattern.PkgFactoryPattern.Models.PackageInfo;

public class DeliveryByTruck implements IPackageDelivery {
    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "Your package will be delivered by: "
                + packageInfo.getPackageMode().toString()
                + " as the packageType is: "
                + packageInfo.getPackageSize()
                + " and weight is : "
                + packageInfo.getPackageWeight();
    }
}
