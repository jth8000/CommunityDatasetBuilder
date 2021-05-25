package com.example.CommunityDataSetBuilder.DAO;

import com.example.CommunityDataSetBuilder.Models.Feature;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Interface that queries Features
 */
public interface FeatureRepository extends CrudRepository<Feature, String> {
    Optional<Feature> findByDatasetId(String datasetId);
}
