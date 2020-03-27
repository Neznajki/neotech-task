package com.neotech.web;

import com.neotech.contract.ResultEntryInterface;
import com.neotech.exception.InvalidPhoneException;
import com.neotech.exception.StateNotChangedException;

public class Response {
    private String exceptionMessage;
    private ResultEntryInterface result;

    public Response(InvalidPhoneException exception)
    {
        this.exceptionMessage = exception.getMessage();
    }

    public Response(StateNotChangedException exception)
    {
        this.exceptionMessage = exception.getMessage();
    }

    public Response(ResultEntryInterface resultEntry)
    {
        this.result = resultEntry;
    }
}
