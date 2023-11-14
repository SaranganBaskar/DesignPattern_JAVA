package dev.Sarangan.creational_designpattern.pkg_prototypepattern.DeepCopyPrototypePattern.PrototypeInterface;

import dev.Sarangan.creational_designpattern.pkg_prototypepattern.DeepCopyPrototypePattern.Models.Episode;

import java.util.List;

public interface Iseries {
    Iseries deepClone() throws CloneNotSupportedException;

    String getName();

    void setName(String name);

    List<Episode> getEpisodeList();
}
