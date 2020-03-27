package com.neotech.country;

import com.neotech.contract.ResultEntryInterface;
import com.neotech.phone.CodeData;
import com.neotech.phone.ZoneCollection;
import com.neotech.phone.di.FullCollection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;

@RunWith(SpringRunner.class)
public class UniqueTests {

    @Test
    public void testUniqueNumbers() throws Throwable {
        FullCollection fullCollection = new FullCollection();
        Field field = fullCollection.getClass().getDeclaredField(
            "supportedZoneCollections"
        );

        field.setAccessible(true);
        HashMap<String, ZoneCollection> supportedZoneCollections = (HashMap<String, ZoneCollection>) field.get(fullCollection);

        field = ZoneCollection.class.getDeclaredField(
                "supportedCodes"
        );
        field.setAccessible(true);

        HashMap<String, Country> existingCountries = new HashMap<>();

        for (ZoneCollection zoneCollection: supportedZoneCollections.values()) {
            List<CodeData> codeDataList = (List<CodeData>) field.get(zoneCollection);

            for (CodeData codeData: codeDataList) {
                ResultEntryInterface country = codeData.getOutput();
                checkCountryDuplicate(existingCountries, country);
            }
        }

    }

    private void checkCountryDuplicate(HashMap<String, Country> existingCountries, ResultEntryInterface country) {
        if (country instanceof Country) {
            Country countryCasted = (Country) country;
            String countryCode = countryCasted.code;
            if (existingCountries.containsKey(countryCode)) {
                Assert.assertEquals(((Country) country).getClass(), existingCountries.get(countryCode).getClass());
            }
            existingCountries.put(countryCode, countryCasted);
        }
    }
}
