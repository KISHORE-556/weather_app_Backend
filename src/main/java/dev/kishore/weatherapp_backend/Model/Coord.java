package dev.kishore.weatherapp_backend.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class Coord {

    private Double lon;
    private Double lat;
}
