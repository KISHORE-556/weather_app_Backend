package dev.kishore.weatherapp_backend.dtos;

import dev.kishore.weatherapp_backend.Model.Coord;
import dev.kishore.weatherapp_backend.Model.Main;
import dev.kishore.weatherapp_backend.Model.Weather;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Data
public class WeatherDto {
    private Integer cod;
    private Integer visibility;
    private String name;
    private String base;
    private Long dt;
    private Coord coord;
    private Main main;
    private List<Weather> weather;
}
