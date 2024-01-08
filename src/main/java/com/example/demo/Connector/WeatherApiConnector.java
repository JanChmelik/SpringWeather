package com.example.demo.Connector;

import com.example.demo.CityEnum;
import com.example.demo.dto.WeatherApiDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class WeatherApiConnector {
    //    https://api.weatherapi.com/v1/current.json?key=3109f5e424e14ba690695626231312&q=Praha&aqi=no
//    https://api.weatherapi.com/v1/current.json?key=3109f5e424e14ba690695626231312&q=Stornoway&aqi=no
    //rozdelime weather api responcse na casti
    private static String baseUrl = "https://api.weatherapi.com/v1/";
    private static String urlParameters = "current.json?key=";
    private static String APIKey = "3109f5e424e14ba690695626231312";
    public static String url = baseUrl + urlParameters + APIKey + "&q=";
    public WeatherApiDto getWeatherForCity(CityEnum city)
    {
        RestTemplate restTemplate = new RestTemplate();
        URI uri = null;
        try {
            uri = new URI(url + city.toString());
        } catch (URISyntaxException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }
        ResponseEntity<WeatherApiDto>responseEntity = restTemplate.getForEntity(uri, WeatherApiDto.class);
//        ResponseEntity<String> response = restTemplate.getForEntity(uri, String.class); v pripade vraceni stringu
        return responseEntity.getBody(); //metoda porad vraci nejaky string

    }
}
