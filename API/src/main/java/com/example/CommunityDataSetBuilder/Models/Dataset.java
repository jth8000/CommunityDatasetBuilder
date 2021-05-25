package com.example.CommunityDataSetBuilder.Models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Dataset {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
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
