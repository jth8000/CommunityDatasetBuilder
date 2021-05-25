package com.example.CommunityDataSetBuilder.Controllers;

import com.example.CommunityDataSetBuilder.DAO.InputDataRepository;
import com.example.CommunityDataSetBuilder.Models.InputData;
import com.example.CommunityDataSetBuilder.Models.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping(path="/input-data")
public class InputDataController {
    @Autowired
    private InputDataRepository inputDataRepository;

    @PostMapping(path="/create") // Map ONLY POST Requests
    public @ResponseBody
    String AddInputData (@RequestParam int featureId, @RequestParam String data) {

        InputData inputData = new InputData();
        inputData.featureId = featureId;
        inputData.data = data;
        inputDataRepository.save(inputData);
        return "Created";
    }

    @GetMapping(path="/{id}")
    public @ResponseBody
    Optional<InputData> GetById (@RequestParam int id) {
        return inputDataRepository.findById(id);
    }

    @PostMapping(path="/update") // Map ONLY POST Requests
    public @ResponseBody String UpdateInputData (@RequestParam int id, @RequestParam int featureId, @RequestParam String data) {

        Optional<InputData> inputData = inputDataRepository.findById(id);
        if (inputData.isPresent()) {
            InputData s = inputData.get();
            s.featureId = featureId;
            s.data = data;
            inputDataRepository.save(s);
            return "Updated";
        }
        return "Not found";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<InputData> GetAllInputData() {
        // This returns a JSON or XML with the users
        return inputDataRepository.findAll();
    }

    @GetMapping(path="/by-feature/{id}")
    public @ResponseBody
    Optional<InputData> GetByFeatureId (@RequestParam int id) {
        return inputDataRepository.findByFeatureId(id);
    }

    @GetMapping(path="/by-group/{id}")
    public @ResponseBody
    Optional<InputData> GetByDataGroupId (@RequestParam int id) {
        return inputDataRepository.findByDataGroupId(id);
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody String DeleteById(@RequestParam int id) {
        inputDataRepository.deleteById(id);
        return "Deleted";
    }
}
