package com.ust.airport.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ust.airport.Entity.AirportsEntity;

@Repository
public interface AirportsRepoitory extends JpaRepository<AirportsEntity, Long>{

}
