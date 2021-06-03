package com.example.springhw.repository;

import com.example.springhw.model.Leaseholder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaseholderRepo  extends JpaRepository<Leaseholder, Long> {
}
