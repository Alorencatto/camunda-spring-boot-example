package com.baeldung.camunda.models;


import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document("camundaexample")
public class CamundaExample {

    public String variableName;

    public Boolean isNumber;

    public String processIstance;

    public LocalDateTime updatedAt = LocalDateTime.now();

    public CamundaExample(String variableName, Boolean isNumber, String processIstance) {
        this.variableName = variableName;
        this.isNumber = isNumber;
        this.processIstance = processIstance;
    }
}
