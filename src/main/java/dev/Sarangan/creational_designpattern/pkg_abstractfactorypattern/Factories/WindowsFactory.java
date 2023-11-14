package dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.Factories;

import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Buttons.Button;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Buttons.WindowsButton;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Checkboxes.CheckBox;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Checkboxes.WindowsCheckBox;

public class WindowsFactory implements GuiFactory{
    @Override
    public Button CreateButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox CreateCheckBox() {
        return new WindowsCheckBox();
    }
}
