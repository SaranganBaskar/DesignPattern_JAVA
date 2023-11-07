package dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.Factories;

import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Buttons.Button;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Buttons.MacButton;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Checkboxes.CheckBox;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Checkboxes.MacCheckBox;

/*
 * This is one of the Concrete Factory.
 * It extends base factory (GUI Factory) and responsible for creating products of a single variety
 * */
public class MacFactory implements GuiFactory {
    @Override
    public Button CreateButton() {
        return new MacButton();
    }

    @Override
    public CheckBox CreateCheckBox() {
        return new MacCheckBox();
    }
}
