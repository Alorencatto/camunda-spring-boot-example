package com.baeldung.camunda.task.compensation;

import com.baeldung.camunda.task.CalculateInterestService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RollbackActivityA implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(RollbackActivityA.class);

    @Override
    public void execute(DelegateExecution execution) {
        LOGGER.info("Executing rollback...");
    }
}
