package dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Buttons;

public class MacButton implements Button {
    @Override
    public void paintButton() {
        System.out.println("Yay!! You have created buttons in Mac");
    }
}
