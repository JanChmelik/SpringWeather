package com.example.demo.Controller;

import com.example.demo.CityEnum;
import com.example.demo.Services.DtoService;
import com.example.demo.dto.WeatherDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WeatherController {
   @Autowired
   DtoService dtoService;
   
   @CrossOrigin
   @RequestMapping("/weather")
   List<WeatherDto> getWeather() {
      List<WeatherDto> weatherDtoList = new ArrayList<>();
      for (CityEnum City : CityEnum.values()) //forEach v JAva
         weatherDtoList.add(dtoService.getWeatherDto(City.name()));
      return weatherDtoList;
   }
   
   @CrossOrigin
   @RequestMapping("/weatherfor/{city}")
      //lze vyhledavat i pomoci jinych variables nez city, lze dohledat na WeatherApi documents
   WeatherDto getWeatherForCity(@PathVariable("city") String city) {
      return dtoService.getWeatherDto(city);
      //c metode getWeatherForCity prevadime enum na string
      
      
   }
   
   
}



