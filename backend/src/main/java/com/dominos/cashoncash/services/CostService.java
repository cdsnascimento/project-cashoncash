package com.dominos.cashoncash.services;

import java.util.List;
import java.util.Optional;

import com.dominos.cashoncash.entities.Cost;
import com.dominos.cashoncash.repositories.CostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CostService {
  
  @Autowired
  private CostRepository repository;

  public List<Cost>findAll() {
    return repository.findAll();
  }

  public Cost findById(Long id) {
    Optional<Cost> obj = repository.findById(id);
    return obj.get();
  }

}
