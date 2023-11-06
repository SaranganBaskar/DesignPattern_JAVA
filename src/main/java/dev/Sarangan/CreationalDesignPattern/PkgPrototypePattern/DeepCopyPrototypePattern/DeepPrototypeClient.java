package dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern;

import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.ConcretePrototypes.TvSeries;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.PrototypeInterface.Iseries;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.PrototypeRegistry.DeepCopyPrototypeRegistry;

public class DeepPrototypeClient {
    public static void main(String[] args) {

        DeepCopyPrototypeRegistry prototypeRegistry = new DeepCopyPrototypeRegistry();

        Iseries tvSeriesClone = prototypeRegistry.getSeries(SeriesType.TV_SERIES);
        Iseries webSeriesClone = prototypeRegistry.getSeries(SeriesType.WEB_SERIES);

        tvSeriesClone.setName("Hijack series");
        tvSeriesClone.getEpisodeList().get(0).setName("Hello Friend TV Series GOT!!");

        webSeriesClone.setName("Game of Thrones");
        webSeriesClone.getEpisodeList().get(0).setName("Hello Friend web Series Neeya naana!!");

        System.out.println("TV Series name after 1st Clone is = " + tvSeriesClone.getName());
        System.out.println("TV Series Episode name after 1st Clone is = " + tvSeriesClone.getEpisodeList().get(0).getName() + "\n");

        System.out.println("Web series name after 1st Clone is = " + webSeriesClone.getName());
        System.out.println("Web Series Episode name after 1st Clone is = " + webSeriesClone.getEpisodeList().get(0).getName());

    }
}
