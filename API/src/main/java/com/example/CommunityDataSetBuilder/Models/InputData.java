package com.example.CommunityDataSetBuilder.Models;

import org.springframework.data.annotation.Id;

public class InputData {

    @Id
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
