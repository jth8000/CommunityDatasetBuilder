package com.example.CommunityDataSetBuilder.DAO;

import com.example.CommunityDataSetBuilder.Models.Feature;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface FeatureRepository extends CrudRepository<Feature, Integer> {
    Optional<Feature> findByDatasetId(int datasetId);
}
