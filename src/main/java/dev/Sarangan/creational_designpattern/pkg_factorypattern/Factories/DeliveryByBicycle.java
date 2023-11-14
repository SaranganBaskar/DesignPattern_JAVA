package dev.Sarangan.creational_designpattern.pkg_factorypattern.Factories;

import dev.Sarangan.creational_designpattern.pkg_factorypattern.Models.PackageInfo;

public class DeliveryByBicycle implements IPackageDelivery {
    @Override
    public String deliveryWay(PackageInfo packageInfo) {
        return "Your package will be delivered by: "
                + packageInfo.getPackageMode().toString()
                + " as the packageType is: "
                + packageInfo.getPackageSize()
                + " and weight is: "
                + packageInfo.getPackageWeight();
    }
}
