package com.neotech.phone.collections;

import com.neotech.country.collection.sovied.uninion.Abkhazia;
import com.neotech.country.collection.sovied.uninion.Kazakhstan;
import com.neotech.country.collection.sovied.uninion.Russia;
import com.neotech.phone.CodeData;
import com.neotech.phone.ZoneCollection;

public class SovietUnionPlan extends ZoneCollection {
    public SovietUnionPlan() {
        this.supportedCodes.add(new CodeData("7", new Russia()));
        this.supportedCodes.add(new CodeData("76", new Kazakhstan()));
        this.supportedCodes.add(new CodeData("77", new Kazakhstan()));
        this.supportedCodes.add(new CodeData("7840", new Abkhazia()));
        this.supportedCodes.add(new CodeData("7940", new Abkhazia()));

        this.sortCountries();
    }
}
