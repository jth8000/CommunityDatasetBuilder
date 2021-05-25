package com.example.CommunityDataSetBuilder.Models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Representation of Dataset, which is the main grouping of data to be labeled
 */
@Entity
public class Dataset {
    @Id
    public String datasetId;

    public String datasetName;

    /**
     * Basic constructor
     */
    public Dataset() {
    }

    /**
     * Constructor to create new entry in DB
     * @param datasetName the name for the dataset
     */
    public Dataset(String datasetName) {
        this.datasetName = datasetName;
    }


    /**
     * The constructor for reading dataset data from the DB
     * @param DatasetId the primary key
     * @param DatasetName the name of the dataset
     */
    public Dataset(String DatasetId, String DatasetName) {
        this.datasetId = DatasetId;
        this.datasetName = DatasetName;
    }
}
