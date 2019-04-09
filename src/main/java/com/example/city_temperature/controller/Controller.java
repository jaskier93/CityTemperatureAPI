package com.example.city_temperature.controller;

import com.example.city_temperature.model.CityTemperature;
import com.example.city_temperature.service.TempService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;


@org.springframework.stereotype.Controller
public class Controller {

    TempService tempService = new TempService();

   // @ResponseBody
    @GetMapping("/")
    public String index() {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=Warszawa&appid=ef2028e98b54649bf1f4c4582631f350";

        RestTemplate restTemplate = new RestTemplate();

        CityTemperature cityTemperature = restTemplate.getForObject(url, CityTemperature.class);

       // return "" + cityTemperature.getMain().getTempInCelsiumDegrees() + "";
        return "index";
    }

    @GetMapping("/temperature/city")
    public String temperatureByCity(@RequestParam String city, ModelMap modelMap) {
        modelMap.put("temperature", tempService.getTemp(city));
        return "index";
    }
}
