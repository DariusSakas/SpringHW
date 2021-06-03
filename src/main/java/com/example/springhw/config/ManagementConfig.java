package com.example.springhw.config;

import com.example.springhw.model.House;
import com.example.springhw.model.Tenant;
import com.example.springhw.model.Owner;
import com.example.springhw.model.Resident;
import com.example.springhw.repository.HouseRepo;
import com.example.springhw.repository.ResidentRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@AllArgsConstructor
public class ManagementConfig {

    private final HouseRepo houseRepo;
    private final ResidentRepo residentRepo;

    private static House house1 = new House("Kapsu g. 40");
    private static House house2 = new House("Kapsu g. 41");
    private static House house3 = new House("Kapsu g. 42");

    private static Resident resident1 = new Owner("Name1", "Sub1", "Com1", 40);
    private static Resident resident2 = new Owner("Name2", "Sub2", "Com2", 40);

    private static Resident resident3 = new Tenant("Name3", "Sub3", "Com3", 40);
    private static Resident resident4 = new Tenant("Name4", "Sub4", "Com4", 40);

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            houseRepo.saveAll(Arrays.asList(house1, house2, house3));
            residentRepo.saveAll(Arrays.asList(resident1, resident2, resident3, resident4));
        };
    }
}

