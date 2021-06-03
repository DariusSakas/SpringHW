package com.example.springhw.repository;

import com.example.springhw.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepo extends JpaRepository<Owner, Long> {
}
