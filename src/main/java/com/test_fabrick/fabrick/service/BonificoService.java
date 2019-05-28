package com.test_fabrick.fabrick.service;

import com.test_fabrick.fabrick.generic.GenericMethod;
import com.test_fabrick.fabrick.model.BonificoInput;
import com.test_fabrick.fabrick.model.ResponseObj;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BonificoService {

    @Value("${rest.url.bonifico")
    private String urlBonifico;

    private RestTemplate restTemplate;

    @Autowired
    public BonificoService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Pair<ResponseObj, HttpStatus> doBonifico(String accountId, BonificoInput bonifico) {
        HttpEntity<BonificoInput> request = new HttpEntity<>(bonifico);
        ResponseEntity<ResponseObj> response = restTemplate.postForEntity(
                urlBonifico.replace("{accountId}", accountId),
                request,
                ResponseObj.class
        );

        return GenericMethod.getResponse(response);
    }
}
