package com.example.springhw.controller;

import com.example.springhw.model.House;
import com.example.springhw.service.HouseService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/houses")
@AllArgsConstructor
@Slf4j
public class HouseController {
    private final HouseService houseService;

    @GetMapping()
    public List<House> getAllHouses() {
        log.info("Fethcing all HOUSES from DB");
        return houseService.getAllHouses();
    }

    @GetMapping("/{id}")
    public House getHouseById(@PathVariable Long id) {
        log.info("Fethcing HOUSE by ID from DB");
        return houseService.getHouseById(id);
    }

    @PostMapping()
    public List<House> addNewHouse(@RequestBody House house) {
        log.info("Adding NEW HOUSE to DB");
        return houseService.addNewHouse(house);
    }

    @PutMapping()
    public House updateHouse(@RequestBody House house) {
        log.info("Updating HOUSE to DB");
        houseService.updateHouse(house);
        return getHouseById(house.getId());
    }

    @DeleteMapping("/{id}")
    public List<House> deleteHouseById(@RequestParam Long id) {
        log.info("Deleting HOUSE from DB");
        houseService.deleteHouseById(id);
        return houseService.getAllHouses();
    }
}
