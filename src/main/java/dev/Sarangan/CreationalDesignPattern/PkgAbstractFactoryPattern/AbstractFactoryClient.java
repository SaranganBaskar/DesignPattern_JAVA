package dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern;

import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.Factories.GuiFactory;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.Factories.MacFactory;
import dev.Sarangan.CreationalDesignPattern.PkgAbstractFactoryPattern.Factories.WindowsFactory;

import java.sql.SQLOutput;
import java.util.Arrays;

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
