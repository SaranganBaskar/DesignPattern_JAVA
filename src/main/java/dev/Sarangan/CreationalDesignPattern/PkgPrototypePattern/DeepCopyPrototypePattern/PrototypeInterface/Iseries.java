package dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.PrototypeInterface;

import dev.Sarangan.CreationalDesignPattern.PkgPrototypePattern.DeepCopyPrototypePattern.Models.Episode;

import java.security.spec.ECPoint;
import java.util.List;

public interface Iseries {
    Iseries deepClone() throws CloneNotSupportedException;

    String getName();

    void setName(String name);

    List<Episode> getEpisodeList();
}
