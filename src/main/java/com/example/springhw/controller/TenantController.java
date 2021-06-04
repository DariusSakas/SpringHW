package com.example.springhw.controller;

import com.example.springhw.model.Owner;
import com.example.springhw.model.Resident;
import com.example.springhw.model.Tenant;
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
public class TenantController  {

    private final TenantService tenantService;

    private static final String getAllTenantsPathVariable = "/get-tenants";



}
