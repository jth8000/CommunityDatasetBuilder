package com.example.CommunityDataSetBuilder.Controllers;

import com.example.CommunityDataSetBuilder.DAO.LabelRepository;
import com.example.CommunityDataSetBuilder.Models.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

public class LabelController {
    @Autowired
    private LabelRepository labelRepository;

    @PostMapping(path="/create") // Map ONLY POST Requests
    public @ResponseBody
    String AddLabel (@RequestParam String data) {

        Label label = new Label();
        label.data = data;
        labelRepository.save(label);
        return "Created";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Label> GetAllLabels() {
        // This returns a JSON or XML with the users
        return labelRepository.findAll();
    }
}
