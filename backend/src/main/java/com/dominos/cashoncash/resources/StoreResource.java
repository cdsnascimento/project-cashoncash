package com.dominos.cashoncash.resources;

import java.util.List;

import com.dominos.cashoncash.entities.Store;
import com.dominos.cashoncash.services.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/stores")
public class StoreResource {

	@Autowired
	private StoreService service;
	
	@GetMapping
	public ResponseEntity<List<Store>> findAll() {
		//Store s = new Store(19507L, "DOMINOS FLAMENGO", 751314.919128029);
		List<Store> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value="/{id}")
	public ResponseEntity<Store> findById(@PathVariable Long id) {
		Store obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	

}
