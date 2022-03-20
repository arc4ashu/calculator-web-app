package com.arc.cal.azure.webapp.controller;


import com.arc.cal.azure.webapp.model.ServiceRequest;
import com.arc.cal.azure.webapp.model.ServiceResponse;
import com.arc.cal.azure.webapp.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    @PostMapping(path="/add", produces = "application/json")
    public ResponseEntity<?> add(@RequestBody ServiceRequest serviceRequest){
        ServiceResponse serviceResponse=calculatorService.add(serviceRequest);
        serviceResponse.setStatus("SUCCESS");
        return  new ResponseEntity< >(serviceResponse, HttpStatus.OK);
    }

    @PostMapping(path="/sub", produces = "application/json")
    public ResponseEntity<?> sub(@RequestBody ServiceRequest serviceRequest){
        ServiceResponse serviceResponse=calculatorService.sub(serviceRequest);
        serviceResponse.setStatus("SUCCESS");
        return  new ResponseEntity<ServiceResponse>(serviceResponse, HttpStatus.OK);
    }

    @PostMapping(path="/mul", produces = "application/json")
    public ResponseEntity<?> mul(@RequestBody ServiceRequest serviceRequest){
        ServiceResponse serviceResponse=calculatorService.multiply(serviceRequest);
        serviceResponse.setStatus("SUCCESS");
        return  new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }

    @PostMapping(path="/div", produces = "application/json")
    public ResponseEntity<?> div(@RequestBody ServiceRequest serviceRequest){
        ServiceResponse serviceResponse=calculatorService.divide(serviceRequest);
        serviceResponse.setStatus("SUCCESS");
        return  new ResponseEntity<>(serviceResponse, HttpStatus.OK);
    }
}
