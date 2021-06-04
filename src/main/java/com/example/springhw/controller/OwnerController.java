package com.example.springhw.controller;

import com.example.springhw.model.Owner;
import com.example.springhw.model.Resident;
import com.example.springhw.service.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/owners")
@AllArgsConstructor
@RestController
public class OwnerController extends ResidentAbstractController {
private final OwnerService ownerService;

    @Override
    List<Owner> getResidents(String q) {
        return ownerService.getAllOwners();
    }
}
