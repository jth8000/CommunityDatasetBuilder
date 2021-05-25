package com.example.CommunityDataSetBuilder.Models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Feature {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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
