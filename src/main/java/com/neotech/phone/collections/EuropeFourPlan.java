package com.neotech.phone.collections;

import com.neotech.country.collection.europe.*;
import com.neotech.phone.CodeData;
import com.neotech.phone.Commentary;
import com.neotech.phone.ZoneCollection;

public class EuropeFourPlan extends ZoneCollection {
    public EuropeFourPlan() {
//        this.supportedCodes.add(new CodeData("42", new Commentary("Discontinued (was assigned to  Czechoslovakia until its breakup)")));//useless
        this.supportedCodes.add(new CodeData("422", new Commentary()));
        this.supportedCodes.add(new CodeData("424", new Commentary()));
        this.supportedCodes.add(new CodeData("425", new Commentary()));
        this.supportedCodes.add(new CodeData("426", new Commentary()));
        this.supportedCodes.add(new CodeData("427", new Commentary()));
        this.supportedCodes.add(new CodeData("428", new Commentary()));
        this.supportedCodes.add(new CodeData("429", new Commentary()));

        this.supportedCodes.add(new CodeData("40", new Romania()));
        this.supportedCodes.add(new CodeData("41", new Switzerland()));
        this.supportedCodes.add(new CodeData("420", new CzechRepublic()));
        this.supportedCodes.add(new CodeData("421", new Slovakia()));
        this.supportedCodes.add(new CodeData("423", new Liechtenstein()));
        this.supportedCodes.add(new CodeData("43", new Austria()));
        this.supportedCodes.add(new CodeData("44", new UnitedKingdom()));
        this.supportedCodes.add(new CodeData("441481", new Guernsey()));
        this.supportedCodes.add(new CodeData("441534", new Jersey()));
        this.supportedCodes.add(new CodeData("441624", new IsleOfMan()));
        this.supportedCodes.add(new CodeData("45", new Denmark()));
        this.supportedCodes.add(new CodeData("46", new Sweden()));
        this.supportedCodes.add(new CodeData("47", new Norway()));
        this.supportedCodes.add(new CodeData("4779", new Svalbard()));
        this.supportedCodes.add(new CodeData("48", new Poland()));
        this.supportedCodes.add(new CodeData("49", new Germany()));

        this.sortCountries();
    }
}
