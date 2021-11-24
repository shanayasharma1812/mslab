package com.example.airport.repository;

import com.example.airport.model.air;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface airportRepository extends JpaRepository<air, String> {
}