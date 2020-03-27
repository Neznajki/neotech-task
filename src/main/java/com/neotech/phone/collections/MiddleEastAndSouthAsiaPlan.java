package com.neotech.phone.collections;

import com.neotech.country.collection.europe.Cyprus;
import com.neotech.country.collection.middle.east.*;
import com.neotech.phone.CodeData;
import com.neotech.phone.Commentary;
import com.neotech.phone.ZoneCollection;

public class MiddleEastAndSouthAsiaPlan extends ZoneCollection {
    public MiddleEastAndSouthAsiaPlan() {
        this.supportedCodes.add(new CodeData("969", new Commentary("unassigned – originally  South Yemen, now covered under 967 Yemen (formerly  North Yemen)")));
        this.supportedCodes.add(new CodeData("978", new Commentary("unassigned – originally assigned to Dubai, now covered under 971")));
        this.supportedCodes.add(new CodeData("979", new Commentary("International Premium Rate Service - originally assigned to Abu Dhabi, now covered under 971")));
        this.supportedCodes.add(new CodeData("990", new Commentary()));
        this.supportedCodes.add(new CodeData("991", new Commentary("International Telecommunications Public Correspondence Service trial (ITPCS)")));
        this.supportedCodes.add(new CodeData("997", new Commentary()));
        this.supportedCodes.add(new CodeData("999", new Commentary("reserved for future global service.")));

        this.supportedCodes.add(new CodeData("90", new Turkey()));
        this.supportedCodes.add(new CodeData("90392", new Cyprus()));
        this.supportedCodes.add(new CodeData("91", new India()));
        this.supportedCodes.add(new CodeData("92", new Pakistan()));
        this.supportedCodes.add(new CodeData("92582", new AzadKashmir()));
        this.supportedCodes.add(new CodeData("92581", new GilgitBaltistan()));

        this.supportedCodes.add(new CodeData("93", new Afghanistan()));
        this.supportedCodes.add(new CodeData("94", new SriLanka()));
        this.supportedCodes.add(new CodeData("95", new Myanmar()));

        this.supportedCodes.add(new CodeData("960", new Maldives()));
        this.supportedCodes.add(new CodeData("961", new Lebanon()));
        this.supportedCodes.add(new CodeData("962", new Jordan()));
        this.supportedCodes.add(new CodeData("963", new Syria()));
        this.supportedCodes.add(new CodeData("964", new Iraq()));
        this.supportedCodes.add(new CodeData("965", new Kuwait()));
        this.supportedCodes.add(new CodeData("966", new SaudiArabia()));
        this.supportedCodes.add(new CodeData("967", new Yemen()));
        this.supportedCodes.add(new CodeData("968", new Oman()));

        this.supportedCodes.add(new CodeData("970", new Palestine()));
        this.supportedCodes.add(new CodeData("971", new UnitedArabEmirates()));
        this.supportedCodes.add(new CodeData("972", new Israel()));
        this.supportedCodes.add(new CodeData("973", new Bahrain()));
        this.supportedCodes.add(new CodeData("974", new Qatar()));
        this.supportedCodes.add(new CodeData("975", new Bhutan()));
        this.supportedCodes.add(new CodeData("976", new Mongolia()));
        this.supportedCodes.add(new CodeData("977", new Nepal()));

        this.supportedCodes.add(new CodeData("98", new Iran()));

        this.supportedCodes.add(new CodeData("992", new Tajikistan()));
        this.supportedCodes.add(new CodeData("993", new Turkmenistan()));
        this.supportedCodes.add(new CodeData("994", new Azerbaijan()));
        this.supportedCodes.add(new CodeData("995", new Georgia()));
        this.supportedCodes.add(new CodeData("99534", new SouthOssetia()));
        this.supportedCodes.add(new CodeData("99544", new Abkhazia()));
        this.supportedCodes.add(new CodeData("996", new Kyrgyzstan()));
        this.supportedCodes.add(new CodeData("998", new Uzbekistan()));

        this.sortCountries();
    }
}
