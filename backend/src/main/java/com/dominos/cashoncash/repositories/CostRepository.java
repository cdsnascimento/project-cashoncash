package com.dominos.cashoncash.repositories;

import com.dominos.cashoncash.entities.Cost;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CostRepository extends JpaRepository<Cost, Long> {
  
}
