package com.dominos.cashoncash.config;


import com.dominos.cashoncash.repositories.StoreRepository;
import com.dominos.cashoncash.utils.CreateExcelList;

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

    CreateExcelList imp = new CreateExcelList("C:\\ws\\dominos\\dados\\Stores.xlsx");

    storeRepository.saveAll(imp.readFileExcel());
    
  }
}
