package com.example.CommunityDataSetBuilder.Models;

import org.springframework.data.annotation.Id;

public class Dataset {
    @Id
    public int id;
    public String name;

    public Dataset() {
    }

    public Dataset(int id) {
        this.id = id;
    }

    public Dataset(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
