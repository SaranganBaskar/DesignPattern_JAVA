package dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Checkboxes;

public class MacCheckBox implements CheckBox {
    @Override
    public void paintCheckBox() {
        System.out.println("Yay!! You have created checkboxes in Mac");
    }
}
