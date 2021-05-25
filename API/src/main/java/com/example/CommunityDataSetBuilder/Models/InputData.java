package com.example.CommunityDataSetBuilder.Models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Representation of InputData. "Input Data" is a datapoint.
 * It can belong to a group of data points.
 * For example, with weather prediction a row representing a datapoint
 * corresponding to humidity on a Tuesday would have FeatureId belonging
 * to the humidity feature class(FeatureId), the humidity number(Data),
 * and the DataGroupId corresponding to Tuesday.
 */
@Entity
public class InputData {

    @Id
    public int id;
    public String featureId;
    public String dataGroupId;
    public String dataValue;

    public InputData() {
    }

    public InputData(String featureId, String dataValue) {
        this.featureId = featureId;
        this.dataValue = dataValue;
    }

    public InputData(int id, String featureId, String dataValue) {
        this.id = id;
        this.featureId = featureId;
        this.dataValue = dataValue;
    }

    public InputData(int id, String featureId, String dataGroupId, String dataValue) {
        this.id = id;
        this.featureId = featureId;
        this.dataGroupId = dataGroupId;
        this.dataValue = dataValue;
    }
}
