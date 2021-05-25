package com.example.CommunityDataSetBuilder.Controllers;

import com.example.CommunityDataSetBuilder.DAO.FeatureRepository;
import com.example.CommunityDataSetBuilder.Models.Feature;
import com.example.CommunityDataSetBuilder.Models.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping(path="/feature")
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

    @GetMapping(path="/{id}")
    public @ResponseBody
    Optional<Feature> GetById (@RequestParam int id) {
        return featureRepository.findById(id);
    }

    @PostMapping(path="/update") // Map ONLY POST Requests
    public @ResponseBody String updateFeature (@RequestParam int id, @RequestParam int datasetId, @RequestParam String name) {

        Optional<Feature> feature = featureRepository.findById(id);
        if (feature.isPresent()) {
            Feature s = feature.get();
            s.datasetId = datasetId;
            s.name = name;
            featureRepository.save(s);
            return "Updated";
        }
        return "Not found";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Feature> getAllUsers() {
        // This returns a JSON or XML with the users
        return featureRepository.findAll();
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody String DeleteById(@RequestParam int id) {
        featureRepository.deleteById(id);
        return "Deleted";
    }
}
