package dev.kishore.weatherapp_backend.Service;

import dev.kishore.weatherapp_backend.Model.WeatherModel;
import dev.kishore.weatherapp_backend.dtos.WeatherDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    public WeatherDto getWeatherByCity(String city){

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=9908e4b7e16ea15a5f8331fdc0440865";
        WeatherModel weather = restTemplate.getForObject(url, WeatherModel.class);


        WeatherDto dto = new WeatherDto();


        dto.setWeather(weather.getWeather());
        dto.setCoord(weather.getCoord());
        dto.setMain(weather.getMain());
        dto.setName(weather.getName());
        dto.setDt(weather.getDt());
        dto.setBase(weather.getBase());
        dto.setCod(weather.getCod());
        dto.setVisibility(weather.getVisibility());

        return dto;
    }
}
