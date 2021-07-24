package com.dominos.cashoncash.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.dominos.cashoncash.dto.StoreDTO;
import com.dominos.cashoncash.entities.Store;
import com.dominos.cashoncash.repositories.StoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
  
  @Autowired
  private StoreRepository repository;

  public List<StoreDTO> findAll() {
    List<Store> result = repository.findAll();
    return result.stream().map(x -> new StoreDTO(x)).collect(Collectors.toList());
  }

  public Store findById(Long id) {
    Optional<Store> obj = repository.findById(id);
    return obj.get();
  }

}
