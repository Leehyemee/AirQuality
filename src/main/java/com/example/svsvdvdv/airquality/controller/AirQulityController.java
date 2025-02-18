package com.example.svsvdvdv.airquality.controller;

import com.example.svsvdvdv.airquality.service.AirQualityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class AirQulityController {

    // 생성자 주입 방식으로 서비스 객체 생성
    private final AirQualityService airQualityService;

    public AirQulityController(AirQualityService airQualityService) {
        this.airQualityService = airQualityService;
    }


    @GetMapping("/basic")
    public String basic(Model model) throws IOException {
        String result = airQualityService.getAirQualityDataBasic();
        model.addAttribute("airQualityData", result);

        return "airQuality";
    }
}
