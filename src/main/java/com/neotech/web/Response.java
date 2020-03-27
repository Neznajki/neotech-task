package com.neotech.web;

import com.neotech.contract.ResultEntryInterface;
import com.neotech.exception.InvalidPhoneException;
import com.neotech.exception.StateNotChangedException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Response {
    @SuppressWarnings("unused")//used by jackson
    String exceptionMessage;
    @SuppressWarnings("unused")//used by jackson
    ResultEntryInterface result;

    public Response(Throwable exception)
    {
        Logger logger = LogManager.getLogger(Response.class);
        logger.error("something got wrong in response preparation", exception);

        this.exceptionMessage = "something got wrong please report";
    }

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
