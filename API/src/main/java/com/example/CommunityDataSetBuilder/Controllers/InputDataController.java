package com.example.CommunityDataSetBuilder.Controllers;

import com.example.CommunityDataSetBuilder.DAO.InputDataRepository;
import com.example.CommunityDataSetBuilder.Models.InputData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @GetMapping(path="/all")
    public @ResponseBody Iterable<InputData> GetAllInputData() {
        // This returns a JSON or XML with the users
        return inputDataRepository.findAll();
    }
}
