package com.neotech.phone;

import java.util.*;

public class ZoneCollection {
    protected List<CodeData> supportedCodes = new ArrayList<>();

    public boolean havePhoneCodeData(RawPhoneEntity phoneEntity)
    {
        return this.getPhoneCodeData(phoneEntity) != null;
    }

    public CodeData getPhoneCodeData(RawPhoneEntity phoneEntity)
    {
        for (CodeData codeData: this.supportedCodes) {
            if (codeData.getCode().length() > phoneEntity.getCleanValue().length()) {
                continue;
            }

            String firstPhoneSymbols = phoneEntity.getCleanValue().substring(0, codeData.getCode().length());

            if (firstPhoneSymbols.equals(codeData.getCode())) {
                return codeData;
            }
        }

        return null;
    }

    protected void sortCountries()
    {
        //just to make sure numbers like 3844,3845 comes before 384
        this.supportedCodes.sort((a, b) -> Integer.parseInt(b.getCode()) - Integer.parseInt(a.getCode()));
    }
}
