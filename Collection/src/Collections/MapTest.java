package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String,String> countriesMap = new HashMap<String,String>();
        countriesMap.put("tr","Türkiye");
        countriesMap.put("az","Azerbaycan");
        countriesMap.put("ir","iran");

        countriesMap.remove("ir");

        String myCountry = countriesMap.get("az");

        for (String country : countriesMap.values()){
            System.out.println("- Ülke :" + country);
        }

        for (String code : countriesMap.keySet()){
            String country = countriesMap.get(code);
            System.out.println(code + ":" + country);
        }

    }
}
