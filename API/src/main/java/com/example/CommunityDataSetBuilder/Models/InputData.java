package com.example.CommunityDataSetBuilder.Models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class InputData {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public int featureId;
    public String data;

    public InputData() {
    }

    public InputData(int featureId, String data) {
        this.featureId = featureId;
        this.data = data;
    }

    public InputData(int id, int featureId, String data) {
        this.id = id;
        this.featureId = featureId;
        this.data = data;
    }
}
