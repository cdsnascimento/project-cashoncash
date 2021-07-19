package com.dominos.cashoncash.services;

import java.util.List;
import java.util.Optional;

import com.dominos.cashoncash.entities.Store;
import com.dominos.cashoncash.repositories.StoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
  
  @Autowired
  private StoreRepository repository;

  public List<Store> findAll() {
    return repository.findAll();
  }

  public Store findById(Long id) {
    Optional<Store> obj = repository.findById(id);
    return obj.get();
  }

}
