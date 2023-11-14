package dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern;

import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.Factories.GuiFactory;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.Factories.MacFactory;
import dev.Sarangan.creational_designpattern.pkg_abstractfactorypattern.Factories.WindowsFactory;

public class AbstractFactoryClient {

    private static AbstractFactoryApplication ConfigureAbstractFactoryApp() {
        AbstractFactoryApplication abstractFactoryApplication;
        GuiFactory guiFactory;
        String osType = System.getProperty("os.name").toLowerCase();
        switch (osType) {
            case "mac" -> {
                guiFactory = new MacFactory();
            }
            default -> {
                guiFactory = new WindowsFactory();
            }
        }
        abstractFactoryApplication = new AbstractFactoryApplication(guiFactory);
        return abstractFactoryApplication;
    }

    public static void main(String[] args) {
        AbstractFactoryApplication app = ConfigureAbstractFactoryApp();
        app.Paint();
    }
}
