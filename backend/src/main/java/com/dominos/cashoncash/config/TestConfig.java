package com.dominos.cashoncash.config;

import com.dominos.cashoncash.repositories.StoreRepository;
import com.dominos.cashoncash.utils.ImportExcel;

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
    
    // Store s1 = new Store(19507L, "DOMINOS FLAMENGO", 751314.919128029);
    // Store s2 = new Store(19518L, "DOMINOS MIGUEL LEMOS", 751314.919128029);

    ImportExcel imp = new ImportExcel("C:\\ws\\dominos\\dados\\basecoc.xlsx");

    storeRepository.saveAll(imp.listDataExcel());
    
  }
}
