package dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.PrototypeRegistry;

import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.ConcretePrototypes.TvSeries;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.ConcretePrototypes.WebSeries;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.Models.Episode;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.PrototypeInterface.Iseries;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.SeriesType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeepCopyPrototypeRegistry {
    private Map<SeriesType, Iseries> seriesRegistry = new HashMap<>();

    public DeepCopyPrototypeRegistry() {
        this.Initializer();
    }

    public Iseries getSeries(SeriesType seriesType) {
        Iseries iseries = null;
        try {
            iseries = seriesRegistry.get(seriesType).deepClone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iseries;
    }

    private void Initializer() {
        Episode episodeOne = new Episode("Hello Friend", 13);

        // Creating base Prototypes
        Iseries webSeriesPrototype = new WebSeries("Baa Baa web series", 10, List.of(episodeOne));
        Iseries tvSeriesPrototype = new TvSeries("Fleecy TV series", 1, List.of(episodeOne));

//        webSeriesPrototype.

        seriesRegistry.put(SeriesType.TV_SERIES, tvSeriesPrototype);
        seriesRegistry.put(SeriesType.WEB_SERIES, webSeriesPrototype);

        System.out.println("Web series prototype is = " + webSeriesPrototype.getName());
        System.out.println("Web Series Episode name in the Prototype is = " + webSeriesPrototype.getEpisodeList().get(0).getName() + "\n");

        System.out.println("TV series prototype is = " + tvSeriesPrototype.getName());
        System.out.println("TV Series Episode name in the Prototype is = " + tvSeriesPrototype.getEpisodeList().get(0).getName() + "\n");

    }
}
