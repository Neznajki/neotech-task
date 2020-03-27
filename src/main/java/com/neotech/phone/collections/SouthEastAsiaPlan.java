package com.neotech.phone.collections;

import com.neotech.country.collection.south.east.asia.*;
import com.neotech.phone.CodeData;
import com.neotech.phone.Commentary;
import com.neotech.phone.ZoneCollection;

public class SouthEastAsiaPlan extends ZoneCollection {
    public SouthEastAsiaPlan() {
        this.supportedCodes.add(new CodeData("671", new Commentary("formerly Guam – Now included in NANP as code +1-671 (See Zone 1, above)")));
        this.supportedCodes.add(new CodeData("684", new Commentary("formerly American Samoa – Now included in NANP as code +1-684 (See Zone 1, above)")));
        this.supportedCodes.add(new CodeData("693", new Commentary()));
        this.supportedCodes.add(new CodeData("694", new Commentary()));
        this.supportedCodes.add(new CodeData("695", new Commentary()));
        this.supportedCodes.add(new CodeData("696", new Commentary()));
        this.supportedCodes.add(new CodeData("697", new Commentary()));
        this.supportedCodes.add(new CodeData("698", new Commentary()));
        this.supportedCodes.add(new CodeData("699", new Commentary()));

        this.supportedCodes.add(new CodeData("60", new Malaysia()));
        this.supportedCodes.add(new CodeData("61", new Australia()));
        this.supportedCodes.add(new CodeData("6189162", new CocosIslands()));
        this.supportedCodes.add(new CodeData("6189164", new ChristmasIsland()));
        this.supportedCodes.add(new CodeData("62", new Indonesia()));
        this.supportedCodes.add(new CodeData("63", new Philippines()));
        this.supportedCodes.add(new CodeData("64", new NewZealand()));
        this.supportedCodes.add(new CodeData("64", new PitcairnIslands()));
        this.supportedCodes.add(new CodeData("65", new Singapore()));
        this.supportedCodes.add(new CodeData("66", new Thailand()));

        this.supportedCodes.add(new CodeData("670", new EastTimor()));
        this.supportedCodes.add(new CodeData("672", new AustralianExternalTerritories()));
        this.supportedCodes.add(new CodeData("6721", new AustralianAntarcticTerritory()));
        this.supportedCodes.add(new CodeData("6723", new NorfolkIsland()));
        this.supportedCodes.add(new CodeData("673", new Brunei()));
        this.supportedCodes.add(new CodeData("674", new Nauru()));
        this.supportedCodes.add(new CodeData("675", new PapuaNewGuinea()));
        this.supportedCodes.add(new CodeData("676", new Tonga()));
        this.supportedCodes.add(new CodeData("677", new SolomonIslands()));
        this.supportedCodes.add(new CodeData("678", new Vanuatu()));
        this.supportedCodes.add(new CodeData("679", new Fiji()));

        this.supportedCodes.add(new CodeData("680", new Palau()));
        this.supportedCodes.add(new CodeData("681", new WallisAndFutuna()));
        this.supportedCodes.add(new CodeData("682", new CookIslands()));
        this.supportedCodes.add(new CodeData("683", new Niue()));
        this.supportedCodes.add(new CodeData("685", new Samoa()));
        this.supportedCodes.add(new CodeData("686", new Kiribati()));
        this.supportedCodes.add(new CodeData("687", new NewCaledonia()));
        this.supportedCodes.add(new CodeData("688", new Tuvalu()));
        this.supportedCodes.add(new CodeData("689", new FrenchPolynesia()));

        this.supportedCodes.add(new CodeData("690", new Tokelau()));
        this.supportedCodes.add(new CodeData("691", new FederatedStatesOfMicronesia()));
        this.supportedCodes.add(new CodeData("692", new MarshallIslands()));

        this.sortCountries();
    }
}
