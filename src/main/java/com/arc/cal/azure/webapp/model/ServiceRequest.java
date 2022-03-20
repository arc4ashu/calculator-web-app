package com.arc.cal.azure.webapp.model;

public class ServiceRequest {
    private long input1;
    private long input2;
    private String operation;

    public long getInput1() {
        return input1;
    }

    public void setInput1(long input1) {
        this.input1 = input1;
    }

    public long getInput2() {
        return input2;
    }

    public void setInput2(long input2) {
        this.input2 = input2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
