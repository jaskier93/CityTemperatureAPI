package com.example.model;

public class CityTemperature {

    private Temperature mainTemperature;

    public Temperature getMainTemperature() {
        return mainTemperature;
    }

    public void setMainTemperature(Temperature mainTemperature) {
        this.mainTemperature = mainTemperature;
    }

    public static class Temperature {
        private double temperature;

        public double getTemperature() {
            return temperature;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }

        //convert kelvins into celsium temperature
        public double getCelsiumTemperature() {
            return (temperature - 273.15);
        }

    }
}
