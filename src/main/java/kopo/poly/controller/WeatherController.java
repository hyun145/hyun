package kopo.poly.controller;


import kopo.poly.dto.WeatherDTO;
import kopo.poly.service.IWeatherService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Optional;


@Slf4j
@RequestMapping(value = "/weather")
@RequiredArgsConstructor
@Controller
public class WeatherController {

    private final IWeatherService WeatherService;


    @GetMapping(value = "toDayWeather")
    public String toDayWeather(ModelMap model) throws Exception {
        log.info(this.getClass().getName() + ".toDayWeather Start! ");

        WeatherDTO rDTO = Optional.ofNullable(WeatherService.toDayWeather()).orElseGet(WeatherDTO :: new);



        model.addAttribute("rDTO", rDTO);

        log.info(this.getClass().getName() + ".toDayWeather End! ");

    return "/weather/toDayWeather";


    }





}








