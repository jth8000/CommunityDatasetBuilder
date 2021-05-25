package com.example.CommunityDataSetBuilder.Models;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Label {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    public int id;
    public int dataGroupId;
    public String data;
    public int upVotes;

    public Label() {
    }

    public Label(int id) {
        this.id = id;
    }

    public Label(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public Label(int id, String data, int upVotes) {
        this.id = id;
        this.data = data;
        this.upVotes = upVotes;
    }

    public Label(int id, int dataGroupId, String data, int upVotes) {
        this.id = id;
        this.dataGroupId = dataGroupId;
        this.data = data;
        this.upVotes = upVotes;
    }
}
