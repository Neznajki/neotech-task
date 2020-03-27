package com.neotech.phone.di;

import com.neotech.contract.ResultEntryInterface;
import com.neotech.exception.InvalidPhoneException;
import com.neotech.phone.RawPhoneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Handler {
    private Validator validator;
    private FullCollection collection;

    @Autowired
    public Handler(Validator validator, FullCollection collection) {
        this.validator = validator;
        this.collection = collection;
    }

    public void validatePhone(RawPhoneEntity phone) throws InvalidPhoneException {
        if (! this.validator.isPhoneValid(phone)) {
            throw new InvalidPhoneException(String.format("could not found phone data for phone %s", phone.getIncomingValue()));
        }
    }

    public ResultEntryInterface getPhoneEntry(RawPhoneEntity phone)
    {
        return this.collection.getResponseEntry(phone);
    }
}
