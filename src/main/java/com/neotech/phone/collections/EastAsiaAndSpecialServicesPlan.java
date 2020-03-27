package com.neotech.phone.collections;

import com.neotech.country.collection.east.asia.*;
import com.neotech.phone.CodeData;
import com.neotech.phone.Commentary;
import com.neotech.phone.ZoneCollection;

public class EastAsiaAndSpecialServicesPlan extends ZoneCollection {
    public EastAsiaAndSpecialServicesPlan() {
        this.supportedCodes.add(new CodeData("800", new Commentary("International Freephone (UIFN)")));
        this.supportedCodes.add(new CodeData("801", new Commentary()));
        this.supportedCodes.add(new CodeData("802", new Commentary()));
        this.supportedCodes.add(new CodeData("803", new Commentary()));
        this.supportedCodes.add(new CodeData("804", new Commentary()));
        this.supportedCodes.add(new CodeData("805", new Commentary()));
        this.supportedCodes.add(new CodeData("806", new Commentary()));
        this.supportedCodes.add(new CodeData("807", new Commentary()));
        this.supportedCodes.add(new CodeData("808", new Commentary("reserved for Shared Cost Services")));
        this.supportedCodes.add(new CodeData("809", new Commentary()));
        this.supportedCodes.add(new CodeData("83", new Commentary(" unassigned (Reserved for country code expansion)[1]")));
        this.supportedCodes.add(new CodeData("851", new Commentary()));
        this.supportedCodes.add(new CodeData("854", new Commentary()));
        this.supportedCodes.add(new CodeData("857", new Commentary("unassigned, formerly ANAC satellite service")));
        this.supportedCodes.add(new CodeData("858", new Commentary("unassigned, formerly ANAC satellite service")));

        this.supportedCodes.add(new CodeData("870", new Commentary("Inmarsat \"SNAC\" service")));
        this.supportedCodes.add(new CodeData("871", new Commentary("unassigned (formerly used by Inmarsat, Atlantic East), discontinued in 2008")));
        this.supportedCodes.add(new CodeData("872", new Commentary("unassigned (formerly used by Inmarsat, Pacific), discontinued in 2008")));
        this.supportedCodes.add(new CodeData("873", new Commentary("unassigned (formerly used by Inmarsat, Indian), discontinued in 2008")));
        this.supportedCodes.add(new CodeData("874", new Commentary("unassigned (formerly used by Inmarsat, Atlantic West), discontinued 2008")));
        this.supportedCodes.add(new CodeData("875", new Commentary("reserved for Maritime Mobile service")));
        this.supportedCodes.add(new CodeData("876", new Commentary("reserved for Maritime Mobile service")));
        this.supportedCodes.add(new CodeData("877", new Commentary("reserved for Maritime Mobile service")));
        this.supportedCodes.add(new CodeData("878", new Commentary("Universal Personal Telecommunications services")));
        this.supportedCodes.add(new CodeData("879", new Commentary("reserved for national non-commercial purposes")));

        this.supportedCodes.add(new CodeData("881", new Commentary("Global Mobile Satellite System")));
        this.supportedCodes.add(new CodeData("882", new Commentary("International Networks")));
        this.supportedCodes.add(new CodeData("883", new Commentary("International Networks")));
        this.supportedCodes.add(new CodeData("884", new Commentary()));
        this.supportedCodes.add(new CodeData("885", new Commentary()));
        this.supportedCodes.add(new CodeData("887", new Commentary()));
        this.supportedCodes.add(new CodeData("888", new Commentary("Telecommunications for Disaster Relief by OCHA")));
        this.supportedCodes.add(new CodeData("889", new Commentary()));
        this.supportedCodes.add(new CodeData("89", new Commentary("unassigned (Reserved for country code expansion)[1]")));

        this.supportedCodes.add(new CodeData("81", new Japan()));
        this.supportedCodes.add(new CodeData("82", new SouthKorea()));
        this.supportedCodes.add(new CodeData("84", new Vietnam()));

        this.supportedCodes.add(new CodeData("850", new NorthKorea()));
        this.supportedCodes.add(new CodeData("859", new Commentary()));
        this.supportedCodes.add(new CodeData("852", new HongKong()));
        this.supportedCodes.add(new CodeData("853", new Macau()));
        this.supportedCodes.add(new CodeData("855", new Cambodia()));
        this.supportedCodes.add(new CodeData("856", new Laos()));

        this.supportedCodes.add(new CodeData("86", new China()));
        this.supportedCodes.add(new CodeData("880", new Bangladesh()));
        this.supportedCodes.add(new CodeData("886", new Taiwan()));

        this.sortCountries();
    }
}
