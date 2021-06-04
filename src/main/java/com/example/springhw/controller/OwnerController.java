package com.example.springhw.controller;

import com.example.springhw.model.Resident;
import com.example.springhw.service.OwnerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/owner")
@Slf4j
public class OwnerController extends ResidentAbstractController {
private final OwnerService ownerService;

    private static final String getAllOwnersPathVariable = "/get-owners";

    @Override
    List<? extends Resident> getResidents(String q) {
        log.info("Fethcing all Owners from DB");
        q = getAllOwnersPathVariable;
        return ownerService.getAllOwners();
    }
}
