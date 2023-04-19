package com.baeldung.camunda.task.compensation;

import com.baeldung.camunda.task.CalculateInterestService;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ErrorActivity implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(ErrorActivity.class);

    @Override
    public void execute(DelegateExecution execution) {
        LOGGER.info("Error Activity...");
        throw new BpmnError("ERR_001","Testando o lançamento de erro");
    }
}
