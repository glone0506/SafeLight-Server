package com.wcl.safelight.service;

import com.wcl.safelight.domain.BuildingInfo;
import com.wcl.safelight.domain.EntranceInfo;
import com.wcl.safelight.dto.EntranceCoordinateDTO;
import com.wcl.safelight.repository.BuildingInfoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BuildingService {

    private final BuildingInfoRepository buildingInfoRepository;

    @Transactional(readOnly = true)
    public List<EntranceCoordinateDTO> getEntranceCoordinatesByBuildingName(String buildingName) {
        BuildingInfo building = buildingInfoRepository.findByName(buildingName)
                .orElseThrow(() -> new IllegalArgumentException("건물을 찾을 수 없습니다: " + buildingName));

        return building.getEntrances().stream()
                .map(entrance -> new EntranceCoordinateDTO(
                        entrance.getEntranceName(),
                        entrance.getLatitude(),
                        entrance.getLongitude()))
                .toList();
    }

    private EntranceCoordinateDTO convertToCoordinateDTO(EntranceInfo entranceInfo) {
        return new EntranceCoordinateDTO(
                entranceInfo.getEntranceName(),
                entranceInfo.getLatitude(),
                entranceInfo.getLongitude()
        );
    }
}
