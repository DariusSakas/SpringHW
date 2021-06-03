package com.example.springhw.config;

import com.example.springhw.model.House;
import com.example.springhw.model.Leaseholder;
import com.example.springhw.repository.HouseRepo;
import com.example.springhw.repository.LeaseholderRepo;
import com.example.springhw.repository.OwnerRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@AllArgsConstructor
public class ManagementConfig {

    private final HouseRepo houseRepo;

    private static House house1 = new House("Kapsu g. 40");
    private static House house2 = new House("Kapsu g. 41");
    private static House house3 = new House("Kapsu g. 42");

    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {
            houseRepo.saveAll(Arrays.asList(house1, house2, house3));
        };
    }
}

