package dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern;

import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Buttons.Button;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Checkboxes.CheckBox;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.Factories.GuiFactory;

public class AbstractFactoryApplication {
    Button button;
    CheckBox checkBox;

    public AbstractFactoryApplication(GuiFactory guiFactory) {
        button = guiFactory.CreateButton();
        checkBox = guiFactory.CreateCheckBox();
    }

    public void Paint(){
        button.paintButton();
        checkBox.paintCheckBox();
    }
}
