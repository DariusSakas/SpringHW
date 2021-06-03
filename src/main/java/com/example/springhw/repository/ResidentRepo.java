package com.example.springhw.repository;

import com.example.springhw.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepo extends JpaRepository<Resident, Long> {
}
