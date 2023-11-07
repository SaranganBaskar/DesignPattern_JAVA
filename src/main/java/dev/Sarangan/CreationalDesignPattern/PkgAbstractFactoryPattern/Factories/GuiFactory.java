package dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.Factories;

/*
* This is Abstract Factory.
* It knows about all Product types (i.e., All Concrete Factory Types)
*/

import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Buttons.Button;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Checkboxes.CheckBox;

public interface GuiFactory {
    Button CreateButton();
    CheckBox CreateCheckBox();

}
