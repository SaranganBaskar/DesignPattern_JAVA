package dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.Factories;

import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Buttons.Button;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Buttons.WindowsButton;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Checkboxes.CheckBox;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Checkboxes.WindowsCheckBox;

/*
* This is one of the Concrete Factory.
* It extends base factory (GUI Factory) and responsible for creating products of a single variety
* */
public class WindowsFactory implements GuiFactory {
    @Override
    public Button CreateButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox CreateCheckBox() {
        return new WindowsCheckBox();
    }
}
