package com.example.springhw.service;

import com.example.springhw.model.Owner;
import com.example.springhw.model.Tenant;
import com.example.springhw.repository.TenantRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TenantService {
    private final TenantRepo tenantRepo;

    public List<Tenant> getAllTenants(){
        List<Tenant> tenants = tenantRepo.findAll();
        return tenants;
    }
}
