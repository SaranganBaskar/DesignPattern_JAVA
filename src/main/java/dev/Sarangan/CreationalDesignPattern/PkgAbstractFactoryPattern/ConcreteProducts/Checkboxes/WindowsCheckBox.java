package dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Checkboxes;

public class WindowsCheckBox implements CheckBox {
    @Override
    public void paintCheckBox() {
        System.out.println("Yay!! You have created checkboxes in Windows");

    }
}
