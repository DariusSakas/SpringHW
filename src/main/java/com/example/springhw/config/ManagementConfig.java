package com.example.springhw.config;

import com.example.springhw.model.House;
import com.example.springhw.model.Tenant;
import com.example.springhw.model.Owner;
import com.example.springhw.repository.HouseRepo;
import com.example.springhw.repository.OwnerRepo;
import com.example.springhw.repository.TenantRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@AllArgsConstructor
public class ManagementConfig {

    private final HouseRepo houseRepo;
    private final OwnerRepo ownerRepo;
    private final TenantRepo tenantRepo;

    private static House house1 = new House("Kapsu g. 40");
    private static House house2 = new House("Kapsu g. 41");
    private static House house3 = new House("Kapsu g. 42");

    private static Owner resident1 = new Owner("Name1", "Sub1", "Com1", 40, house1);
    private static Owner resident2 = new Owner("Name2", "Sub2", "Com2", 40, house1);

    private static Tenant resident3 = new Tenant("Name3", "Sub3", "Com3", 40,house3);
    private static Tenant resident4 = new Tenant("Name4", "Sub4", "Com4", 40, house2);

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            houseRepo.saveAll(Arrays.asList(house1, house2, house3));
            tenantRepo.saveAll(Arrays.asList( resident3, resident4));
            ownerRepo.saveAll(Arrays.asList(resident1, resident2));
        };
    }
}

