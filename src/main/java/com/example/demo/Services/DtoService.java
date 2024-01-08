package com.example.demo.Services;

import com.example.demo.CityEnum;
import com.example.demo.Connector.WeatherApiConnector;
import com.example.demo.dto.WeatherApiDto;
import com.example.demo.dto.WeatherDto;
import org.springframework.stereotype.Service;

@Service
public class DtoService {
    WeatherApiConnector connector = new WeatherApiConnector();

    public WeatherDto getWeatherDto(String city) {
        return transformWeatherDtoFromWeatherApiDto(city);
    }

    private WeatherDto transformWeatherDtoFromWeatherApiDto(String city) {

        WeatherApiDto weatherApiDto = getWeatherApiDto(city);

        WeatherDto weatherDto = new WeatherDto();

        weatherDto.setLocation(weatherApiDto.getLocation().getName());
        weatherDto.setWeatherDescription(weatherApiDto.getCurrent().getCondition().getText());
        weatherDto.setRel_humidity(weatherApiDto.getCurrent().getHumidity());
        weatherDto.setTemp_celsius(weatherApiDto.getCurrent().getTemp_c());
        weatherDto.setWindDirection(weatherApiDto.getCurrent().getWind_dir());
        weatherDto.setTimeStamp(weatherApiDto.getCurrent().getLast_updated());
        weatherDto.setWindSpeed_mps(weatherApiDto.getCurrent().getWind_kph()/3.6);
        return weatherDto;

    }

    private WeatherApiDto getWeatherApiDto(String city) {
        CityEnum cityEnum = CityEnum.valueOf(city.toUpperCase());

        WeatherApiDto weatherApiDto = new WeatherApiDto();

        weatherApiDto = connector.getWeatherForCity(cityEnum);
        return weatherApiDto;
    }

}
