package dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Buttons;

public class WindowsButton implements Button {
    @Override
    public void paintButton() {
        System.out.println("Yay!! You have created buttons in Windows");
    }
}
