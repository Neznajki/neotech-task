package com.neotech.phone;

import com.neotech.exception.InvalidPhoneException;

import java.util.regex.Pattern;

public class RawPhoneEntity {
    private String incomingValue;
    private String cleanValue;

    public RawPhoneEntity(String incomingValue) throws InvalidPhoneException {
        if (! incomingValue.matches("^\\+.+")) {
            throw new InvalidPhoneException(String.format("(%s) phone should begin with +", incomingValue));
        }
        if (!Pattern.matches("^\\+[\\d\\[\\]()-]+$", incomingValue)) {
            throw new InvalidPhoneException(String.format("(%s) phone should look like phone +371 1123 // +1 (555) [111] 4555 // +15555", incomingValue));
        }

        this.incomingValue = incomingValue.intern();
        this.cleanValue = incomingValue.replaceAll("[\\[\\]()-+]", "").intern();
    }

    public String getCleanValue()
    {
        return this.cleanValue;
    }

    public String getIncomingValue() {
        return incomingValue;
    }
}
