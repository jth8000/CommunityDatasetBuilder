package com.example.CommunityDataSetBuilder.Models;

import javax.persistence.Id;
import javax.persistence.Entity;

/**
 * Representation of Label. "Label" is what the classification/prediction of the model should be.
 * Also belongs to a data group.
 */
@Entity
public class Label {

    @Id
    public int id;
    public String dataGroupId;
    public String labelData;
    public int upVotes;

    public Label() {
    }

    public Label(int id) {
        this.id = id;
    }

    public Label(String labelData) {
        this.labelData = labelData;
    }

    public Label(int id, String labelData) {
        this.id = id;
        this.labelData = labelData;
    }


    public Label(String labelData, int upVotes) {
        this.labelData = labelData;
        this.upVotes = upVotes;
    }



    public Label(int id, String labelData, int upVotes) {
        this.id = id;
        this.labelData = labelData;
        this.upVotes = upVotes;
    }

    public Label(int id, String dataGroupId, String labelData, int upVotes) {
        this.id = id;
        this.dataGroupId = dataGroupId;
        this.labelData = labelData;
        this.upVotes = upVotes;
    }
}
