package com.neotech.phone.collections;

import com.neotech.country.collection.africa.*;
import com.neotech.phone.CodeData;
import com.neotech.phone.Commentary;
import com.neotech.phone.ZoneCollection;

public class AfricaPlan extends ZoneCollection {
    public AfricaPlan() {
        this.supportedCodes.add(new CodeData("210", new Commentary()));
        this.supportedCodes.add(new CodeData("214", new Commentary()));
        this.supportedCodes.add(new CodeData("215", new Commentary()));
        this.supportedCodes.add(new CodeData("217", new Commentary()));
        this.supportedCodes.add(new CodeData("219", new Commentary()));
        this.supportedCodes.add(new CodeData("259", new Commentary("unassigned, was intended for  People's Republic of Zanzibar but never implemented – see +255 Tanzania")));
        this.supportedCodes.add(new CodeData("28", new Commentary("+28x – unassigned (Reserved for country code expansion)[1]")));
        this.supportedCodes.add(new CodeData("292", new Commentary()));
        this.supportedCodes.add(new CodeData("293", new Commentary()));
        this.supportedCodes.add(new CodeData("294", new Commentary()));
        this.supportedCodes.add(new CodeData("295", new Commentary("discontinued (was assigned to San Marino, see +378)")));
        this.supportedCodes.add(new CodeData("296", new Commentary()));

        this.supportedCodes.add(new CodeData("20", new Egypt()));
        this.supportedCodes.add(new CodeData("211", new SouthSudan()));
        this.supportedCodes.add(new CodeData("212", new Morocco()));
        this.supportedCodes.add(new CodeData("213", new Algeria()));
        this.supportedCodes.add(new CodeData("216", new Tunisia()));
        this.supportedCodes.add(new CodeData("218", new Libya()));

        this.supportedCodes.add(new CodeData("220", new Gambia()));
        this.supportedCodes.add(new CodeData("221", new Senegal()));
        this.supportedCodes.add(new CodeData("222", new Mauritania()));
        this.supportedCodes.add(new CodeData("223", new Mali()));
        this.supportedCodes.add(new CodeData("224", new Guinea()));
        this.supportedCodes.add(new CodeData("225", new IvoryCoast()));
        this.supportedCodes.add(new CodeData("226", new BurkinaFaso()));
        this.supportedCodes.add(new CodeData("227", new Niger()));
        this.supportedCodes.add(new CodeData("228", new Togo()));
        this.supportedCodes.add(new CodeData("229", new Benin()));

        this.supportedCodes.add(new CodeData("230", new Mauritius()));
        this.supportedCodes.add(new CodeData("231", new Liberia()));
        this.supportedCodes.add(new CodeData("232", new SierraLeone()));
        this.supportedCodes.add(new CodeData("233", new Ghana()));
        this.supportedCodes.add(new CodeData("234", new Nigeria()));
        this.supportedCodes.add(new CodeData("235", new Chad()));
        this.supportedCodes.add(new CodeData("236", new CentralAfricanRepublic()));
        this.supportedCodes.add(new CodeData("237", new Cameroon()));
        this.supportedCodes.add(new CodeData("238", new CapeVerde()));
        this.supportedCodes.add(new CodeData("239", new SaoTomeAndPrincipe()));

        this.supportedCodes.add(new CodeData("240", new EquatorialGuinea()));
        this.supportedCodes.add(new CodeData("241", new Gabon()));
        this.supportedCodes.add(new CodeData("242", new RepublicOfTheCongo()));
        this.supportedCodes.add(new CodeData("243", new RepublicOfTheCongo()));
        this.supportedCodes.add(new CodeData("244", new Angola()));
        this.supportedCodes.add(new CodeData("245", new GuineaBissau()));
        this.supportedCodes.add(new CodeData("246", new BritishIndianOceanTerritory()));
        this.supportedCodes.add(new CodeData("247", new AscensionIsland()));
        this.supportedCodes.add(new CodeData("248", new Seychelles()));
        this.supportedCodes.add(new CodeData("249", new Sudan()));

        this.supportedCodes.add(new CodeData("250", new Rwanda()));
        this.supportedCodes.add(new CodeData("251", new Ethiopia()));
        this.supportedCodes.add(new CodeData("252", new Somalia()));
        this.supportedCodes.add(new CodeData("253", new Djibouti()));
        this.supportedCodes.add(new CodeData("254", new Kenya()));
        this.supportedCodes.add(new CodeData("255", new Tanzania()));
        this.supportedCodes.add(new CodeData("25524", new Zanzibar()));
        this.supportedCodes.add(new CodeData("256", new Uganda()));
        this.supportedCodes.add(new CodeData("257", new Burundi()));
        this.supportedCodes.add(new CodeData("258", new Mozambique()));

        this.supportedCodes.add(new CodeData("260", new Zambia()));
        this.supportedCodes.add(new CodeData("261", new Madagascar()));
        this.supportedCodes.add(new CodeData("262", new Reunion()));
        this.supportedCodes.add(new CodeData("262269", new Mayotte()));
        this.supportedCodes.add(new CodeData("262639", new Mayotte()));
        this.supportedCodes.add(new CodeData("263", new Zimbabwe()));
        this.supportedCodes.add(new CodeData("264", new Namibia()));
        this.supportedCodes.add(new CodeData("265", new Malawi()));
        this.supportedCodes.add(new CodeData("266", new Lesotho()));
        this.supportedCodes.add(new CodeData("267", new Botswana()));
        this.supportedCodes.add(new CodeData("268", new Eswatini()));
        this.supportedCodes.add(new CodeData("269", new Comoros()));

        this.supportedCodes.add(new CodeData("27", new SouthAfrica()));
        this.supportedCodes.add(new CodeData("290", new SaintHelena()));
        this.supportedCodes.add(new CodeData("2908", new TristanDaCunha()));
        this.supportedCodes.add(new CodeData("291", new Eritrea()));
        this.supportedCodes.add(new CodeData("297", new Aruba()));
        this.supportedCodes.add(new CodeData("298", new FaroeIslands()));
        this.supportedCodes.add(new CodeData("299", new Greenland()));

        this.sortCountries();
    }
}
