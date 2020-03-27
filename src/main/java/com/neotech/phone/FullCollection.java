package com.neotech.phone;

import com.neotech.contract.ResultEntryInterface;
import com.neotech.phone.collections.*;

import java.util.HashMap;

public class FullCollection {
    HashMap<String, ZoneCollection> supportedZoneCollections = new HashMap<>();

    public FullCollection()
    {
        this.supportedZoneCollections.put("1", new NorthAmericaPlan());
        this.supportedZoneCollections.put("2", new AfricaPlan());
        this.supportedZoneCollections.put("3", new EuropeThreePlan());
        this.supportedZoneCollections.put("4", new EuropeFourPlan());
        this.supportedZoneCollections.put("5", new AmericasPlan());
        this.supportedZoneCollections.put("6", new SouthEastAsiaPlan());
        this.supportedZoneCollections.put("7", new SovietUnionPlan());
        this.supportedZoneCollections.put("8", new EastAsiaAndSpecialServicesPlan());
        this.supportedZoneCollections.put("9", new MiddleEastAndSouthAsiaPlan());
    }

    public boolean havePhoneData(RawPhoneEntity phoneEntity)
    {
        return this.supportedZoneCollections.get(phoneEntity.getCleanValue().substring(0, 1)).havePhoneCodeData(phoneEntity);
    }

    public ResultEntryInterface getResponseEntry(RawPhoneEntity phoneEntity)
    {
        CodeData phoneCodeData = this.supportedZoneCollections.get(phoneEntity.getCleanValue().substring(0, 1)).getPhoneCodeData(phoneEntity);

        ResultEntryInterface result = phoneCodeData.getOutput();
        result.setMatchPhoneCode(phoneCodeData.getCode());

        return result;

    }
}
