package com.dominos.cashoncash.config;

import java.util.Arrays;

import com.dominos.cashoncash.entities.Store;
import com.dominos.cashoncash.repositories.StoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

  @Autowired
  private StoreRepository storeRepository;

  @Override
  public void run(String... args) throws Exception {
    
    Store s1 = new Store(19507L, "DOMINOS FLAMENGO", 751314.919128029);
    Store s2 = new Store(19518L, "DOMINOS MIGUEL LEMOS", 751314.919128029);

    storeRepository.saveAll(Arrays.asList(s1, s2));
    
  }
}
