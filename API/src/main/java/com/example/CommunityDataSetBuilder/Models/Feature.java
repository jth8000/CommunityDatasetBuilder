package com.example.CommunityDataSetBuilder.Models;

import org.springframework.data.annotation.Id;

public class Feature {
    @Id
    public int Id;
    public int datasetId;
    public String name;

    public Feature() {
    }

    public Feature(int id) {
        Id = id;
    }

    public Feature(int id, int datasetId, String name) {
        Id = id;
        this.datasetId = datasetId;
        this.name = name;
    }
}
