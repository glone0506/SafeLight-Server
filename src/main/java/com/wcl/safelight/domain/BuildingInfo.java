package com.wcl.safelight.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter @Setter
public class BuildingInfo {

    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy = "buildingInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EntranceInfo> entrances = new ArrayList<>();

    public void addEntrance(EntranceInfo entranceInfo) {
        entrances.add(entranceInfo);
        entranceInfo.setBuildingInfo(this);
    }

    public void removeEntrance(EntranceInfo entranceInfo) {
        entrances.remove(entranceInfo);
        entranceInfo.setBuildingInfo(null);
    }
}

