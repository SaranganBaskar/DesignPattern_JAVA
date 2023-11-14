package dev.Sarangan.creational_designpattern.pkg_factorypattern.Models;

public class PackageInfo {

    //region fields
    PackageType packageSize;
    double packageWeight;

    public PackageMode getPackageMode() {
        return packageMode;
    }

    PackageMode packageMode;


    //endregion

    //region Constructors
    public PackageInfo(PackageType packageSize, double packageWeight){
        this.packageSize = packageSize;
        this.packageWeight = packageWeight;

        switch (this.packageSize){
            case LARGE -> packageMode = PackageMode.TRUCK_MODE;
            case MEDIUM -> packageMode = PackageMode.CAR_MODE;
            default -> packageMode = PackageMode.BICYCLE_MODE;
        }
    }
    //endregion

    //region Getters and Setters
    public PackageType getPackageSize() {
        return packageSize;
    }

    public void setPackageSize(PackageType packageSize) {
        this.packageSize = packageSize;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }
    //endregion

}
