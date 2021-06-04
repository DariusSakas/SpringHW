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

    public List<House> getAllHouses(){
        return houseRepo.findAll();
    }
}
