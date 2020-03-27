package com.neotech.phone;

import com.neotech.app.Container;
import com.neotech.contract.ResultEntryInterface;
import com.neotech.exception.InvalidPhoneException;

public class Handler {
    private Validator validator = Container.getInstance().getValidator();
    private FullCollection collection = Container.getInstance().getFullCollection();

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
