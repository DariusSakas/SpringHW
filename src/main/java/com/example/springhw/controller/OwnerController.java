package com.example.springhw.controller;

import com.example.springhw.model.Owner;
import com.example.springhw.model.Resident;
import com.example.springhw.service.OwnerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public List<? extends Resident> getResidents(String pathVariable) {
        log.info("Fetching all OWNERS from DB");
        pathVariable = getAllOwnersPathVariable;
        return ownerService.getAllOwners();
    }



}
