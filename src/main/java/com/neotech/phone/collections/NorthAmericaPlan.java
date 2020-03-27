package com.neotech.phone.collections;

import com.neotech.country.collection.north.american.*;
import com.neotech.phone.CodeData;
import com.neotech.phone.ZoneCollection;

public class NorthAmericaPlan extends ZoneCollection {
    public NorthAmericaPlan() {
        this.supportedCodes.add(new CodeData("1", new UnitedStates()));
        this.supportedCodes.add(new CodeData("1", new Canada()));
        this.supportedCodes.add(new CodeData("1340", new UnitedStatesVirginIslands()));
        this.supportedCodes.add(new CodeData("1670", new NorthernMarianaIslands()));
        this.supportedCodes.add(new CodeData("1671", new Guam()));
        this.supportedCodes.add(new CodeData("1684", new AmericanSamoa()));
        this.supportedCodes.add(new CodeData("1787", new PuertoRico()));
        this.supportedCodes.add(new CodeData("1939", new PuertoRico()));
        this.supportedCodes.add(new CodeData("1242", new Bahamas()));
        this.supportedCodes.add(new CodeData("1264", new Anguilla()));
        this.supportedCodes.add(new CodeData("1268", new AntiguaAndBarbuda()));
        this.supportedCodes.add(new CodeData("1284", new BritishVirginIslands()));
        this.supportedCodes.add(new CodeData("1345", new CaymanIslands()));
        this.supportedCodes.add(new CodeData("1441", new Bermuda()));
        this.supportedCodes.add(new CodeData("1473", new Grenada()));
        this.supportedCodes.add(new CodeData("1649", new TurksAndCaicosIslands()));
        this.supportedCodes.add(new CodeData("1664", new Montserrat()));
        this.supportedCodes.add(new CodeData("1721", new SintMaarten()));
        this.supportedCodes.add(new CodeData("1758", new SaintLucia()));
        this.supportedCodes.add(new CodeData("1767", new Dominica()));
        this.supportedCodes.add(new CodeData("1784", new SaintVincentAndTheGrenadines()));
        this.supportedCodes.add(new CodeData("1809", new DominicanRepublic()));
        this.supportedCodes.add(new CodeData("1829", new DominicanRepublic()));
        this.supportedCodes.add(new CodeData("1849", new DominicanRepublic()));
        this.supportedCodes.add(new CodeData("1868", new TrinidadAndTobago()));
        this.supportedCodes.add(new CodeData("1869", new SaintKittsAndNevis()));
        this.supportedCodes.add(new CodeData("1876", new Jamaica()));
        this.supportedCodes.add(new CodeData("1658", new Jamaica()));

        this.sortCountries();
    }
}
