package com.example.springhw.controller;

import com.example.springhw.model.Resident;
import com.example.springhw.model.Tenant;
import com.example.springhw.service.TenantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/tenants")
@AllArgsConstructor
@RestController
public class TenantController extends ResidentAbstractController {
    private final TenantService tenantService;


    @Override
    <T extends Resident> List<T> getResidents(String q) {
        return null;
    }
}
