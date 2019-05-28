package com.test_fabrick.fabrick.generic;

import com.test_fabrick.fabrick.model.ResponseObj;
import javafx.util.Pair;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GenericMethod {

    public static Pair<ResponseObj, HttpStatus> getResponse(ResponseEntity<ResponseObj> response) {
        Pair<ResponseObj, HttpStatus> out;
        if(response.getStatusCodeValue() == 200) {
            out = new Pair<>(response.getBody(), HttpStatus.OK);
        } else {
            out = new Pair<>(response.getBody(), response.getStatusCode());
        }
        return out;
    }
}
