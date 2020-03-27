package com.neotech.phone.collections;

import com.neotech.country.collection.europe.*;
import com.neotech.phone.CodeData;
import com.neotech.phone.Commentary;
import com.neotech.phone.ZoneCollection;

public class EuropeThreePlan extends ZoneCollection {
    public EuropeThreePlan() {
        this.supportedCodes.add(new CodeData("37", new Commentary("Discontinued (was assigned to  East Germany until reunifying with the West. See Germany's country code +49 below)")));
        this.supportedCodes.add(new CodeData("38", new Commentary("Discontinued (was assigned to the  Socialist Federal Republic of Yugoslavia until its break-up)")));
        this.supportedCodes.add(new CodeData("384", new Commentary()));
        this.supportedCodes.add(new CodeData("388", new Commentary("Discontinued (was assigned to the European Telephony Numbering Space)[1][2]")));

        this.supportedCodes.add(new CodeData("30", new Greece()));
        this.supportedCodes.add(new CodeData("31", new Netherlands()));
        this.supportedCodes.add(new CodeData("32", new Belgium()));
        this.supportedCodes.add(new CodeData("33", new France()));
        this.supportedCodes.add(new CodeData("34", new Spain()));

        this.supportedCodes.add(new CodeData("350", new Gibraltar()));
        this.supportedCodes.add(new CodeData("351", new Portugal()));
        this.supportedCodes.add(new CodeData("352", new Luxembourg()));
        this.supportedCodes.add(new CodeData("353", new Ireland()));
        this.supportedCodes.add(new CodeData("354", new Iceland()));
        this.supportedCodes.add(new CodeData("355", new Albania()));
        this.supportedCodes.add(new CodeData("356", new Malta()));
        this.supportedCodes.add(new CodeData("357", new Cyprus()));
        this.supportedCodes.add(new CodeData("358", new Finland()));
        this.supportedCodes.add(new CodeData("35818", new AlandIslands()));
        this.supportedCodes.add(new CodeData("359", new Bulgaria()));

        this.supportedCodes.add(new CodeData("36", new Hungary()));

        this.supportedCodes.add(new CodeData("370", new Lithuania()));
        this.supportedCodes.add(new CodeData("371", new Latvia()));
        this.supportedCodes.add(new CodeData("372", new Estonia()));
        this.supportedCodes.add(new CodeData("373", new Moldova()));
        this.supportedCodes.add(new CodeData("374", new Armenia()));
        this.supportedCodes.add(new CodeData("37447", new Artsakh()));
        this.supportedCodes.add(new CodeData("37497", new Artsakh()));
        this.supportedCodes.add(new CodeData("375", new Belarus()));
        this.supportedCodes.add(new CodeData("376", new Andorra()));
        this.supportedCodes.add(new CodeData("377", new Monaco()));
        this.supportedCodes.add(new CodeData("378", new SanMarino()));
        this.supportedCodes.add(new CodeData("379", new VaticanCity()));

        this.supportedCodes.add(new CodeData("380", new Ukraine()));
        this.supportedCodes.add(new CodeData("381", new Serbia()));
        this.supportedCodes.add(new CodeData("382", new Montenegro()));
        this.supportedCodes.add(new CodeData("383", new Kosovo()));
        this.supportedCodes.add(new CodeData("385", new Croatia()));
        this.supportedCodes.add(new CodeData("386", new Slovenia()));
        this.supportedCodes.add(new CodeData("387", new BosniaAndHerzegovina()));
        this.supportedCodes.add(new CodeData("389", new NorthMacedonia()));
        this.supportedCodes.add(new CodeData("39", new Italy()));
        this.supportedCodes.add(new CodeData("3906698", new VaticanCity()));

        this.sortCountries();
    }
}
