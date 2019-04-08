package com.example.service;

import com.example.model.CityTemperature;
import org.springframework.web.client.RestTemplate;

public class Service {

    public String getTemperature(String city) {
        if (city != null) {
            String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city +
                    "&appid=ef2028e98b54649bf1f4c4582631f350";
            RestTemplate restTemplate = new RestTemplate();
            CityTemperature cityTemperature = restTemplate.getForObject(url, CityTemperature.class);
            return String.format("Temperature in city: " + city + "is currently %.2f", cityTemperature.getMainTemperature().getCelsiumTemperature());
        } else {
            return null;
        }

    }
}
