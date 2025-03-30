package com.wcl.safelight.controller;

import com.wcl.safelight.dto.EntranceCoordinateDTO;
import com.wcl.safelight.service.BuildingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buildings")
@RequiredArgsConstructor
public class BuildingController {

    private final BuildingService buildingService;

    @GetMapping("/{buildingName}/entrances/coordinates")
    public ResponseEntity<List<EntranceCoordinateDTO>> getEntranceCoordinates(
            @PathVariable String buildingName) {

        List<EntranceCoordinateDTO> coordinates = buildingService.getEntranceCoordinatesByBuildingName(buildingName);
        return ResponseEntity.ok(coordinates);
    }
}
