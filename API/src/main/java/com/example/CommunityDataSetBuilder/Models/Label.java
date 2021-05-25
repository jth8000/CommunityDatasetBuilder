package com.example.CommunityDataSetBuilder.Models;

import org.springframework.data.annotation.Id;

public class Label {

    @Id
    public int id;
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
}
