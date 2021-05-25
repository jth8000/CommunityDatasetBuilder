package com.example.CommunityDataSetBuilder.DAO;

import com.example.CommunityDataSetBuilder.Models.Dataset;
import org.springframework.data.repository.CrudRepository;

/**
 * Interface that queries Dataset
 */
public interface DatasetsRepository extends CrudRepository<Dataset, String> {

}
