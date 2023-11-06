package dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.ConcretePrototypes;

import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.Models.Episode;
import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.PrototypeInterface.Iseries;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class WebSeries implements Iseries {

    private String name;

    private final int seriesNo;

    private List<Episode> episodeList;


    public WebSeries(String name, int seriesNo, List<Episode> episodeList) {
        this.name = name;
        this.seriesNo = seriesNo;
        this.episodeList = episodeList;
    }

    @Override
    public String getName() {
        return this.name;
    }



    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Iseries deepClone() {
//        super.clone();
        final List<Episode> deepCloneEpisodesList = new ArrayList<>();

        for (Episode e : this.episodeList) {
            deepCloneEpisodesList.add(new Episode(e.getName(), e.getEpNo()));
        }

        return new WebSeries("GoT", 1, deepCloneEpisodesList);
    }

    public List<Episode> getEpisodeList() {
        return episodeList;
    }

    public int getSeriesNo() {
        return seriesNo;
    }

    public void setEpisodeList(List<Episode> episodeList) {
        this.episodeList = episodeList;
    }
}
