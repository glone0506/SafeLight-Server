package com.wcl.safelight.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class EntranceCoordinateDTO {
    private String entranceName;
    private double latitude;
    private double longitude;
}