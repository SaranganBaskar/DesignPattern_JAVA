package dev.Sarangan.creational_designpattern.pkg_factorypattern.Factories;

import dev.Sarangan.creational_designpattern.pkg_factorypattern.Models.PackageInfo;

public interface IPackageDelivery {
    String deliveryWay(PackageInfo packageInfo);
}
