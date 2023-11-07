package dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Checkboxes;

public class MacCheckBox implements CheckBox {
    @Override
    public void paintCheckBox() {
        System.out.println("Yay!! You have created checkboxes in Mac");
    }
}
