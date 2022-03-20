package com.arc.cal.azure.webapp.service;


import com.arc.cal.azure.webapp.model.ServiceRequest;
import com.arc.cal.azure.webapp.model.ServiceResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public ServiceResponse add(ServiceRequest req){
        ServiceResponse serviceResponse=new ServiceResponse();
        serviceResponse.setResult(req.getInput1()+req.getInput2());
        serviceResponse.setMessage(req.getInput1()+"+"+req.getInput2()+"="+serviceResponse.getResult());
        return serviceResponse;
    }
    public ServiceResponse sub(ServiceRequest req){
        ServiceResponse serviceResponse=new ServiceResponse();
        serviceResponse.setResult(req.getInput1()-req.getInput2());
        serviceResponse.setMessage(req.getInput1()+"-"+req.getInput2()+"="+serviceResponse.getResult());
        return serviceResponse;
    }
    public ServiceResponse multiply(ServiceRequest req){
        ServiceResponse serviceResponse=new ServiceResponse();
        serviceResponse.setResult(req.getInput1()*req.getInput2());
        serviceResponse.setMessage(req.getInput1()+"*"+req.getInput2()+"="+serviceResponse.getResult());
        return serviceResponse;
    }
    public ServiceResponse divide(ServiceRequest req){
        ServiceResponse serviceResponse=new ServiceResponse();
        serviceResponse.setResult(req.getInput1()/req.getInput2());
        serviceResponse.setMessage(req.getInput1()+"/"+req.getInput2()+"="+serviceResponse.getResult());
        return serviceResponse;
    }
}
