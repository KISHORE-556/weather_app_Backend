package dev.kishore.weatherapp_backend.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Weather {
    private Long id;
    private String main;
    private String description;
    private String icon;

}
