package dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.Factories;

import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Buttons.Button;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Buttons.MacButton;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Checkboxes.CheckBox;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Checkboxes.MacCheckBox;

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
