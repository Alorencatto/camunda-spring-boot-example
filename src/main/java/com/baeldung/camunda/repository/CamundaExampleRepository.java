package com.baeldung.camunda.repository;

import com.baeldung.camunda.models.CamundaExample;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CamundaExampleRepository extends MongoRepository<CamundaExample,String> {
}
