package com.example.city_temperature.service;

import com.example.city_temperature.model.CityTemperature;
import org.springframework.web.client.RestTemplate;

public class TempService {

    public String getTemp(String city) {
        if (city != null) {
            String url = "http://api.openweathermap.org/data/2.5/weather?q="
                    + city + "&appid=ef2028e98b54649bf1f4c4582631f350";
            RestTemplate restTemplate = new RestTemplate();
            CityTemperature cityTemperature = restTemplate.getForObject(url, CityTemperature.class);
            return String.format("Temperatura w mieście " + city + " wynosi %.2f", cityTemperature.getMain().getTempInCelsiumDegrees())+" [°C]";

        } else
            return null;
    }
}