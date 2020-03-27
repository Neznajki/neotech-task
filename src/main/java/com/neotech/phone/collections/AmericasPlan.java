package com.neotech.phone.collections;

import com.neotech.country.collection.americas.*;
import com.neotech.phone.CodeData;
import com.neotech.phone.ZoneCollection;

public class AmericasPlan extends ZoneCollection {
    public AmericasPlan() {
        this.supportedCodes.add(new CodeData("500", new FalklandIslands()));
        this.supportedCodes.add(new CodeData("500", new SouthGeorgiaAndTheSouthSandwichIslands()));
        this.supportedCodes.add(new CodeData("501", new Belize()));
        this.supportedCodes.add(new CodeData("502", new Guatemala()));
        this.supportedCodes.add(new CodeData("503", new ElSalvador()));
        this.supportedCodes.add(new CodeData("504", new Honduras()));
        this.supportedCodes.add(new CodeData("505", new Nicaragua()));
        this.supportedCodes.add(new CodeData("506", new CostaRica()));
        this.supportedCodes.add(new CodeData("507", new Panama()));
        this.supportedCodes.add(new CodeData("508", new SaintPierreAndMiquelon()));
        this.supportedCodes.add(new CodeData("509", new Haiti()));

        this.supportedCodes.add(new CodeData("51", new Peru()));
        this.supportedCodes.add(new CodeData("52", new Mexico()));
        this.supportedCodes.add(new CodeData("53", new Cuba()));
        this.supportedCodes.add(new CodeData("54", new Argentina()));
        this.supportedCodes.add(new CodeData("55", new Brazil()));
        this.supportedCodes.add(new CodeData("56", new Chile()));
        this.supportedCodes.add(new CodeData("57", new Colombia()));
        this.supportedCodes.add(new CodeData("58", new Venezuela()));

        this.supportedCodes.add(new CodeData("590", new Guadeloupe()));
        this.supportedCodes.add(new CodeData("591", new Bolivia()));
        this.supportedCodes.add(new CodeData("592", new Guyana()));
        this.supportedCodes.add(new CodeData("593", new Ecuador()));
        this.supportedCodes.add(new CodeData("594", new FrenchGuiana()));
        this.supportedCodes.add(new CodeData("595", new Paraguay()));
        this.supportedCodes.add(new CodeData("596", new Martinique()));
        this.supportedCodes.add(new CodeData("597", new Suriname()));
        this.supportedCodes.add(new CodeData("598", new Uruguay()));
        this.supportedCodes.add(new CodeData("599", new NetherlandsAntilles()));
        this.supportedCodes.add(new CodeData("5993", new BonaireAndSintEustatiusAndSaba()));
        this.supportedCodes.add(new CodeData("5994", new BonaireAndSintEustatiusAndSaba()));
        this.supportedCodes.add(new CodeData("5995", new SintMaarten()));
        this.supportedCodes.add(new CodeData("5997", new BonaireAndSintEustatiusAndSaba()));
        this.supportedCodes.add(new CodeData("5998", new Aruba()));
        this.supportedCodes.add(new CodeData("5999", new Curacao()));

        this.sortCountries();
    }
}
