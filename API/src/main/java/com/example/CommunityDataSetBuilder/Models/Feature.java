package com.example.CommunityDataSetBuilder.Models;

import javax.persistence.Id;
import javax.persistence.Entity;

/**
 * Represents a feature, "Feature" is a class of data, e.g. air pressure, humidity for a predictive weather model
 */
@Entity
public class Feature {
    @Id
    public String featureId;
    public String datasetId;
    public String featureName;

    public Feature() {
    }

    public Feature(String id) {

        this.featureId = id;
    }

    /**
     * Constructor for adding to the DB
     * @param datasetId the foreign key for dataset
     * @param featureName the name for the feature
     */
    public Feature(String datasetId, String featureName) {
        this.datasetId = datasetId;
        this.featureName = featureName;
    }

    /**
     * Constructor for reading from the DB
     * @param id primary key
     * @param datasetId the foreign key for dataset
     * @param featureName the name for the feature
     */
    public Feature(String id, String datasetId, String featureName) {
        this.featureId = id;
        this.datasetId = datasetId;
        this.featureName = featureName;
    }
}
