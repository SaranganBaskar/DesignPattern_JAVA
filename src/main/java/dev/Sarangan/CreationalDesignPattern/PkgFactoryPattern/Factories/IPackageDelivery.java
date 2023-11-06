package dev.Sarangan.CreationalDesignPattern.PkgFactoryPattern.Factories;

import dev.Sarangan.CreationalDesignPattern.PkgFactoryPattern.Models.PackageInfo;
import dev.Sarangan.CreationalDesignPattern.PkgFactoryPattern.Models.PackageMode;

public interface IPackageDelivery {
    String deliveryWay(PackageInfo packageInfo);
}
