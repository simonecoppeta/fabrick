package com.test_fabrick.fabrick.service;

import com.test_fabrick.fabrick.generic.GenericMethod;
import com.test_fabrick.fabrick.model.ResponseObj;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LetturaSaldoService {

    @Value("${rest.url.balance")
    private String urlBalance;

    private RestTemplate restTemplate;

    @Autowired
    public LetturaSaldoService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public Pair<ResponseObj, HttpStatus> getSaldo(String accountId) {
        ResponseEntity<ResponseObj> response = this.restTemplate.exchange(
                urlBalance.replace("{accountId}", accountId),
                HttpMethod.GET,
                null,
                ResponseObj.class
        );

        return GenericMethod.getResponse(response);
    }
}
