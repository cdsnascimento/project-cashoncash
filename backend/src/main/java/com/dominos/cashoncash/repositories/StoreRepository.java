package com.dominos.cashoncash.repositories;

import com.dominos.cashoncash.entities.Store;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
  
}
