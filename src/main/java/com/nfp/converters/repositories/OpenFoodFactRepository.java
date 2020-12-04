package com.nfp.converters.repositories;

import com.nfp.converters.model.OpenFoodFact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OpenFoodFactRepository extends CrudRepository<OpenFoodFact, Long> {

}
