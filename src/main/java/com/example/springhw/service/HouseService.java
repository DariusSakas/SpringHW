package com.example.springhw.service;

import com.example.springhw.model.House;
import com.example.springhw.repository.HouseRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HouseService {

    private final HouseRepo houseRepo;

    public List<House> getAllHouses() {
        return houseRepo.findAll();
    }

    public House getHouseById(Long id) {
        return houseRepo.findById(id).get();
    }

    public List<House> addNewHouse(House house) {
        houseRepo.save(house);
        return houseRepo.findAll();
    }

    public void updateHouse(House house) {
        houseRepo.save(house);
    }

    public void deleteHouseById(Long id) {
        houseRepo.deleteById(id);
    }
}
