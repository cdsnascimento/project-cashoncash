package com.dominos.cashoncash.services;

import com.dominos.cashoncash.dto.CostDTO;
import com.dominos.cashoncash.entities.Cost;
import com.dominos.cashoncash.repositories.CostRepository;
import com.dominos.cashoncash.repositories.StoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CostService {
  
  @Autowired
  private CostRepository repository;

  @Autowired
  private StoreRepository storeRepository;

  @Transactional(readOnly = true)
  public Page<CostDTO> findAll(Pageable pageable) {
    storeRepository.findAll();
    Page<Cost> result = repository.findAll(pageable);
    return result.map(x -> new CostDTO(x));
  }

}
