package com.dominos.cashoncash.controllers;

import java.util.List;

import com.dominos.cashoncash.dto.StoreDTO;
import com.dominos.cashoncash.services.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/stores")
public class StoreController {
  
  @Autowired
  private StoreService service;

  @GetMapping
  public ResponseEntity<List<StoreDTO>> findAll() {
    List<StoreDTO> list = service.findAll();
    return ResponseEntity.ok(list);
  }

}
