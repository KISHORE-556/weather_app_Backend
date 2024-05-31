package dev.kishore.weatherapp_backend.Controller;


import dev.kishore.weatherapp_backend.Service.WeatherService;
import dev.kishore.weatherapp_backend.dtos.WeatherDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    public WeatherService weatherService;

    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @GetMapping("/check")
    public String check()
    {
        return "application running";
    }

    @GetMapping("/{city}")
    public WeatherDto getWeather(@PathVariable("city") String city){
        return weatherService.getWeatherByCity(city);
    }

}
