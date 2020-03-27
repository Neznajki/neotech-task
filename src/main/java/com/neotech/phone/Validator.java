package com.neotech.phone;

import com.neotech.app.Container;

public class Validator {
    private FullCollection collection = Container.getInstance().getFullCollection();

    public boolean isPhoneValid(RawPhoneEntity phoneEntity)
    {
        return this.collection.havePhoneData(phoneEntity);
    }
}
