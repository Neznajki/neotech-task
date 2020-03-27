package com.neotech.country;

import com.neotech.contract.ResultEntryInterface;

//could be moved to mysql to reduce code complexity and allow to edit data.
public class Country  implements ResultEntryInterface {
    public String code;
    public String matchedPhoneCode;
    String type = "country";
    String name;

    public Country(String name, String code) {
        this.name = name;
        this.code = code;
    }

    @Override
    public void setMatchPhoneCode(String phoneCode) {
        this.matchedPhoneCode = phoneCode;
    }
}
