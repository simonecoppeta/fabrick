package com.test_fabrick.fabrick.controller;

import com.test_fabrick.fabrick.model.BonificoInput;
import com.test_fabrick.fabrick.model.ResponseObj;
import com.test_fabrick.fabrick.service.BonificoService;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/")
public class BonificoController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(BonificoController.class);

    @Autowired
    private BonificoService bonificoService;

    @PostMapping("{accountId}/bonifico")
    public ResponseEntity<ResponseObj> getSaldoByAccountId(@PathVariable("accountId") String accountId, @Valid @RequestBody BonificoInput request) {
        log.info("Request to execute bonifico by account id {}", accountId);
        Pair<ResponseObj, HttpStatus> output = this.bonificoService.doBonifico(accountId, request);
        return new ResponseEntity<>(output.getKey(), output.getValue());
    }
}
