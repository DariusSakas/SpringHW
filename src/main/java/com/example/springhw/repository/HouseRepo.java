package com.example.springhw.repository;

import com.example.springhw.model.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HouseRepo  extends JpaRepository<House, Long> {
}
