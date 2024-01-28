package com.keydraftproject.plant.repository;

import com.keydraftproject.plant.model.PlantModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<PlantModel,Long> {
}
