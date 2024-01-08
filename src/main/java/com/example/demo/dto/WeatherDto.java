package com.example.demo.dto;

public class WeatherDto {
    private String location;
    private double temp_celsius;
    private int rel_humidity;
    private double windSpeed_mps;
    private String windDirection;
    private String weatherDescription;
    private String timeStamp;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getTemp_celsius() {
        return temp_celsius;
    }

    public void setTemp_celsius(double temp_celsius) {
        this.temp_celsius = temp_celsius;
    }

    public int getRel_humidity() {
        return rel_humidity;
    }

    public void setRel_humidity(int rel_humidity) {
        this.rel_humidity = rel_humidity;
    }

    public double getWindSpeed_mps() {
        return windSpeed_mps;
    }

    public void setWindSpeed_mps(double windSpeed_mps) {
        this.windSpeed_mps = windSpeed_mps;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }


    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
