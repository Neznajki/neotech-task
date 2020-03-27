package com.neotech.phone.di;

import com.neotech.phone.RawPhoneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Validator {
    private FullCollection collection;

    @Autowired
    public Validator(FullCollection collection) {
        this.collection = collection;
    }

    public boolean isPhoneValid(RawPhoneEntity phoneEntity)
    {
        return this.collection.havePhoneData(phoneEntity);
    }
}
