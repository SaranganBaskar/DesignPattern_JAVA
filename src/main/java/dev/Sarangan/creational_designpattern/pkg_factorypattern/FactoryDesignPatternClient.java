package dev.Sarangan.creational_designpattern.pkg_factorypattern;

import dev.Sarangan.creational_designpattern.pkg_factorypattern.Models.PackageInfo;
import dev.Sarangan.creational_designpattern.pkg_factorypattern.Models.PackageType;

public class FactoryDesignPatternClient {
    public static void main(String[] args) {
        System.out.println("*************** DELIVERY PROCESS STARTS ***************");
        DeliveryModeFactory deliveryModeFactory = new DeliveryModeFactory();

        PackageInfo smallPackageInfo = new PackageInfo(PackageType.SMALL, 10);
        String smallPackageDeliveryStatus = deliveryModeFactory.generateDeliveryMode(smallPackageInfo);
        System.out.println(smallPackageDeliveryStatus);

        PackageInfo MediumPackageInfo = new PackageInfo(PackageType.MEDIUM, 25);
        String MediumPackageDeliveryStatus = deliveryModeFactory.generateDeliveryMode(MediumPackageInfo);
        System.out.println(MediumPackageDeliveryStatus);

        PackageInfo largePackageInfo = new PackageInfo(PackageType.LARGE, 50);
        String largePackageDeliveryStatus = deliveryModeFactory.generateDeliveryMode(largePackageInfo);
        System.out.println(largePackageDeliveryStatus);
    }
}
