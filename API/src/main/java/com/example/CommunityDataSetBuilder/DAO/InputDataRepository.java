package com.example.CommunityDataSetBuilder.DAO;

import com.example.CommunityDataSetBuilder.Models.InputData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Interface that queries InputData
 */
@Repository
public interface InputDataRepository extends CrudRepository<InputData, String> {

    Optional<InputData> findByDataGroupId(String dataGroupId);

    Optional<InputData> findByFeatureId(String featureId);
}
