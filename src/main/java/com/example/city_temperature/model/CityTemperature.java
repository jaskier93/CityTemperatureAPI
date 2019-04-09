package com.example.city_temperature.model;

public class CityTemperature {

      private TemperatureInfo main;


    public TemperatureInfo getMain() {
        return main;
    }

    public void setMain(TemperatureInfo main) {
        this.main = main;
    }

    public static class TemperatureInfo {
        private double temp;

        public double getTemp() {
            return temp;
        }

        public double getTempInCelsiumDegrees() {
            return (temp -273.15);
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }
    }
}