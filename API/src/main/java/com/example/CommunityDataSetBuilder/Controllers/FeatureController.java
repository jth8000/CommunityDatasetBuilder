package com.example.CommunityDataSetBuilder.Controllers;

import com.example.CommunityDataSetBuilder.DAO.FeatureRepository;
import com.example.CommunityDataSetBuilder.Models.Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class FeatureController {
    @Autowired
    private FeatureRepository featureRepository;

    @PostMapping(path="/create") // Map ONLY POST Requests
    public @ResponseBody
    String addDataset (@RequestParam String name, @RequestParam int datasetId) {

        Feature feature = new Feature();
        feature.name = name;
        feature.datasetId = datasetId;
        featureRepository.save(feature);
        return "Created";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Feature> getAllUsers() {
        // This returns a JSON or XML with the users
        return featureRepository.findAll();
    }
}
