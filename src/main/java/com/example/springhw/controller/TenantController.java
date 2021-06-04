package com.example.springhw.controller;

import com.example.springhw.model.Resident;
import com.example.springhw.service.TenantService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/tenant")
@Slf4j
public class TenantController extends ResidentAbstractController {
    private final TenantService tenantService;

    private static final String getAllTenantsPathVariable = "/get-tenants";

    @Override
    List<? extends Resident> getResidents(String q) {
        log.info("Fethcing all TENANTS from DB");
        q = getAllTenantsPathVariable;
        return tenantService.getAllTenants();
    }
}
