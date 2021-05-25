package com.example.CommunityDataSetBuilder.DAO;

import com.example.CommunityDataSetBuilder.Models.Label;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Allows for queries with the Label table
 */
public interface LabelRepository extends CrudRepository<Label, String> {
    Optional<Label> findByDataGroupId(String dataGroupId);
}
