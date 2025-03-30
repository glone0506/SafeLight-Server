package com.wcl.safelight.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@RequiredArgsConstructor
@Getter @Setter
public class EntranceInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String entranceName;

    private double latitude;
    private double longitude;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "building_info_id")
    private BuildingInfo buildingInfo;
}
