package com.dominos.cashoncash.resources;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.dominos.cashoncash.entities.Cost;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/costs")
public class CostResource {

  @GetMapping
  public ResponseEntity<Cost> findAll() throws ParseException {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Date data = formato.parse("01/01/2021");
    Cost c = new Cost(19507, data , 38118.64);
    return ResponseEntity.ok().body(c); 
  }
}
