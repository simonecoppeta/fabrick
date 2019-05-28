package com.test_fabrick.fabrick.controller;

import com.test_fabrick.fabrick.model.ResponseObj;
import com.test_fabrick.fabrick.service.LetturaSaldoService;
import javafx.util.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class LetturaSaldoController {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LetturaSaldoController.class);

    @Autowired
    private LetturaSaldoService letturaSaldoService;

    @GetMapping("{accountId}/saldo")
    public ResponseEntity<ResponseObj> getSaldoByAccountId(@PathVariable("accountId") String accountId)  {
        log.info("Request to get balance for account id {}", accountId);
        Pair<ResponseObj, HttpStatus> output = this.letturaSaldoService.getSaldo(accountId);
        return new ResponseEntity<>(output.getKey(), output.getValue());
    }
}
