package com.example.springhw.controller;

import com.example.springhw.model.House;
import com.example.springhw.service.HouseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/houses")
@AllArgsConstructor
@Slf4j
public class HouseController {
    private final HouseService houseService;

    @GetMapping("/")
    public List<House> getAllHouses(){
        log.info("Fethcing all HOUSES from DB");
        return houseService.getAllHouses();
    }
}
