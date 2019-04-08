package com.example.city_temperature.model;

public class CityTemperature {

    private Temperature main;

    public Temperature getMain() {
        return main;
    }

    public void setMain(Temperature main) {
        this.main = main;
    }

    public static class Temperature {
        private double temperature;

        public double getTemperature() {
            return temperature;
        }

        //convert kelvins into celsium temperature
        public double getCelsiumTemperature() {
            return (temperature - 273.15);
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }



    }
}
