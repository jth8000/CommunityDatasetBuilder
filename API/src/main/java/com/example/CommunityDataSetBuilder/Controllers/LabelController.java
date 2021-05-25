package com.example.CommunityDataSetBuilder.Controllers;

import com.example.CommunityDataSetBuilder.DAO.LabelRepository;
import com.example.CommunityDataSetBuilder.Models.Dataset;
import com.example.CommunityDataSetBuilder.Models.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping(path="/label")
public class LabelController {
    @Autowired
    private LabelRepository labelRepository;

    @PostMapping(path="/create") // Map ONLY POST Requests
    public @ResponseBody String AddLabel (@RequestParam String data) {

        Label label = new Label();
        label.labelData = data;
        labelRepository.save(label);
        return "Created";
    }

    @GetMapping(path="/{id}")
    public @ResponseBody
    Optional<Label> GetById (@RequestParam String id) {
        return labelRepository.findById(id);
    }

    @PostMapping(path="/update") // Map ONLY POST Requests
    public @ResponseBody String UpdateLabel (@RequestParam String id, @RequestParam String data) {

        Optional<Label> label = labelRepository.findById(id);
        if (label.isPresent()) {
            Label s = label.get();
            s.labelData = data;
            labelRepository.save(s);
            return "Updated";
        }
        return "Not found";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Label> GetAllLabels() {
        // This returns a JSON or XML with the users
        return labelRepository.findAll();
    }

    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody String DeleteById(@RequestParam String id) {
        labelRepository.deleteById(id);
        return "Deleted";
    }

    @GetMapping(path="/by-group/{id}")
    public @ResponseBody
    Optional<Label> GetByDataGroupId (@RequestParam String id) {

        return labelRepository.findByDataGroupId(id);
    }

    @PostMapping(path="/add-up-vote")
    public @ResponseBody int AddUpVote(@RequestParam String labelId) {
        Optional<Label> l = labelRepository.findById(labelId);
        l.ifPresent(label -> {
            label.upVotes++;
            labelRepository.save(label);
        });
        return l.map(label -> label.upVotes).orElse(0);
    }

    @PostMapping(path="/remove-up-vote")
    public @ResponseBody int RemoveUpVote(@RequestParam String labelId) {
        Optional<Label> l = labelRepository.findById(labelId);
        l.ifPresent(label -> {
            label.upVotes--;
            labelRepository.save(label);
        });
        return l.map(label -> label.upVotes).orElse(0);
    }
}
