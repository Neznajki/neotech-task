package com.neotech.country;

import com.neotech.contract.ResultEntryInterface;

//could be moved to mysql to reduce code complexity and allow to edit data.
public class Country  implements ResultEntryInterface {
    protected String type = "country";
    protected String name;
    protected String code;
    protected String matchedPhoneCode;

    public Country(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public void setMatchPhoneCode(String phoneCode) {
        this.matchedPhoneCode = phoneCode;
    }
}
