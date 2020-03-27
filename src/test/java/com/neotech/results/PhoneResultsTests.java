package com.neotech.results;

import com.neotech.contract.ResultEntryInterface;
import com.neotech.country.Country;
import com.neotech.country.collection.africa.Aruba;
import com.neotech.country.collection.africa.*;
import com.neotech.country.collection.americas.SintMaarten;
import com.neotech.country.collection.americas.*;
import com.neotech.country.collection.east.asia.*;
import com.neotech.country.collection.europe.*;
import com.neotech.country.collection.middle.east.*;
import com.neotech.country.collection.north.american.*;
import com.neotech.country.collection.south.east.asia.*;
import com.neotech.country.collection.sovied.uninion.Abkhazia;
import com.neotech.country.collection.sovied.uninion.Kazakhstan;
import com.neotech.country.collection.sovied.uninion.Russia;
import com.neotech.exception.InvalidPhoneException;
import com.neotech.phone.Commentary;
import com.neotech.phone.RawPhoneEntity;
import com.neotech.phone.di.FullCollection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PhoneResultsTests {

    FullCollection collection = new FullCollection();

    @Test
    public void testSovietPlan() throws InvalidPhoneException {
        this.testCountryPhoneNumber("+700233123", "7", (new Russia()).code);
        this.testCountryPhoneNumber("+7600233123", "76", (new Kazakhstan()).code);
        this.testCountryPhoneNumber("+7700233123", "77", (new Kazakhstan()).code);
        this.testCountryPhoneNumber("+784000233123", "7840", (new Abkhazia()).code);
        this.testCountryPhoneNumber("+794000233123", "7940", (new Abkhazia()).code);
    }

    @Test
    public void testAfricaPlan() throws InvalidPhoneException {
        this.testCommentaryPhoneNumber("+210023423", "210", "unassigned");
        this.testCommentaryPhoneNumber("+214023423", "214", "unassigned");
        this.testCommentaryPhoneNumber("+215023423", "215", "unassigned");
        this.testCommentaryPhoneNumber("+217023423", "217", "unassigned");
        this.testCommentaryPhoneNumber("+219023423", "219", "unassigned");
        this.testCommentaryPhoneNumber("+259023423", "259", "unassigned, was intended for  People's Republic of Zanzibar but never implemented – see +255 Tanzania");
        this.testCommentaryPhoneNumber("+28023423", "28", "+28x – unassigned (Reserved for country code expansion)[1]");
        this.testCommentaryPhoneNumber("+292023423", "292", "unassigned");
        this.testCommentaryPhoneNumber("+293023423", "293", "unassigned");
        this.testCommentaryPhoneNumber("+294023423", "294", "unassigned");
        this.testCommentaryPhoneNumber("+295023423", "295", "discontinued (was assigned to San Marino, see +378)");
        this.testCommentaryPhoneNumber("+296023423", "296", "unassigned");

        this.testCountryPhoneNumber("+2000233123", "20", (new Egypt()).code);
        this.testCountryPhoneNumber("+21100233123", "211", (new SouthSudan()).code);
        this.testCountryPhoneNumber("+21200233123", "212", (new Morocco()).code);
        this.testCountryPhoneNumber("+21300233123", "213", (new Algeria()).code);
        this.testCountryPhoneNumber("+21600233123", "216", (new Tunisia()).code);
        this.testCountryPhoneNumber("+21800233123", "218", (new Libya()).code);

        this.testCountryPhoneNumber("+22000233123", "220", (new Gambia()).code);
        this.testCountryPhoneNumber("+22100233123", "221", (new Senegal()).code);
        this.testCountryPhoneNumber("+22200233123", "222", (new Mauritania()).code);
        this.testCountryPhoneNumber("+22300233123", "223", (new Mali()).code);
        this.testCountryPhoneNumber("+22400233123", "224", (new Guinea()).code);
        this.testCountryPhoneNumber("+22500233123", "225", (new IvoryCoast()).code);
        this.testCountryPhoneNumber("+22600233123", "226", (new BurkinaFaso()).code);
        this.testCountryPhoneNumber("+22700233123", "227", (new Niger()).code);
        this.testCountryPhoneNumber("+22800233123", "228", (new Togo()).code);
        this.testCountryPhoneNumber("+22900233123", "229", (new Benin()).code);

        this.testCountryPhoneNumber("+23000233123", "230", (new Mauritius()).code);
        this.testCountryPhoneNumber("+23100233123", "231", (new Liberia()).code);
        this.testCountryPhoneNumber("+23200233123", "232", (new SierraLeone()).code);
        this.testCountryPhoneNumber("+23300233123", "233", (new Ghana()).code);
        this.testCountryPhoneNumber("+23400233123", "234", (new Nigeria()).code);
        this.testCountryPhoneNumber("+23500233123", "235", (new Chad()).code);
        this.testCountryPhoneNumber("+23600233123", "236", (new CentralAfricanRepublic()).code);
        this.testCountryPhoneNumber("+23700233123", "237", (new Cameroon()).code);
        this.testCountryPhoneNumber("+23800233123", "238", (new CapeVerde()).code);
        this.testCountryPhoneNumber("+23900233123", "239", (new SaoTomeAndPrincipe()).code);

        this.testCountryPhoneNumber("+24000233123", "240", (new EquatorialGuinea()).code);
        this.testCountryPhoneNumber("+24100233123", "241", (new Gabon()).code);
        this.testCountryPhoneNumber("+24200233123", "242", (new RepublicOfTheCongo()).code);
        this.testCountryPhoneNumber("+24300233123", "243", (new RepublicOfTheCongo()).code);
        this.testCountryPhoneNumber("+24400233123", "244", (new Angola()).code);
        this.testCountryPhoneNumber("+24500233123", "245", (new GuineaBissau()).code);
        this.testCountryPhoneNumber("+24600233123", "246", (new BritishIndianOceanTerritory()).code);
        this.testCountryPhoneNumber("+24700233123", "247", (new AscensionIsland()).code);
        this.testCountryPhoneNumber("+24800233123", "248", (new Seychelles()).code);
        this.testCountryPhoneNumber("+24900233123", "249", (new Sudan()).code);

        this.testCountryPhoneNumber("+25000233123", "250", (new Rwanda()).code);
        this.testCountryPhoneNumber("+25100233123", "251", (new Ethiopia()).code);
        this.testCountryPhoneNumber("+25200233123", "252", (new Somalia()).code);
        this.testCountryPhoneNumber("+25300233123", "253", (new Djibouti()).code);
        this.testCountryPhoneNumber("+25400233123", "254", (new Kenya()).code);
        this.testCountryPhoneNumber("+25500233123", "255", (new Tanzania()).code);
        this.testCountryPhoneNumber("+2552400233123", "25524", (new Zanzibar()).code);
        this.testCountryPhoneNumber("+25600233123", "256", (new Uganda()).code);
        this.testCountryPhoneNumber("+25700233123", "257", (new Burundi()).code);
        this.testCountryPhoneNumber("+25800233123", "258", (new Mozambique()).code);

        this.testCountryPhoneNumber("+26000233123", "260", (new Zambia()).code);
        this.testCountryPhoneNumber("+26100233123", "261", (new Madagascar()).code);
        this.testCountryPhoneNumber("+26200233123", "262", (new Reunion()).code);
        this.testCountryPhoneNumber("+26226900233123", "262269", (new Mayotte()).code);
        this.testCountryPhoneNumber("+26263900233123", "262639", (new Mayotte()).code);
        this.testCountryPhoneNumber("+26300233123", "263", (new Zimbabwe()).code);
        this.testCountryPhoneNumber("+26400233123", "264", (new Namibia()).code);
        this.testCountryPhoneNumber("+26500233123", "265", (new Malawi()).code);
        this.testCountryPhoneNumber("+26600233123", "266", (new Lesotho()).code);
        this.testCountryPhoneNumber("+26700233123", "267", (new Botswana()).code);
        this.testCountryPhoneNumber("+26800233123", "268", (new Eswatini()).code);
        this.testCountryPhoneNumber("+26900233123", "269", (new Comoros()).code);

        this.testCountryPhoneNumber("+2700233123", "27", (new SouthAfrica()).code);
        this.testCountryPhoneNumber("+29000233123", "290", (new SaintHelena()).code);
        this.testCountryPhoneNumber("+290800233123", "2908", (new TristanDaCunha()).code);
        this.testCountryPhoneNumber("+29100233123", "291", (new Eritrea()).code);
        this.testCountryPhoneNumber("+29700233123", "297", (new Aruba()).code);
        this.testCountryPhoneNumber("+29800233123", "298", (new FaroeIslands()).code);
        this.testCountryPhoneNumber("+29900233123", "299", (new Greenland()).code);
    }

    @Test
    public void testAmericasPlan() throws InvalidPhoneException {
        this.testCountryPhoneNumber("+5001238", "500", (new FalklandIslands()).code);
//        this.testCountryPhoneNumber("+5001238", "500", (new SouthGeorgiaAndTheSouthSandwichIslands()).code);//unreachable according to specifications
        this.testCountryPhoneNumber("+5011238", "501", (new Belize()).code);
        this.testCountryPhoneNumber("+5021238", "502", (new Guatemala()).code);
        this.testCountryPhoneNumber("+5031238", "503", (new ElSalvador()).code);
        this.testCountryPhoneNumber("+5041238", "504", (new Honduras()).code);
        this.testCountryPhoneNumber("+5051238", "505", (new Nicaragua()).code);
        this.testCountryPhoneNumber("+5061238", "506", (new CostaRica()).code);
        this.testCountryPhoneNumber("+5071238", "507", (new Panama()).code);
        this.testCountryPhoneNumber("+5081238", "508", (new SaintPierreAndMiquelon()).code);
        this.testCountryPhoneNumber("+5091238", "509", (new Haiti()).code);

        this.testCountryPhoneNumber("+511238", "51", (new Peru()).code);
        this.testCountryPhoneNumber("+521238", "52", (new Mexico()).code);
        this.testCountryPhoneNumber("+531238", "53", (new Cuba()).code);
        this.testCountryPhoneNumber("+541238", "54", (new Argentina()).code);
        this.testCountryPhoneNumber("+551238", "55", (new Brazil()).code);
        this.testCountryPhoneNumber("+561238", "56", (new Chile()).code);
        this.testCountryPhoneNumber("+571238", "57", (new Colombia()).code);
        this.testCountryPhoneNumber("+581238", "58", (new Venezuela()).code);

        this.testCountryPhoneNumber("+5901238", "590", (new Guadeloupe()).code);
        this.testCountryPhoneNumber("+5911238", "591", (new Bolivia()).code);
        this.testCountryPhoneNumber("+5921238", "592", (new Guyana()).code);
        this.testCountryPhoneNumber("+5931238", "593", (new Ecuador()).code);
        this.testCountryPhoneNumber("+5941238", "594", (new FrenchGuiana()).code);
        this.testCountryPhoneNumber("+5951238", "595", (new Paraguay()).code);
        this.testCountryPhoneNumber("+5961238", "596", (new Martinique()).code);
        this.testCountryPhoneNumber("+5971238", "597", (new Suriname()).code);
        this.testCountryPhoneNumber("+5981238", "598", (new Uruguay()).code);
        this.testCountryPhoneNumber("+5991238", "599", (new NetherlandsAntilles()).code);
        this.testCountryPhoneNumber("+59931238", "5993", (new BonaireAndSintEustatiusAndSaba()).code);
        this.testCountryPhoneNumber("+59941238", "5994", (new BonaireAndSintEustatiusAndSaba()).code);
        this.testCountryPhoneNumber("+59951238", "5995", (new SintMaarten()).code);
        this.testCountryPhoneNumber("+59971238", "5997", (new BonaireAndSintEustatiusAndSaba()).code);
        this.testCountryPhoneNumber("+59981238", "5998", (new com.neotech.country.collection.americas.Aruba()).code);
        this.testCountryPhoneNumber("+59991238", "5999", (new Curacao()).code);
    }

    @Test
    public void testEastAsiaAndSpecialServicesPlan() throws InvalidPhoneException {
        this.testCommentaryPhoneNumber("+800023423", "800", "International Freephone (UIFN)");
        this.testCommentaryPhoneNumber("+801023423", "801", "unassigned");
        this.testCommentaryPhoneNumber("+802023423", "802", "unassigned");
        this.testCommentaryPhoneNumber("+803023423", "803", "unassigned");
        this.testCommentaryPhoneNumber("+804023423", "804", "unassigned");
        this.testCommentaryPhoneNumber("+805023423", "805", "unassigned");
        this.testCommentaryPhoneNumber("+806023423", "806", "unassigned");
        this.testCommentaryPhoneNumber("+807023423", "807", "unassigned");
        this.testCommentaryPhoneNumber("+808023423", "808", "reserved for Shared Cost Services");
        this.testCommentaryPhoneNumber("+809023423", "809", "unassigned");
        this.testCommentaryPhoneNumber("+831023423", "83", " unassigned (Reserved for country code expansion)[1]");
        this.testCommentaryPhoneNumber("+851023423", "851", "unassigned");
        this.testCommentaryPhoneNumber("+854023423", "854", "unassigned");
        this.testCommentaryPhoneNumber("+857023423", "857", "unassigned, formerly ANAC satellite service");
        this.testCommentaryPhoneNumber("+858023423", "858", "unassigned, formerly ANAC satellite service");
        this.testCommentaryPhoneNumber("+859023423", "859", "unassigned");

        this.testCommentaryPhoneNumber("+870023423", "870", "Inmarsat \"SNAC\" service");
        this.testCommentaryPhoneNumber("+871023423", "871", "unassigned (formerly used by Inmarsat, Atlantic East), discontinued in 2008");
        this.testCommentaryPhoneNumber("+872023423", "872", "unassigned (formerly used by Inmarsat, Pacific), discontinued in 2008");
        this.testCommentaryPhoneNumber("+873023423", "873", "unassigned (formerly used by Inmarsat, Indian), discontinued in 2008");
        this.testCommentaryPhoneNumber("+874023423", "874", "unassigned (formerly used by Inmarsat, Atlantic West), discontinued 2008");
        this.testCommentaryPhoneNumber("+875023423", "875", "reserved for Maritime Mobile service");
        this.testCommentaryPhoneNumber("+876023423", "876", "reserved for Maritime Mobile service");
        this.testCommentaryPhoneNumber("+877023423", "877", "reserved for Maritime Mobile service");
        this.testCommentaryPhoneNumber("+878023423", "878", "Universal Personal Telecommunications services");
        this.testCommentaryPhoneNumber("+879023423", "879", "reserved for national non-commercial purposes");

        this.testCommentaryPhoneNumber("+881023423", "881", "Global Mobile Satellite System");
        this.testCommentaryPhoneNumber("+882023423", "882", "International Networks");
        this.testCommentaryPhoneNumber("+883023423", "883", "International Networks");
        this.testCommentaryPhoneNumber("+884023423", "884", "unassigned");
        this.testCommentaryPhoneNumber("+885023423", "885", "unassigned");
        this.testCommentaryPhoneNumber("+887023423", "887", "unassigned");
        this.testCommentaryPhoneNumber("+888023423", "888", "Telecommunications for Disaster Relief by OCHA");
        this.testCommentaryPhoneNumber("+889023423", "889", "unassigned");
        this.testCommentaryPhoneNumber("+89023423", "89", "unassigned (Reserved for country code expansion)[1]");

        this.testCountryPhoneNumber("+811238", "81", (new Japan()).code);
        this.testCountryPhoneNumber("+821238", "82", (new SouthKorea()).code);
        this.testCountryPhoneNumber("+841238", "84", (new Vietnam()).code);

        this.testCountryPhoneNumber("+8501238", "850", (new NorthKorea()).code);
        this.testCountryPhoneNumber("+8521238", "852", (new HongKong()).code);
        this.testCountryPhoneNumber("+8531238", "853", (new Macau()).code);
        this.testCountryPhoneNumber("+8551238", "855", (new Cambodia()).code);
        this.testCountryPhoneNumber("+8561238", "856", (new Laos()).code);

        this.testCountryPhoneNumber("+861238", "86", (new China()).code);
        this.testCountryPhoneNumber("+8801238", "880", (new Bangladesh()).code);
        this.testCountryPhoneNumber("+8861238", "886", (new Taiwan()).code);
    }

    @Test
    public void testEuropeanPlan() throws InvalidPhoneException {
//        this.testCommentaryPhoneNumber("+37023423", "37", "Discontinued (was assigned to  East Germany until reunifying with the West. See Germany's country code +49 below)");
//        this.testCommentaryPhoneNumber("+38023423", "38", "Discontinued (was assigned to the  Socialist Federal Republic of Yugoslavia until its break-up)");
        this.testCommentaryPhoneNumber("+384023423", "384", "unassigned");
        this.testCommentaryPhoneNumber("+388023423", "388", "Discontinued (was assigned to the European Telephony Numbering Space)[1][2]");

//        this.testCommentaryPhoneNumber("+42023423", "42", "Discontinued (was assigned to  Czechoslovakia until its breakup)");
        this.testCommentaryPhoneNumber("+422023423", "422", "unassigned");
        this.testCommentaryPhoneNumber("+424023423", "424", "unassigned");
        this.testCommentaryPhoneNumber("+425023423", "425", "unassigned");
        this.testCommentaryPhoneNumber("+426023423", "426", "unassigned");
        this.testCommentaryPhoneNumber("+427023423", "427", "unassigned");
        this.testCommentaryPhoneNumber("+428023423", "428", "unassigned");
        this.testCommentaryPhoneNumber("+429023423", "429", "unassigned");


        this.testCountryPhoneNumber("+401238", "40", (new Romania()).code);
        this.testCountryPhoneNumber("+411238", "41", (new Switzerland()).code);
        this.testCountryPhoneNumber("+4201238", "420", (new CzechRepublic()).code);
        this.testCountryPhoneNumber("+4211238", "421", (new Slovakia()).code);
        this.testCountryPhoneNumber("+4231238", "423", (new Liechtenstein()).code);
        this.testCountryPhoneNumber("+431238", "43", (new Austria()).code);
        this.testCountryPhoneNumber("+441238", "44", (new UnitedKingdom()).code);
        this.testCountryPhoneNumber("+4414811238", "441481", (new Guernsey()).code);
        this.testCountryPhoneNumber("+4415341238", "441534", (new Jersey()).code);
        this.testCountryPhoneNumber("+4416241238", "441624", (new IsleOfMan()).code);
        this.testCountryPhoneNumber("+451238", "45", (new Denmark()).code);
        this.testCountryPhoneNumber("+461238", "46", (new Sweden()).code);
        this.testCountryPhoneNumber("+471238", "47", (new Norway()).code);
        this.testCountryPhoneNumber("+47791238", "4779", (new Svalbard()).code);
        this.testCountryPhoneNumber("+481238", "48", (new Poland()).code);
        this.testCountryPhoneNumber("+491238", "49", (new Germany()).code);

        this.testCountryPhoneNumber("+301238", "30", (new Greece()).code);
        this.testCountryPhoneNumber("+311238", "31", (new Netherlands()).code);
        this.testCountryPhoneNumber("+321238", "32", (new Belgium()).code);
        this.testCountryPhoneNumber("+331238", "33", (new France()).code);
        this.testCountryPhoneNumber("+341238", "34", (new Spain()).code);

        this.testCountryPhoneNumber("+3501238", "350", (new Gibraltar()).code);
        this.testCountryPhoneNumber("+3511238", "351", (new Portugal()).code);
        this.testCountryPhoneNumber("+3521238", "352", (new Luxembourg()).code);
        this.testCountryPhoneNumber("+3531238", "353", (new Ireland()).code);
        this.testCountryPhoneNumber("+3541238", "354", (new Iceland()).code);
        this.testCountryPhoneNumber("+3551238", "355", (new Albania()).code);
        this.testCountryPhoneNumber("+3561238", "356", (new Malta()).code);
        this.testCountryPhoneNumber("+3571238", "357", (new Cyprus()).code);
        this.testCountryPhoneNumber("+3581238", "358", (new Finland()).code);
        this.testCountryPhoneNumber("+358181238", "35818", (new AlandIslands()).code);
        this.testCountryPhoneNumber("+3591238", "359", (new Bulgaria()).code);

        this.testCountryPhoneNumber("+361238", "36", (new Hungary()).code);

        this.testCountryPhoneNumber("+3701238", "370", (new Lithuania()).code);
        this.testCountryPhoneNumber("+3711238", "371", (new Latvia()).code);
        this.testCountryPhoneNumber("+3721238", "372", (new Estonia()).code);
        this.testCountryPhoneNumber("+3731238", "373", (new Moldova()).code);
        this.testCountryPhoneNumber("+3741238", "374", (new Armenia()).code);
        this.testCountryPhoneNumber("+374471238", "37447", (new Artsakh()).code);
        this.testCountryPhoneNumber("+374971238", "37497", (new Artsakh()).code);
        this.testCountryPhoneNumber("+3751238", "375", (new Belarus()).code);
        this.testCountryPhoneNumber("+3761238", "376", (new Andorra()).code);
        this.testCountryPhoneNumber("+3771238", "377", (new Monaco()).code);
        this.testCountryPhoneNumber("+3781238", "378", (new SanMarino()).code);
        this.testCountryPhoneNumber("+3791238", "379", (new VaticanCity()).code);

        this.testCountryPhoneNumber("+3801238", "380", (new Ukraine()).code);
        this.testCountryPhoneNumber("+3811238", "381", (new Serbia()).code);
        this.testCountryPhoneNumber("+3821238", "382", (new Montenegro()).code);
        this.testCountryPhoneNumber("+3831238", "383", (new Kosovo()).code);
        this.testCountryPhoneNumber("+3851238", "385", (new Croatia()).code);
        this.testCountryPhoneNumber("+3861238", "386", (new Slovenia()).code);
        this.testCountryPhoneNumber("+3871238", "387", (new BosniaAndHerzegovina()).code);
        this.testCountryPhoneNumber("+3891238", "389", (new NorthMacedonia()).code);
        this.testCountryPhoneNumber("+391238", "39", (new Italy()).code);
        this.testCountryPhoneNumber("+39066981238", "3906698", (new VaticanCity()).code);
    }

    @Test
    public void testMiddleEastAndSouthAsiaPlan() throws InvalidPhoneException {
        this.testCommentaryPhoneNumber("+969023423", "969", "unassigned – originally  South Yemen, now covered under 967 Yemen (formerly  North Yemen)");
        this.testCommentaryPhoneNumber("+978023423", "978", "unassigned – originally assigned to Dubai, now covered under 971");
        this.testCommentaryPhoneNumber("+979023423", "979", "International Premium Rate Service - originally assigned to Abu Dhabi, now covered under 971");
        this.testCommentaryPhoneNumber("+990023423", "990", "unassigned");
        this.testCommentaryPhoneNumber("+991023423", "991", "International Telecommunications Public Correspondence Service trial (ITPCS)");
        this.testCommentaryPhoneNumber("+997023423", "997", "unassigned");
        this.testCommentaryPhoneNumber("+999023423", "999", "reserved for future global service.");

        this.testCountryPhoneNumber("+901238", "90", (new Turkey()).code);
        this.testCountryPhoneNumber("+903921238", "90392", (new Cyprus()).code);
        this.testCountryPhoneNumber("+911238", "91", (new India()).code);
        this.testCountryPhoneNumber("+921238", "92", (new Pakistan()).code);
        this.testCountryPhoneNumber("+925821238", "92582", (new AzadKashmir()).code);
        this.testCountryPhoneNumber("+925811238", "92581", (new GilgitBaltistan()).code);

        this.testCountryPhoneNumber("+931238", "93", (new Afghanistan()).code);
        this.testCountryPhoneNumber("+941238", "94", (new SriLanka()).code);
        this.testCountryPhoneNumber("+951238", "95", (new Myanmar()).code);

        this.testCountryPhoneNumber("+9601238", "960", (new Maldives()).code);
        this.testCountryPhoneNumber("+9611238", "961", (new Lebanon()).code);
        this.testCountryPhoneNumber("+9621238", "962", (new Jordan()).code);
        this.testCountryPhoneNumber("+9631238", "963", (new Syria()).code);
        this.testCountryPhoneNumber("+9641238", "964", (new Iraq()).code);
        this.testCountryPhoneNumber("+9651238", "965", (new Kuwait()).code);
        this.testCountryPhoneNumber("+9661238", "966", (new SaudiArabia()).code);
        this.testCountryPhoneNumber("+9671238", "967", (new Yemen()).code);
        this.testCountryPhoneNumber("+9681238", "968", (new Oman()).code);

        this.testCountryPhoneNumber("+9701238", "970", (new Palestine()).code);
        this.testCountryPhoneNumber("+9711238", "971", (new UnitedArabEmirates()).code);
        this.testCountryPhoneNumber("+9721238", "972", (new Israel()).code);
        this.testCountryPhoneNumber("+9731238", "973", (new Bahrain()).code);
        this.testCountryPhoneNumber("+9741238", "974", (new Qatar()).code);
        this.testCountryPhoneNumber("+9751238", "975", (new Bhutan()).code);
        this.testCountryPhoneNumber("+9761238", "976", (new Mongolia()).code);
        this.testCountryPhoneNumber("+9771238", "977", (new Nepal()).code);

        this.testCountryPhoneNumber("+981238", "98", (new Iran()).code);

        this.testCountryPhoneNumber("+9921238", "992", (new Tajikistan()).code);
        this.testCountryPhoneNumber("+9931238", "993", (new Turkmenistan()).code);
        this.testCountryPhoneNumber("+9941238", "994", (new Azerbaijan()).code);
        this.testCountryPhoneNumber("+9951238", "995", (new Georgia()).code);
        this.testCountryPhoneNumber("+995341238", "99534", (new SouthOssetia()).code);
        this.testCountryPhoneNumber("+995441238", "99544", (new com.neotech.country.collection.middle.east.Abkhazia()).code);
        this.testCountryPhoneNumber("+9961238", "996", (new Kyrgyzstan()).code);
        this.testCountryPhoneNumber("+9981238", "998", (new Uzbekistan()).code);
    }

    @Test
    public void testNorthAmericaPlan() throws InvalidPhoneException {
        this.testCountryPhoneNumber("+11238", "1", (new UnitedStates()).code);
//        this.testCountryPhoneNumber("+11238", "1", (new Canada()).code);//unreachable
        this.testCountryPhoneNumber("+13401238", "1340", (new UnitedStatesVirginIslands()).code);
        this.testCountryPhoneNumber("+16701238", "1670", (new NorthernMarianaIslands()).code);
        this.testCountryPhoneNumber("+16711238", "1671", (new Guam()).code);
        this.testCountryPhoneNumber("+16841238", "1684", (new AmericanSamoa()).code);
        this.testCountryPhoneNumber("+17871238", "1787", (new PuertoRico()).code);
        this.testCountryPhoneNumber("+19391238", "1939", (new PuertoRico()).code);
        this.testCountryPhoneNumber("+12421238", "1242", (new Bahamas()).code);
        this.testCountryPhoneNumber("+12461238", "1246", (new Barbados()).code);
        this.testCountryPhoneNumber("+12641238", "1264", (new Anguilla()).code);
        this.testCountryPhoneNumber("+12681238", "1268", (new AntiguaAndBarbuda()).code);
        this.testCountryPhoneNumber("+12841238", "1284", (new BritishVirginIslands()).code);
        this.testCountryPhoneNumber("+13451238", "1345", (new CaymanIslands()).code);
        this.testCountryPhoneNumber("+14411238", "1441", (new Bermuda()).code);
        this.testCountryPhoneNumber("+14731238", "1473", (new Grenada()).code);
        this.testCountryPhoneNumber("+16491238", "1649", (new TurksAndCaicosIslands()).code);
        this.testCountryPhoneNumber("+16641238", "1664", (new Montserrat()).code);
        this.testCountryPhoneNumber("+17211238", "1721", (new com.neotech.country.collection.north.american.SintMaarten()).code);
        this.testCountryPhoneNumber("+17581238", "1758", (new SaintLucia()).code);
        this.testCountryPhoneNumber("+17671238", "1767", (new Dominica()).code);
        this.testCountryPhoneNumber("+17841238", "1784", (new SaintVincentAndTheGrenadines()).code);
        this.testCountryPhoneNumber("+18091238", "1809", (new DominicanRepublic()).code);
        this.testCountryPhoneNumber("+18291238", "1829", (new DominicanRepublic()).code);
        this.testCountryPhoneNumber("+18491238", "1849", (new DominicanRepublic()).code);
        this.testCountryPhoneNumber("+18681238", "1868", (new TrinidadAndTobago()).code);
        this.testCountryPhoneNumber("+18691238", "1869", (new SaintKittsAndNevis()).code);
        this.testCountryPhoneNumber("+18761238", "1876", (new Jamaica()).code);
        this.testCountryPhoneNumber("+16581238", "1658", (new Jamaica()).code);
    }

    @Test
    public void testSouthEastAsiaPlan() throws InvalidPhoneException {
        this.testCommentaryPhoneNumber("+671023423", "671", "formerly Guam – Now included in NANP as code +1-671 (See Zone 1, above)");
        this.testCommentaryPhoneNumber("+684023423", "684", "formerly American Samoa – Now included in NANP as code +1-684 (See Zone 1, above)");
        this.testCommentaryPhoneNumber("+693023423", "693", "unassigned");
        this.testCommentaryPhoneNumber("+694023423", "694", "unassigned");
        this.testCommentaryPhoneNumber("+695023423", "695", "unassigned");
        this.testCommentaryPhoneNumber("+696023423", "696", "unassigned");
        this.testCommentaryPhoneNumber("+697023423", "697", "unassigned");
        this.testCommentaryPhoneNumber("+698023423", "698", "unassigned");
        this.testCommentaryPhoneNumber("+699023423", "699", "unassigned");

        this.testCountryPhoneNumber("+601238", "60", (new Malaysia()).code);
        this.testCountryPhoneNumber("+611238", "61", (new Australia()).code);
        this.testCountryPhoneNumber("+61891621238", "6189162", (new CocosIslands()).code);
        this.testCountryPhoneNumber("+61891641238", "6189164", (new ChristmasIsland()).code);
        this.testCountryPhoneNumber("+621238", "62", (new Indonesia()).code);
        this.testCountryPhoneNumber("+631238", "63", (new Philippines()).code);
        this.testCountryPhoneNumber("+641238", "64", (new NewZealand()).code);
//        this.testCountryPhoneNumber("+641238", "64", (new PitcairnIslands()).code);//unreachable
        this.testCountryPhoneNumber("+651238", "65", (new Singapore()).code);
        this.testCountryPhoneNumber("+661238", "66", (new Thailand()).code);

        this.testCountryPhoneNumber("+6701238", "670", (new EastTimor()).code);
        this.testCountryPhoneNumber("+67201238", "672", (new AustralianExternalTerritories()).code);
        this.testCountryPhoneNumber("+67211238", "6721", (new AustralianAntarcticTerritory()).code);
        this.testCountryPhoneNumber("+67231238", "6723", (new NorfolkIsland()).code);
        this.testCountryPhoneNumber("+6731238", "673", (new Brunei()).code);
        this.testCountryPhoneNumber("+6741238", "674", (new Nauru()).code);
        this.testCountryPhoneNumber("+6751238", "675", (new PapuaNewGuinea()).code);
        this.testCountryPhoneNumber("+6761238", "676", (new Tonga()).code);
        this.testCountryPhoneNumber("+6771238", "677", (new SolomonIslands()).code);
        this.testCountryPhoneNumber("+6781238", "678", (new Vanuatu()).code);
        this.testCountryPhoneNumber("+6791238", "679", (new Fiji()).code);

        this.testCountryPhoneNumber("+6801238", "680", (new Palau()).code);
        this.testCountryPhoneNumber("+6811238", "681", (new WallisAndFutuna()).code);
        this.testCountryPhoneNumber("+6821238", "682", (new CookIslands()).code);
        this.testCountryPhoneNumber("+6831238", "683", (new Niue()).code);
        this.testCountryPhoneNumber("+6851238", "685", (new Samoa()).code);
        this.testCountryPhoneNumber("+6861238", "686", (new Kiribati()).code);
        this.testCountryPhoneNumber("+6871238", "687", (new NewCaledonia()).code);
        this.testCountryPhoneNumber("+6881238", "688", (new Tuvalu()).code);
        this.testCountryPhoneNumber("+6891238", "689", (new FrenchPolynesia()).code);

        this.testCountryPhoneNumber("+6901238", "690", (new Tokelau()).code);
        this.testCountryPhoneNumber("+6911238", "691", (new FederatedStatesOfMicronesia()).code);
        this.testCountryPhoneNumber("+6921238", "692", (new MarshallIslands()).code);
    }

    protected void testCommentaryPhoneNumber(String phoneNumber, String resultPhoneCode, String commentaryContent) throws InvalidPhoneException {
        Commentary resultPhone = (Commentary) getResponseEntry(phoneNumber);

        Assert.assertEquals(resultPhoneCode, resultPhone.matchedPhoneCode);
        Assert.assertEquals(commentaryContent, resultPhone.commentContent);
    }

    protected void testCountryPhoneNumber(String phoneNumber, String resultPhoneCode, String countryCode) throws InvalidPhoneException {
        Country resultPhone = (Country) getResponseEntry(phoneNumber);

        Assert.assertEquals(resultPhoneCode, resultPhone.matchedPhoneCode);
        Assert.assertEquals(countryCode, resultPhone.code);
    }

    private ResultEntryInterface getResponseEntry(String phoneNumber) throws InvalidPhoneException {
        return this.collection.getResponseEntry(new RawPhoneEntity(phoneNumber));
    }
}
