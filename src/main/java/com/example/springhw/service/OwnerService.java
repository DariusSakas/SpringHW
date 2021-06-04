package com.example.springhw.service;

import com.example.springhw.model.Owner;
import com.example.springhw.repository.OwnerRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OwnerService {

    private final OwnerRepo ownerRepo;

    public List<Owner> getAllOwners(){
        return ownerRepo.findAll();
    }

}
