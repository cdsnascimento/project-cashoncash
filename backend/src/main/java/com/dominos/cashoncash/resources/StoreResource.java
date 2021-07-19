package com.dominos.cashoncash.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dominos.cashoncash.entities.Store;

@RestController
@RequestMapping(value = "/stores")
public class StoreResource {
	
	@GetMapping
	public ResponseEntity<Store> findAll() {
		Store s = new Store(19507L, "DOMINOS FLAMENGO", 751314.919128029);
		return ResponseEntity.ok().body(s);
	}

}
