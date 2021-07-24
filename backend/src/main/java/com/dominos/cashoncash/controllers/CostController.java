package com.dominos.cashoncash.controllers;

import com.dominos.cashoncash.dto.CostDTO;
import com.dominos.cashoncash.services.CostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/costs")
public class CostController {

  @Autowired
  private CostService service;
  
  @GetMapping
  public ResponseEntity<Page<CostDTO>> findAll(Pageable pageable) {
    Page<CostDTO> list = service.findAll(pageable);
    return ResponseEntity.ok(list);
  }
}
