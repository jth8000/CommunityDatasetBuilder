package com.example.CommunityDataSetBuilder.DAO;

import com.example.CommunityDataSetBuilder.Models.InputData;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface InputDataRepository extends CrudRepository<InputData, Integer> {

    Optional<InputData> findByDataGroupId(int dataGroupId);

    Optional<InputData> findByFeatureId(int featureId);
}
