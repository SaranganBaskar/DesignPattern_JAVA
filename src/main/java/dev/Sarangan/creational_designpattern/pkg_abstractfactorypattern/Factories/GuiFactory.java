package dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.Factories;

/*
* This is Abstract Factory.
* It knows about all Product types (i.e., All Concrete Factory Types)
*/

import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Buttons.Button;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.ConcreteProducts.Checkboxes.CheckBox;

public interface GuiFactory {
    Button CreateButton();
    CheckBox CreateCheckBox();

}
