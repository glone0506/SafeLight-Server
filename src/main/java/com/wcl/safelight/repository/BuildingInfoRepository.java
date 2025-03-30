package com.wcl.safelight.repository;

import com.wcl.safelight.domain.BuildingInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BuildingInfoRepository extends JpaRepository<BuildingInfo, Long> {
    Optional<BuildingInfo> findByName(String name);
}
