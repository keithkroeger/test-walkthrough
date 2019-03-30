package com.test.testwalkthrough.controller;


import com.test.testwalkthrough.domain.Returning;
import com.test.testwalkthrough.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private DataService service;

    @GetMapping("/testLocal")
    public ResponseEntity<List<Returning>> runThis(){

        return new ResponseEntity<>(service.getList(), HttpStatus.OK);

    }
}
