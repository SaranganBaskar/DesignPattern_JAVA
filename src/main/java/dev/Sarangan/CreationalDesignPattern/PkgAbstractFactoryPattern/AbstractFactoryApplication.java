package dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern;

import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Buttons.Button;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.ConcreteProducts.Checkboxes.CheckBox;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.Factories.GuiFactory;

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
