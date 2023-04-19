package com.baeldung.camunda.task.compensation;

import com.baeldung.camunda.models.CamundaExample;
import com.baeldung.camunda.repository.CamundaExampleRepository;
import com.baeldung.camunda.task.CalculateInterestService;
import org.camunda.bpm.engine.delegate.BpmnError;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import javax.ws.rs.core.HttpHeaders;
import java.net.HttpURLConnection;
import java.net.URL;

@Component
public class ActivityA implements JavaDelegate {

    private static final Logger LOGGER = LoggerFactory.getLogger(ActivityA.class);

    @Autowired
    private CamundaExampleRepository repository;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        LOGGER.info("Executing activity A ...");

        // TODO : Call API
        try {
            String uri = "https://jsonplaceholder.typicode.com/users/1";
            LOGGER.info(uri);

            URL urlObj = new URL(uri);
            HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setRequestProperty("Content-Type", "application/json");

            LOGGER.info("Execution response : " + connection.getResponseCode());


//            CamundaExample exampleData = new CamundaExample(uri, Boolean.TRUE, "123");
//            repository.save(exampleData);


        } catch (Exception e) {
            LOGGER.error("ERROR" + e.getMessage());
            throw new BpmnError("ERR_001", "Cant interact with rest api" + e.getMessage());
        }
    }
}
