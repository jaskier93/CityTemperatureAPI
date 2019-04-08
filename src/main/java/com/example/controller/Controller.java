package com.example.controller;

import com.example.model.CityTemperature;
import com.example.service.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Controller
public class Controller {
    Service service = new Service();

    @ResponseBody
    @GetMapping("/")
    public String temperatureWarsaw() {
        String tempWarsawUrl = "http://api.openweathermap.org/data/2.5/weather?q=Warszawa&appid=ef2028e98b54649bf1f4c4582631f350";
        RestTemplate restTemplate = new RestTemplate();
        CityTemperature cityTemperature = restTemplate.getForObject(tempWarsawUrl, CityTemperature.class);
        return "" + cityTemperature.getMainTemperature().getCelsiumTemperature();
    }


    @GetMapping("/temperature/city")
    public String temperatureByCity(@RequestParam(required = false) String city, ModelMap modelMap) {
        modelMap.put("temperature", service.getTemperature(city));
        return "index";
    }
}
